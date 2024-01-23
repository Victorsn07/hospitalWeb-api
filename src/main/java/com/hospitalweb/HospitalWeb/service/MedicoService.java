package com.hospitalweb.HospitalWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalweb.HospitalWeb.model.Medico;
import com.hospitalweb.HospitalWeb.repository.MedicoRepository;

@Service
public class MedicoService {
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	public List<Medico> buscarMedico(){
		return medicoRepository.findAll();
	}
	
	public Medico salvarMedico(Medico medico) {
		return medicoRepository.save(medico);
	}
}
