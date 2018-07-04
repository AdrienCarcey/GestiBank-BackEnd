package com.cama.model;

public class Adresse {

	//Attributes
	private int numeroVoie;
	private String libelleVoie;
	private String complementAdresse;
	private int codePostal;
	private String ville;
	private String pays;
	
	//Constructors
	public Adresse() {
		super();
	}
	
	public Adresse(int numeroVoie, String libelleVoie, String complementAdresse, int codePostal, String ville,
			String pays) {
		super();
		this.numeroVoie = numeroVoie;
		this.libelleVoie = libelleVoie;
		this.complementAdresse = complementAdresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}
	
	//Getters & Setters
	public int getNumeroVoie() {
		return numeroVoie;
	}
	
	public void setNumeroVoie(int numeroVoie) {
		this.numeroVoie = numeroVoie;
	}
	
	public String getLibelleVoie() {
		return libelleVoie;
	}
	
	public void setLibelleVoie(String libelleVoie) {
		this.libelleVoie = libelleVoie;
	}
	
	public String getComplementAdresse() {
		return complementAdresse;
	}
	
	public void setComplementAdresse(String complementAdresse) {
		this.complementAdresse = complementAdresse;
	}
	
	public int getCodePostal() {
		return codePostal;
	}
	
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String getPays() {
		return pays;
	}
	
	public void setPays(String pays) {
		this.pays = pays;
	}
}