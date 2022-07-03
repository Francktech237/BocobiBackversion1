package com.bocobi.back.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Lab")
public class Laborantin extends Employe {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long idLaborantin;
	
	private String specialiteLaborantin;
	

//	public Long getIdLaborantin() {
//		return idLaborantin;
//	}
//
//	public void setIdLaborantin(Long idLaborantin) {
//		this.idLaborantin = idLaborantin;
//	}
//
	public String getSpecialiteLaborantin() {
		return specialiteLaborantin;
	}

	public void setSpecialiteLaborantin(String specialiteLaborantin) {
		this.specialiteLaborantin = specialiteLaborantin;
	}
	
}
