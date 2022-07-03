package com.bocobi.back.models;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table
@Entity
public class Allergie {
	@Id
	@GeneratedValue
	private Long idAllergie;
	
	private String LibelleAllergie;
	
	//plusieurs patients peuvent avoir une ou plusieurs allergies
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "patients_allergies",
				joinColumns = {@JoinColumn(name = "patients_fk")},
				inverseJoinColumns = {@JoinColumn(name = "allergies_fk")})
	
	private List<Patient> patients = new ArrayList<>();

	public String getLibelleAllergie() {
		return LibelleAllergie;
	}

	public void setLibelleAllergie(String libelleAllergie) {
		LibelleAllergie = libelleAllergie;
	}

	public Long getIdAllergie() {
		return idAllergie;
	}

	public void setIdAllergie(Long idAllergie) {
		this.idAllergie = idAllergie;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	
}
