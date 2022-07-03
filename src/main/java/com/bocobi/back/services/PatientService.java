package com.bocobi.back.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bocobi.back.models.Patient;
import com.bocobi.back.repos.PatientRepository;

@Service
public class PatientService {
	
	 @Autowired
	 private PatientRepository patientRepository;

	    public Patient getPatients( Long idPersonne) {
	    	return patientRepository.findById(idPersonne).get(); 
	    }
	    
	    public List<Patient> getpatients() {
	        return patientRepository.findAll();
	    }
	     
	    public List<Patient> getPatientsByname(String name) {
	        return patientRepository.findByname(name);
	    }
	    
	    public List<Patient> getPatientsByIdPersonne(Long idPersonne) {
	        return patientRepository.findByIdPersonne(idPersonne);
	    }
	  
	    public List<Patient> getPatientssByDateEnregistrement(Date dateEnregistrement) {
	        return patientRepository.findByDateEnregistrement(dateEnregistrement);
	    }
	    

	    public Patient savePatient(Patient patient) {
	        Patient savedPatient = patientRepository.save(patient);
	        return savedPatient;
	    }
	    
	    public String updatePatient(@PathVariable (value = "idPersonne") Long idPersonne, 
				   @RequestBody Patient patient) {
	    	Patient existingPatient = patientRepository.findById(idPersonne).orElse(null);
	    	existingPatient.setEmail(patient.getEmail());
	    	existingPatient.setNumTel(patient.getNumTel());
	    	existingPatient.setPhotoProfil(patient.getPhotoProfil());
	    	
	    	patientRepository.save(existingPatient);

	    	return "mise a jour effectué avec success";
	 
	    }
	
	    
}
