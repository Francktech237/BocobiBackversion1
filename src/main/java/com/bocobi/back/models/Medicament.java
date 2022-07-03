package com.bocobi.back.models;

import java.util.Date;

import javax.persistence.*;

@Table
@Entity
public class Medicament {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idMedicament;

	private String libelleMedicament;

	private String descriptionMedicament;
	
	private float prixMedicament;
	
	private Date dateFabrication;
	
	private Date datePeremption;
	
	private int quantiteMedicament;

	public Long getIdMedicament() {
		return idMedicament;
	}

	public void setIdMedicament(Long idMedicament) {
		this.idMedicament = idMedicament;
	}

	public String getLibelleMedicament() {
		return libelleMedicament;
	}

	public void setLibelleMedicament(String libelleMedicament) {
		this.libelleMedicament = libelleMedicament;
	}

	public String getDescriptionMedicament() {
		return descriptionMedicament;
	}

	public void setDescriptionMedicament(String descriptionMedicament) {
		this.descriptionMedicament = descriptionMedicament;
	}

	public float getPrixMedicament() {
		return prixMedicament;
	}

	public void setPrixMedicament(float prixMedicament) {
		this.prixMedicament = prixMedicament;
	}

	public Date getDateFabrication() {
		return dateFabrication;
	}

	public void setDateFabrication(Date dateFabrication) {
		this.dateFabrication = dateFabrication;
	}

	public Date getDatePeremption() {
		return datePeremption;
	}

	public void setDatePeremption(Date datePeremption) {
		this.datePeremption = datePeremption;
	}

	public int getQuantiteMedicament() {
		return quantiteMedicament;
	}

	public void setQuantiteMedicament(int quantiteMedicament) {
		this.quantiteMedicament = quantiteMedicament;
	}

}
