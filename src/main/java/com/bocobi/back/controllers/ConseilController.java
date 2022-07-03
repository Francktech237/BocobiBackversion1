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

import com.bocobi.back.models.Conseil;
import com.bocobi.back.repos.ConseilRepos;

@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class ConseilController {
	 @Autowired
	 private ConseilRepos conseilRepos;
		
		@GetMapping("/Conseils")
		public List<Conseil> getAlerte() {
			return conseilRepos.findAll();
		}
		
		@GetMapping("/Conseil/{idConseil}")
		public Conseil searchById(@PathVariable Long idConseil) {
			return conseilRepos.findById(idConseil).orElse(null);
		}	
		
		@PostMapping("/conseil")
		public Conseil saveConseil(@RequestBody Conseil conseil) {
			return conseilRepos.save(conseil);
		}

		@DeleteMapping("/conseil/{id}")
		public String deleteAlerte(@PathVariable Long idConseil) {
			conseilRepos.deleteById(idConseil);
			return "Conseil supprimer avec success !!"+idConseil;
		}
}
