package com.bocobi.back.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bocobi.back.models.Caissier;
import com.bocobi.back.repos.CaissierRepository;

@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class CaissierController {
	
	 @Autowired
	 private CaissierRepository caissierRepository;

		@GetMapping("/caissier")
		public List<Caissier> getCaissier(){
			return  caissierRepository.findAll();
		}

		@GetMapping("/caissier/{idCaissier}")
		public Caissier searchById(@PathVariable Long idPersonne) {
			return  caissierRepository.findById(idPersonne).orElse(null);
		}	

		@PostMapping("/Caissier")
		public  Caissier  saveRole(@RequestBody  Caissier caissier) {
			return  caissierRepository.save(caissier);
		}

//		@DeleteMapping("/Caissier/{idCaissier}")
//		public String deleteCaissier(@PathVariable Long idPersonne) {
//			 caissierRepository.deleteById(idPersonne);
//			return "Caissier supprimer avec success !!"+idPersonne;
//		}
//		
		@PutMapping("/updateCaissier/{idCaissier}")
		public String updateCaissier(@PathVariable (value = "idCaissier") Long idCaissier,
								 @RequestBody Caissier caissier) {
			Caissier existingCaissier = caissierRepository.findById(idCaissier).orElse(null);
			existingCaissier.setIdPersonne(caissier.getIdPersonne());
			
			caissierRepository.save(existingCaissier);
			
			return "mise a jour effectué avec success !!";
		}
}
