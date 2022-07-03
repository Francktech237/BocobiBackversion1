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

import com.bocobi.back.models.Teleconsultation;
import com.bocobi.back.repos.TeleconsultationRepos;



@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class TeleconsultationController {
	 @Autowired
	 private TeleconsultationRepos teleconsultationRepos;
		
		@GetMapping("/teleconsultations")
		public List<Teleconsultation> getTeleconsultation() {
			return teleconsultationRepos.findAll();
		}
		
		@GetMapping("/teleconsultation/{idTeleconsultation}")
		public Teleconsultation searchById(@PathVariable Long idTeleconsultation) {
			return teleconsultationRepos.findById(idTeleconsultation).orElse(null);
		}	
		
		@PostMapping("/teleconsultation")
		public Teleconsultation saveAlerte(@RequestBody Teleconsultation teleconsultation) {
			return teleconsultationRepos.save(teleconsultation);
		}

		@DeleteMapping("/teleconsultations/{idTeleconsultation}")
		public String deleteTeleconsultation(@PathVariable Long idTeleconsultation) {
			teleconsultationRepos.deleteById(idTeleconsultation);
			return "Teleconsultation suprimer avec success !!"+idTeleconsultation;
		}
}
