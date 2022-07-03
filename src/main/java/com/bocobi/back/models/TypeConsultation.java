package com.bocobi.back.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class TypeConsultation {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idConsultation;
		
	private String TypeConsultation;
	
	private int prixConsultation;
	

	@OneToMany(cascade = CascadeType.ALL,mappedBy ="typeConsultation")
	private List<Consultation> consultation = new ArrayList<>();
	
	public Long getIdConsultation() {
		return idConsultation;
	}
	public void setIdConsultation(Long idConsultation) {
		this.idConsultation = idConsultation;
	}
	public String getTypeConsultation() {
		return TypeConsultation;
	}
	public void setTypeConsultation(String typeConsultation) {
		TypeConsultation = typeConsultation;
	}
	public int getPrixConsultation() {
		return prixConsultation;
	}
	public void setPrixConsultation(int prixConsultation) {
		this.prixConsultation = prixConsultation;
	}
	public List<Consultation> getConsultation() {
		return consultation;
	}
	public void setConsultation(List<Consultation> consultation) {
		this.consultation = consultation;
	}
}
