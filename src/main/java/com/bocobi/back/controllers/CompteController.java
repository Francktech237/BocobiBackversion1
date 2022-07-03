package com.bocobi.back.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bocobi.back.models.Compte;
import com.bocobi.back.services.CompteService;

@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class CompteController {
	
	 @Autowired
	 private CompteService compteService;

		@GetMapping("/Comptes")
		public List<Compte> getCompte() {
			return compteService.getcomptes();
		}

		@GetMapping("/Comptes/{idCompte}")
		public Compte searchById(@PathVariable Long idCompte) {
			return compteService.getComptes(idCompte);
		}	

		@PostMapping("/compte")
		public String createCompte(@RequestBody Compte compte) {
			
			return compteService.saveCompte(compte);
		}

//		@DeleteMapping("/compte/{idCompte}")
//		public String deleteCompte(@PathVariable Long idCompte) {
//		
//			return compteService.deleteCompte(idCompte);
//		}
		
		/*@PutMapping("/updatecompte/{idCompte}")
		bluid update compte REST API*/ 
		/*public String updateCompte(@PathVariable (value = "idCompte") Long idCompte , 
									   @RequestBody Compte compte ) {
			
			return compteService.updatecompte(idCompte, compte);
		}*/
}
