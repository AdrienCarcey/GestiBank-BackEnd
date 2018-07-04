package com.cama.model;

import java.util.Date;

public abstract class Demande {
	
	//Attributes
	int idDemande;
	Date dateDemande;
	Date dateTraitement;
	String statut;
	
	//Constructors
	public Demande() {
		super();
	}
	
	public Demande(int idDemande, Date dateDemande, Date dateTraitement, String statut) {
		super();
		this.idDemande = idDemande;
		this.dateDemande = dateDemande;
		this.dateTraitement = dateTraitement;
		this.statut = statut;
	}
	
	//Getters & Setters
	public int getIdDemande() {
		return idDemande;
	}
	
	public void setIdDemande(int idDemande) {
		this.idDemande = idDemande;
	}
	
	public Date getDateDemande() {
		return dateDemande;
	}
	
	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}
	
	public Date getDateTraitement() {
		return dateTraitement;
	}
	
	public void setDateTraitement(Date dateTraitement) {
		this.dateTraitement = dateTraitement;
	}
	
	public String getStatut() {
		return statut;
	}
	
	public void setStatut(String statut) {
		this.statut = statut;
	}	
}