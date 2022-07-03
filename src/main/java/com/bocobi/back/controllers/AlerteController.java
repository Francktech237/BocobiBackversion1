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

import com.bocobi.back.models.Alerte;
import com.bocobi.back.repos.AlerteRepos;

@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class AlerteController {
	  @Autowired
	  private AlerteRepos alerteRepos;
		
		@GetMapping("/alertes")
		public List<Alerte> getAlerte() {
			return alerteRepos.findAll();
		}
		
		@GetMapping("/alerte/{idAlerte}")
		public Alerte searchById(@PathVariable Long idAlerte) {
			return alerteRepos.findById(idAlerte).orElse(null);
		}	
		
		@PostMapping("/alerte")
		public Alerte saveAlerte(@RequestBody Alerte alerte) {
			return alerteRepos.save(alerte);
		}

		@DeleteMapping("/alerte/{id}")
		public String deleteAlerte(@PathVariable Long idAlerte) {
			alerteRepos.deleteById(idAlerte);
			return "Abonnement suprimer avec success !!"+idAlerte;
		}	
	

}
