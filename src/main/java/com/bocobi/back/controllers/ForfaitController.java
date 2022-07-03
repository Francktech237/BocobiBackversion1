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

import com.bocobi.back.models.Forfait;
import com.bocobi.back.repos.ForfaitRepos;



@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class ForfaitController {
	 @Autowired
	 private ForfaitRepos forfaitRepos;
		
		@GetMapping("/forfaits")
		public List<Forfait> getForfait() {
			return forfaitRepos.findAll();
		}
		
		@GetMapping("/forfait/{idForfait}")
		public Forfait searchById(@PathVariable Long idForfait) {
			return forfaitRepos.findById(idForfait).orElse(null);
		}	
		
		@PostMapping("/forfait")
		public Forfait saveAlerte(@RequestBody Forfait forfait) {
			return forfaitRepos.save(forfait);
		}

		@DeleteMapping("/forfait/{id}")
		public String deleteForfait(@PathVariable Long idForfait) {
			forfaitRepos.deleteById(idForfait);
			return "Forfait suprimer avec success !!"+idForfait;
		}	
}
