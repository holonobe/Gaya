package com.example.demo.app.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String list_get(Model model) {

		List<Task> lists = service.findAll();

		model.addAttribute("lists", lists);

		return "todo/list";
	}

	@PostMapping("/list")
	public String list_post(Model model) {
		return "todo/list";
	}
}
