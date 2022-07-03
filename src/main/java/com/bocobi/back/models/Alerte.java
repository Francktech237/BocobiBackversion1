package com.bocobi.back.models;

import javax.persistence.*;
@Entity
@Table
public class Alerte {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long idAlerte;

	private String typeAlerte;

    private String codeAlerte;
    
	private String enonceAlerte;


	public Long getIdAlerte() {
		return idAlerte;
	}

	public void setIdAlerte(Long idAlerte) {
		this.idAlerte = idAlerte;
	}

	public String getTypeAlerte() {
		return typeAlerte;
	}

	public void setTypeAlerte(String typeAlerte) {
		this.typeAlerte = typeAlerte;
	}

	public String getCodeAlerte() {
		return codeAlerte;
	}

	public void setCodeAlerte(String codeAlerte) {
		this.codeAlerte = codeAlerte;
	}

	public String getEnonceAlerte() {
		return enonceAlerte;
	}

	public void setEnonceAlerte(String enonceAlerte) {
		this.enonceAlerte = enonceAlerte;
	}

}