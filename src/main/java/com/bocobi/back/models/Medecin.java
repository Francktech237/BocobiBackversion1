package com.bocobi.back.models;

import javax.persistence.*;

@Table
@Entity
@DiscriminatorValue("Med")
public class Medecin extends Employe {
    
	//@Id
	//@GeneratedValue
	
	//private long idMedecin;

	private String serviceMedecin;

	private String specialiteMedecin;

	//public long getIdMedecin() {
	//	return idMedecin;
//	}
//	public void setIdMedecin(long idMedecin) {
//		this.idMedecin = idMedecin;
//	}

	public String getServiceMedecin() {
		return serviceMedecin;
	}

	public void setServiceMedecin(String serviceMedecin) {
		this.serviceMedecin = serviceMedecin;
	}

	public String getSpecialiteMedecin() {
		return specialiteMedecin;
	}

	public void setSpecialiteMedecin(String specialiteMedecin) {
		this.specialiteMedecin = specialiteMedecin;
	}

	//@OneToMany(mappedBy ="medecin")
	//@JoinColumn(name = "idMedecin")
	//private ArrayList<Teleconsultation> teleconsultations;

}