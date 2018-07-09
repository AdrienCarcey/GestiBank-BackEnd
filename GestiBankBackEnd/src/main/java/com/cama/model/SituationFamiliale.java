package com.cama.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SituationFamiliale {
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idSituationFamiliale;
	private String situationMatrimoniale;
	private int nombreEnfants;
	
	//Constructors
	public SituationFamiliale() {
		super();
	}
	
	public SituationFamiliale(String situationMatrimoniale, int nombreEnfants) {
		super();
		this.situationMatrimoniale = situationMatrimoniale;
		this.nombreEnfants = nombreEnfants;
	}
	
	//Getters & Setters
	public int getIdSituationFamiliale() {
		return idSituationFamiliale;
	}

	public void setIdSituationFamiliale(int idSituationFamiliale) {
		this.idSituationFamiliale = idSituationFamiliale;
	}
	
	public String getSituationMatrimoniale() {
		return situationMatrimoniale;
	}

	public void setSituationMatrimoniale(String situationMatrimoniale) {
		this.situationMatrimoniale = situationMatrimoniale;
	}
	
	public int getNombreEnfants() {
		return nombreEnfants;
	}
	
	public void setNombreEnfants(int nombreEnfants) {
		this.nombreEnfants = nombreEnfants;
	}
}