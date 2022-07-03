package com.bocobi.back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import com.bocobi.back.models.Employe;
import com.bocobi.back.repos.EmployeRepository;

@Service
public class EmployeService {

	 @Autowired
	    private EmployeRepository employeRepository;

	    public Employe getemployes( Long idPersonne) {
	    	return employeRepository.findById(idPersonne).get(); 
	    }

	    public List<Employe> getemployes() {
	        return employeRepository.findAll();
	    }
	    
	    public List<Employe> getemployesBygradeEmploye(String gradeEmploye) {
	        return employeRepository.findByGradeEmploye(gradeEmploye);
	    }
	    
	    public List<Employe> getemployesBymatricule(String matricule) {
	        return employeRepository.findByMatricule(matricule);
	    }
	    
	    public String saveEmploye(Employe employe) {
	       employeRepository.save(employe);
	       
	        return "compte enregistrer avec success";
	    }
	    
	    public String updateemploye(@PathVariable (value = "idPersonne") Long idPersonne , 
				   @RequestBody Employe employe ) {
	    	Employe existingEmploye = employeRepository.findById(idPersonne).orElse(null);
	    	existingEmploye.setGradeEmploye(employe.getGradeEmploye());
	    	existingEmploye.setMatricule(employe.getMatricule());
	    	
	    	employeRepository.save(existingEmploye);

	    	return "mise a jour effectué avec success";
	    }
	    
	  
}
