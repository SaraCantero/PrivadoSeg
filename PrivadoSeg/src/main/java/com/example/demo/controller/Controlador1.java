package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seguro")

public class Controlador1 {
	
	public static final String EXAMPLE_VIEW="list";
	private static final String FORM_VIEW="form";
	private static final String RESULT_VIEW="result";
	
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("quienes", "quienes somos");
		model.addAttribute("texto", "somos una empresa que se dedica a impartir clases particulares");
		model.addAttribute("texto", "tenemos a los mejores profesores para que aprendas mas y mejor");
		return "inicio";
	}
	
	@GetMapping("/que")
	public String que(Model model) {
		
		model.addAttribute("que", "que hacemos");
		model.addAttribute("texto1", "grupos cortos de alumnos para realizar un mejor seguimiento");
		model.addAttribute("texto2", "trabajo con aplicaciones propias desarrolladas por nosotros");
		return "que";
	}
	@GetMapping("/contacto")
	public String contacto(Model model) {
		
		model.addAttribute("contacto", "contacto");
		model.addAttribute("texto1", "Email: sara.cantero#hotmail.com");
		model.addAttribute("texto2", "tlfn: 633211890");
		return "contacto";
	}
	
	
	
	

}

	
	


