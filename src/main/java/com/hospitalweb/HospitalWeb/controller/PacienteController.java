package com.hospitalweb.HospitalWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalweb.HospitalWeb.model.Paciente;
import com.hospitalweb.HospitalWeb.service.PacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping
	public List<Paciente> buscarPaciente() {
		return pacienteService.buscarPaciente();
	}
	
	@PostMapping
	public Paciente salvarPaciente(@RequestBody Paciente paciente) {
		return pacienteService.salvarPaciente(paciente);
	}
}
	