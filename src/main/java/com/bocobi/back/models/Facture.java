package com.bocobi.back.models;

import javax.persistence.*;

@Table
@Entity
public class Facture {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idFacture;

	private String referenceFacture;
	
	@OneToOne
	private Teleconsultation teleconsultation;

	
	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public String getReferenceFacture() {
		return referenceFacture;
	}

	public void setReferenceFacture(String referenceFacture) {
		this.referenceFacture = referenceFacture;
	}

	public Teleconsultation getTeleconsultation() {
		return teleconsultation;
	}

	public void setTeleconsultation(Teleconsultation teleconsultation) {
		this.teleconsultation = teleconsultation;
	}

}
