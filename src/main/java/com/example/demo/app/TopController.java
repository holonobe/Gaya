package com.example.demo.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopController {

	@RequestMapping("/gaya")
	public String top(Model model) {
		model.addAttribute("title", "Inquiry Form");
		return "top";
	}
}
