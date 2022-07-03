package com.bocobi.back.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bocobi.back.models.Caissier;
import com.bocobi.back.repos.CaissierRepository;




@Service
public class CaissierService {
	 @Autowired
	    private CaissierRepository caissierRepository;

	    public Caissier getcaissiers( Long idPersonne) {
	    	return caissierRepository.findById(idPersonne).get(); 
	    }

	    public List<Caissier> getcaissiers() {
	        return caissierRepository.findAll();
	    }
	    
	    public List<Caissier> getemployesBymatricule(String matricule) {
	        return caissierRepository.findByMatricule(matricule);
	    }
	    
	    public List<Caissier> getMedecinssByDateEnregistrement(Date dateEnregistrement) {
	        return caissierRepository.findByDateEnregistrement(dateEnregistrement);
	    }
	    
	    public String saveCaissier(Caissier caissier) {
	       caissierRepository.save(caissier);
	       
	        return "caissier enregistrer avec success";
	    }
	    
	    public String updatecaissier(@PathVariable (value = "idPersonne") Long idPersonne , 
				   @RequestBody Caissier caissier ) {
	    	Caissier existingCaissier = caissierRepository.findById(idPersonne).orElse(null);
	    	existingCaissier.setEmail(caissier.getEmail());
	    	existingCaissier.setNumTel(caissier.getNumTel());
	    	existingCaissier.setPhotoProfil(caissier.getPhotoProfil());
	    	
	    	caissierRepository.save(existingCaissier);

	    	return "mise a jour effectué avec success";
	    }
}
