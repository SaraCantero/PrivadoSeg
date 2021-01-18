package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class index {
	
	@GetMapping("/")
	public String redirect() {
		return "redirect:/seguro/";	
	}

}