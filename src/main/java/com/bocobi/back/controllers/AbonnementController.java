package com.bocobi.back.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bocobi.back.models.Abonnement;
import com.bocobi.back.repos.AbonnementRepos;

@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class AbonnementController {
    @Autowired
private AbonnementRepos abonnementRepos;
	
	@GetMapping("/abonnements")
	public List<Abonnement> getAbonnements() {
		return abonnementRepos.findAll();
	}
	
	@GetMapping("/abonnement/{idAb}")
	public Abonnement searchByIdAb(@PathVariable Long idAb) {
		return abonnementRepos.findById(idAb).orElse(null);
	}	
	
	@PostMapping("/abonnement")
	public Abonnement saveAbonnement(@RequestBody Abonnement abonnement) {
		return abonnementRepos.save(abonnement);
	}

	@DeleteMapping("/abonnement/{id}")
	public String deleteAbonnement(@PathVariable Long idAb) {
		abonnementRepos.deleteById(idAb);
		return "Abonnement suprimer avec success !!"+idAb;
	}	
}
