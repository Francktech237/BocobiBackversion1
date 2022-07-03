package com.bocobi.back.models;

import javax.persistence.*;

@Table
@Entity
public class Forfait {
   
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long idForfait;

	private String libelleForfait;
    
	private long prixForfait;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "forfait_abonnement",
				joinColumns = {@JoinColumn(name = "forfait_id")},
				inverseJoinColumns = {@JoinColumn(name = "abonnement_id")})
	
	private Abonnement abonnement;

	public Abonnement getAbonnement() {
		return abonnement;
	}

	public void setAbonnement(Abonnement abonnement) {
		this.abonnement = abonnement;
	}

	public Long getIdForfait() {
		return idForfait;
	}

	public void setIdForfait(Long idForfait) {
		this.idForfait = idForfait;
	}

	public String getLibelleForfait() {
		return libelleForfait;
	}

	public void setLibelleForfait(String libelleForfait) {
		this.libelleForfait = libelleForfait;
	}

	public long getPrixForfait() {
		return prixForfait;
	}

	public void setPrixForfait(long prixForfait) {
		this.prixForfait = prixForfait;
	}

}