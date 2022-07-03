package com.bocobi.back.repos;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bocobi.back.models.Patient;

@Repository
public interface PatientRepository extends PersonneRepository<Patient> {
	
	List<Patient> findByname(String name);

	List<Patient> findByDateEnregistrement(Date dateEnregistrement);

	List<Patient> findByIdPersonne(Long idPersonne);

}
		
