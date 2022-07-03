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

import com.bocobi.back.models.Patient;
import com.bocobi.back.services.PatientService;



@RequestMapping("/bocobi")
@RestController
@CrossOrigin
public class PatientController {
	
	@Autowired
	private PatientService patientService;

	@GetMapping("/Patients")
	public List<Patient> getPatient(){
		return patientService.getpatients();
	}

	@GetMapping("/Patients/{idPersonne}")
	public Patient getPatient(@PathVariable("idPersonne") Long idPersonne) {
		return patientService.getPatients(idPersonne);
	}	

	@PostMapping("/patient")
	public Patient createPatient(@RequestBody Patient patient) {
		return patientService.savePatient(patient);
	}
	
	@PutMapping("/updatePatient/{idPersonne}")
	/*bluid update medicament REST API*/ 
	public String updatePatient(@PathVariable (value = "idPersonne") Long idPersonne , 
								   @RequestBody Patient patient ) {
		
		return patientService.updatePatient(idPersonne, patient);
	}
}
