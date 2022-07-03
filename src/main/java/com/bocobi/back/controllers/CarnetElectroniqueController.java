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

import com.bocobi.back.models.CarnetElectronique;
import com.bocobi.back.repos.CarnetElectroniqueRepos;

@RestController
@RequestMapping("/bocobi")
@CrossOrigin
public class CarnetElectroniqueController {
	/* @Autowired
		private CarnetElectroniqueRepos carnetElectroniqueRepos;
		
		@GetMapping("/carnetElectroniques")
		public List<CarnetElectroniqueRepos> getCarnetElectronique() {
			return carnetElectroniqueRepos.findAll();
		}
		
		@GetMapping("/carnetElectronique/{id}")
		public CarnetElectronique searchById(@PathVariable int id) {
			return carnetElectroniqueRepos.findById(id).orElse(null);
		}	
		
		@PostMapping("/CarnetElectronique")
		public CarnetElectronique saveCarnetElectronique(@RequestBody CarnetElectronique carnetElectronique) {
			return carnetElectroniqueRepos.save(carnetElectronique);
		}

		@DeleteMapping("/carnetElectronique/{id}")
		public String deleteCarnetElectronique(@PathVariable long id) {
			carnetElectroniqueRepos.deleteById(id);
			return "Carnet Electronique supprimer avec success !!"+id;
		}*/
}
