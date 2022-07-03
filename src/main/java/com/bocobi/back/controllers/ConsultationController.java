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

import com.bocobi.back.models.Consultation;
import com.bocobi.back.repos.ConsultationRepos;


@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class ConsultationController {
	 @Autowired
	 private ConsultationRepos consultationRepos;

		@GetMapping("/Consultations")
		public List<Consultation> getConsultation() {
			return consultationRepos.findAll();
		}

		@GetMapping("/consultations/{idConsult}")
		public Consultation searchById(@PathVariable Long idConsult) {
			return consultationRepos.findById(idConsult).orElse(null);
		}	

		@PostMapping("/consultation")
		public String saveCompte(@RequestBody Consultation consultation) {
			return "consultation enregistrer avec success"+consultationRepos.save(consultation);
		}

		@DeleteMapping("/compte/{idConsult}")
		public String deleteConsultation(@PathVariable Long idConsult) {
			consultationRepos.deleteById(idConsult);
			return "Consultation supprimer avec success !!"+idConsult;
		}
		

}
