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


import com.bocobi.back.models.Medicament;
import com.bocobi.back.services.MedicamentService;

@RestController
@RequestMapping("/bocobi")
@CrossOrigin

public class MedicamentController {
	
	 @Autowired
	 private MedicamentService medicamentService;

		@GetMapping("/Medicaments")
		public List<Medicament> getMedicament(){
			return medicamentService.getmedicaments();
		}

		@GetMapping("/Medicament/{idMedicaments}")
		public Medicament getMedicament(@PathVariable("idMedicament") Long idMedicament) {
			return medicamentService.getMedicaments(idMedicament);
		}	

		@PostMapping("/medicament")
		public Medicament createMedicament(@RequestBody Medicament medicament) {
			return medicamentService.saveMedicament(medicament);
		}

		@DeleteMapping("/medicament/{idMedicament}")
		public String deleteMedicament(@PathVariable Long idMedicament) {
			return medicamentService.deleteMedicament(idMedicament);
		}
		@PutMapping("/updateMedicament/{idMedicament}")
		/*bluid update medicament REST API*/ 
		public String updateMedicament(@PathVariable (value = "idMedicament") Long idMedicament , 
									   @RequestBody Medicament medicament ) {
			
			return medicamentService.updateMedicament(idMedicament, medicament);
		}
}
