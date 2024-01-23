package com.hospitalweb.HospitalWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalweb.HospitalWeb.model.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
