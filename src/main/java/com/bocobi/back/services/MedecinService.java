package com.bocobi.back.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bocobi.back.models.Medecin;

import com.bocobi.back.repos.MedecinRepository;

@Service
public class MedecinService {
	
	 @Autowired
	 private MedecinRepository medecinRepository;

	    public Medecin getMedecins( Long idPersonne) {
	    	return medecinRepository.findById(idPersonne).get(); 
	    }
	    
	    public List<Medecin> getMedecins() {
	        return medecinRepository.findAll();
	    }
	     
	    public List<Medecin> getPatientsByname(String name) {
	        return medecinRepository.findByname(name);
	    }
	    
	    public List<Medecin> getPatientsByIdPersonne(Long idPersonne) {
	        return medecinRepository.findByIdPersonne(idPersonne);
	    }
	  
	    public List<Medecin> getMedecinssByDateEnregistrement(Date dateEnregistrement) {
	        return medecinRepository.findByDateEnregistrement(dateEnregistrement);
	    }
	    

	    public Medecin saveMedecin(Medecin medecin) {
	        Medecin savedPatient = medecinRepository.save(medecin);
	        return savedPatient;
	    }
	    
	    public String updateMedecin(@PathVariable (value = "idPersonne") Long idPersonne, 
				   @RequestBody Medecin medecin) {
	    	Medecin existingMedecin = medecinRepository.findById(idPersonne).orElse(null);
	    	existingMedecin.setEmail(medecin.getEmail());
	    	existingMedecin.setNumTel(medecin.getNumTel());
	    	existingMedecin.setPhotoProfil(medecin.getPhotoProfil());
	    	
	    	medecinRepository.save(existingMedecin);

	    	return "mise a jour effectué avec success";
	 
	    }
	
}
