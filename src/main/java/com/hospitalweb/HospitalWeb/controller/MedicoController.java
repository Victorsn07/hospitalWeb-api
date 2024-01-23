package com.hospitalweb.HospitalWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalweb.HospitalWeb.model.Medico;
import com.hospitalweb.HospitalWeb.service.MedicoService;

@RestController
@RequestMapping("/medico")
public class MedicoController {
	
	@Autowired
	private MedicoService medicoService;
	
	@GetMapping
	public List<Medico> buscarMedico(){
		return medicoService.buscarMedico();
	}
	
	@PostMapping
	public Medico salvarMedico(@RequestBody Medico medico) {
		return medicoService.salvarMedico(medico);
	}
	
}
