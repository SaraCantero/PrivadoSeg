package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.PatientCRUD;

@Controller
@RequestMapping("/crud")
public class ControladorCrudPaciente {
	
	@Autowired
	private PatientCRUD pc;
	
	@RequestMapping(value="/lista", method = RequestMethod.GET)
	public String listarPacientes(ModelMap mp) {
		mp.put("usuarios", pc.findAll());
		return "crud/lista";
	}
}
