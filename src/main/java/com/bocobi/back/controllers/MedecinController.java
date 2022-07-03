package com.bocobi.back.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bocobi.back.models.Medecin;
import com.bocobi.back.services.MedecinService;


@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class MedecinController {
	 @Autowired
	 private MedecinService medecinService;

		@GetMapping("/Medecins")
		public List<Medecin> getExamen() {
			return medecinService.getMedecins();
		}

		@GetMapping("/Medecin/{idMedecin}")
		public Medecin searchById(@PathVariable Long idMedecin) {
			return medecinService.getMedecins(idMedecin);
		}	

		@PostMapping("/medecin")
		public Medecin saveMedecin(@RequestBody Medecin medecin) {
			return medecinService.saveMedecin(medecin);
		}

		/*@DeleteMapping("/medecin/{idMedecin}")
		public String deleteMedecin(@PathVariable Long idMedecin) {
			
			return medecinService.;
		}*/
		
		@PutMapping("/updatemedecin/{idMedecin}")
		//bluid update medecin REST API
		public String updateMedecin(@PathVariable (value = "idMedecin") Long idMedecin , 
									   @RequestBody Medecin medecin ) {
			
			
			return medecinService.updateMedecin(idMedecin, medecin);
		}
}
