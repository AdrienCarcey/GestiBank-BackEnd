package com.cama.model;

public class SituationFamiliale {
	
	//Attributes
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