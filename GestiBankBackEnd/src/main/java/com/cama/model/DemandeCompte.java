package com.cama.model;

import java.util.Date;

public abstract class DemandeCompte extends DemandeClient {

	//Attributes
	private int idCompte;
	private Compte Compte;
	
	//Constructors
	public DemandeCompte() {
		super();
	}
	
	public DemandeCompte(int idDemande, Date dateDemande, Date dateTraitement, String statut, int idCompte,
			com.cama.model.Compte compte) {
		super(idDemande, dateDemande, dateTraitement, statut);
		this.idCompte = idCompte;
		Compte = compte;
	}
	
	//Getters & Setters
	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public Compte getCompte() {
		return Compte;
	}

	public void setCompte(Compte compte) {
		Compte = compte;
	}
}