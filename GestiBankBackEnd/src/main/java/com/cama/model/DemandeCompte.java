package com.cama.model;

import java.util.Date;

public abstract class DemandeCompte extends DemandeClient {

	//Attributes
	int idCompte;
	Compte Compte;
	
	//Constructors
	public DemandeCompte() {
		super();
	}

	public DemandeCompte(int idDemande, Date dateDemande, Date dateTraitement, String statut) {
		super(idDemande, dateDemande, dateTraitement, statut);
	}

	public DemandeCompte(int idClient) {
		super(idClient);
	}

	public DemandeCompte(int idCompte, Compte compte) {
		super();
		this.idCompte = idCompte;
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