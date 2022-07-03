package com.bocobi.back.models;

import javax.persistence.*;
@Table
@Entity
public class Vaccin {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long idVaccin;

	private String libelleVaccin;

	private String maladieVaccin;
	
	private String descriptionVaccin;

	public long getIdVaccin() {
		return idVaccin;
	}

	public void setIdVaccin(long idVaccin) {
		this.idVaccin = idVaccin;
	}

	public String getLibelleVaccin() {
		return libelleVaccin;
	}

	public void setLibelleVaccin(String libelleVaccin) {
		this.libelleVaccin = libelleVaccin;
	}

	public String getMaladieVaccin() {
		return maladieVaccin;
	}

	public void setMaladieVaccin(String maladieVaccin) {
		this.maladieVaccin = maladieVaccin;
	}

	public String getDescriptionVaccin() {
		return descriptionVaccin;
	}

	public void setDescriptionVaccin(String descriptionVaccin) {
		this.descriptionVaccin = descriptionVaccin;
	}
 
}
