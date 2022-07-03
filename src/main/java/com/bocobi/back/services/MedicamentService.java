package com.bocobi.back.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bocobi.back.models.Medicament;
import com.bocobi.back.repos.MedicamentRepository;

import lombok.Data;

@Service
public class MedicamentService {
	 @Autowired
	    private MedicamentRepository medicamentRepository;

	    public Medicament getMedicaments(final Long idMedicament) {
	    	return medicamentRepository.findById(idMedicament).get(); 
	    }

	    public List<Medicament> getmedicaments() {
	        return medicamentRepository.findAll();
	    }
	    
	    public List<Medicament> getMedicamentsByPrixMedicament(Float prixMedicament) {
	        return medicamentRepository.findByPrixMedicament(prixMedicament);
	    }
	    
	    public List<Medicament> getMedicamentsBylibelle(String libelleMedicament) {
	        return medicamentRepository.findByLibelleMedicament(libelleMedicament);
	    }
	  
	    public List<Medicament> getMedicamentsByDate(Date datePeremption) {
	        return medicamentRepository.findByDatePeremption(datePeremption);
	    }
	    

	    public String deleteMedicament(final Long idMedicament) {
	       Medicament deleteMedicament = medicamentRepository.deleteByIdMedicament(idMedicament);
	       return "Medicament supprimer avec success"+idMedicament;
	    }

	    public Medicament saveMedicament(Medicament medicament) {
	        Medicament savedMedicament = medicamentRepository.save(medicament);
	        return savedMedicament;
	    }
	    
	    public String updateMedicament(@PathVariable (value = "idMedicament") Long idMedicament , 
				   @RequestBody Medicament medicament ) {
	    	Medicament existingMedicament = medicamentRepository.findById(idMedicament).orElse(null);
	    	existingMedicament.setDateFabrication(medicament.getDateFabrication());
	    	existingMedicament.setDatePeremption(medicament.getDatePeremption());
	    	existingMedicament.setDescriptionMedicament(medicament.getDescriptionMedicament());
	    	existingMedicament.setLibelleMedicament(medicament.getLibelleMedicament());
	    	existingMedicament.setPrixMedicament(medicament.getPrixMedicament());
	    	existingMedicament.setQuantiteMedicament(medicament.getQuantiteMedicament());

	    	medicamentRepository.save(existingMedicament);

	    	return "mise a jour effectué avec success";
	    }
	    
	  
}
