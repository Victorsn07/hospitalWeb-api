package com.hospitalweb.HospitalWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalweb.HospitalWeb.model.Paciente;
import com.hospitalweb.HospitalWeb.repository.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	public List<Paciente> buscarPaciente() {
		return pacienteRepository.findAll();
	}
	
	public Paciente salvarPaciente(Paciente paciente){
		return pacienteRepository.save(paciente);
	}
}
