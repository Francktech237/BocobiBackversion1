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

import com.bocobi.back.models.Employe;
import com.bocobi.back.services.EmployeService;


@RequestMapping("/bocobi")
@RestController
@CrossOrigin
public class EmployeController {
	
	@Autowired
	private EmployeService employeService;

	@GetMapping("/Employes")
	public List<Employe> getEmploye(){
		return employeService.getemployes();
	}

	@GetMapping("/Employes/{idPersonne}")
	public Employe getEmploye(@PathVariable("idPersonne") Long idPersonne) {
		return employeService.getemployes(idPersonne);
	}	

	@PostMapping("/employe")
	public String createEmploye(@RequestBody Employe employe) {
		return employeService.saveEmploye(employe);
	}
	
	@PutMapping("/updateEmploye/{idPersonne}")
	/*bluid update medicament REST API*/ 
	public String updateEmploye(@PathVariable (value = "idPersonne") Long idPersonne , 
								   @RequestBody Employe employe ) {
		
		return employeService.updateemploye(idPersonne, employe);
	}
}
