package com.example.demo.app.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;

@Controller
@RequestMapping("/gaya/todo")
public class TodoController {

	@Autowired
	private TaskService service;

	@GetMapping("/list")
	public String list_get(TaskForm taskForm, Model model) {

		List<Task> lists = service.findAll();

		model.addAttribute("lists", lists);
		model.addAttribute("taskForm", taskForm);


		return "todo/list";
	}

	@PostMapping("/list")
	public String list_post(Model model) {
		return "todo/list";
	}

	@PostMapping("/insert")
	public String insert(@Validated TaskForm taskForm, BindingResult result, Model model) {

		if(result.hasErrors()) {
			List<Task> lists = service.findAll();
			model.addAttribute("lists", lists);
			return "todo/list";
		}

		service.insert(taskForm);

		return "redirect:/gaya/todo/list";
	}
}
