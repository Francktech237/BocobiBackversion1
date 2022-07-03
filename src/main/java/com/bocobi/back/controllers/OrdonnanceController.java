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

import com.bocobi.back.models.Ordonnance;
import com.bocobi.back.repos.OrdonnanceRepository;

@RestController
@RequestMapping("/bocobi")
@CrossOrigin

public class OrdonnanceController {
	 @Autowired
	 private OrdonnanceRepository ordonnanceRepos;

	
	@GetMapping("/Ordonnances")
	public List<Ordonnance> getOrdonnance() {
		return ordonnanceRepos.findAll();
	}

	@GetMapping("/Ordonnances/{idOrdonnance}")
	public Ordonnance searchById(@PathVariable Long idOrdonnance) {
		return ordonnanceRepos.findById(idOrdonnance).orElse(null);
	}	

	@PostMapping("/ordonnance")
	public String saveOrdonnance(@RequestBody Ordonnance ordonnance) {
		return "Ordonnance enregistrer avec success"+ordonnanceRepos.save(ordonnance);
	}

	@DeleteMapping("/ordonnance/{idOrdonnance}")
	public String deleteOrdonnance(@PathVariable Long idOrdonnance) {
		ordonnanceRepos.deleteById(idOrdonnance);
		return "Ordonnance supprimer avec success !!"+idOrdonnance;
	}
}
