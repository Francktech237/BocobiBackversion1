package com.bocobi.back.models;

import javax.persistence.*;

@Table
@Entity
public class Examen {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idExamen;

	private String libelleExamen;
	
	private String typeExamen;
	
	private float ancienTarifExamen;
	
	private String descriptionExamen;
	
	private float nouveauTarifExamen;
	
	
	
	
	
	
	

	public Long getIdExamen() {
		return idExamen;
	}

	public void setIdExamen(Long idExamen) {
		this.idExamen = idExamen;
	}

	public String getLibelleExamen() {
		return libelleExamen;
	}

	public void setLibelleExamen(String libelleExamen) {
		this.libelleExamen = libelleExamen;
	}

	public String getDescriptionExamen() {
		return descriptionExamen;
	}

	public void setDescriptionExamen(String descriptionExamen) {
		this.descriptionExamen = descriptionExamen;
	}

	public String getTypeExamen() {
		return typeExamen;
	}

	public void setTypeExamen(String typeExamen) {
		this.typeExamen = typeExamen;
	}

	public float getAncienTarifExamen() {
		return ancienTarifExamen;
	}

	public void setAncienTarifExamen(float ancienTarifExamen) {
		this.ancienTarifExamen = ancienTarifExamen;
	}

	public float getNouveauTarifExamen() {
		return nouveauTarifExamen;
	}

	public void setNouveauTarifExamen(float nouveauTarifExamen) {
		this.nouveauTarifExamen = nouveauTarifExamen;
	}
	
}
