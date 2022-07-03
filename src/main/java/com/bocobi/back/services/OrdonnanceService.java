package com.bocobi.back.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bocobi.back.models.Ordonnance;
import com.bocobi.back.repos.OrdonnanceRepository;

public class OrdonnanceService {
	 @Autowired
	 private OrdonnanceRepository ordonnanceRepository;

	    public Ordonnance getOrdonnances( Long idOrdonnance) {
	    	return ordonnanceRepository.findById(idOrdonnance).get(); 
	    }
	    
	    public List<Ordonnance> getOrdonnances() {
	        return ordonnanceRepository.findAll();
	    }
	     
	    /*public List<Ordonnance> getOrdonnancesByIdOrdonnance(Long idOrdonnance) {
	        return ordonnanceRepository.findByIdOrdonnance(idOrdonnance);
	    }*/
	  
	   /* public List<Patient> getPatientssByDateEnregistrement(Date dateEnregistrement) {
	        return patientRepository.findByDateEnregistrement(dateEnregistrement);
	    }*/
	    

	    public Ordonnance saveOrdonnance(Ordonnance ordonnance) {
	      Ordonnance savedOrdonnance = ordonnanceRepository.save(ordonnance);
	        return savedOrdonnance;
	    }
	    
	    /*public String deletePatient(final Long idPatient) {
		       Patient deletePatient = patientRepository.deleteByIdPatient(idPatient);
		       return "Medicament supprimer avec success"+idPatient;
	    }*/
	    
}
