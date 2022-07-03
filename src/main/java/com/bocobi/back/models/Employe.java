package com.bocobi.back.models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity(name = "Employee")
@Table(name = "employee")
@PrimaryKeyJoinColumn(name = "fk_idPersonne",referencedColumnName = "idPersonne")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "employee_type", length = 3)
public  class Employe extends Personne {
	
	private String gradeEmploye;
	private String matricule;
	private int numTel;
	
	
	
	public String getGradeEmploye() {
		return gradeEmploye;
	}
	public void setGradeEmploye(String gradeEmploye) {
		this.gradeEmploye = gradeEmploye;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public int getNumTel() {
		return numTel;
	}
	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}
}
