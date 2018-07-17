package com.cama.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("demandeCompte")
public abstract class DemandeCompte extends DemandeClient {

	//Attributes
	private int idCompte;
	
	//Constructors
	public DemandeCompte() {
		super();
	}
	
	public DemandeCompte(Date dateDemande, Date dateTraitement, String statut, int idCompte) {
		super(dateDemande, dateTraitement, statut);
		this.idCompte = idCompte;
	}
	
	//Getters & Setters
	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
}