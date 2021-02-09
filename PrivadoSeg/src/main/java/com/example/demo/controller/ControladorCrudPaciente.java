package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Patient;
import com.example.demo.service.PatientService;

@Controller
@RequestMapping("/patient")
public class ControladorCrudPaciente {
	
	@Autowired
	private PatientService ps;
	
	@GetMapping("/listar")
	public String listarPacientes(Model m) {
		List<Patient>patients=ps.listAllPatient();
		m.addAttribute("patients", patients);
		return "listaPaciente";
	}
}
