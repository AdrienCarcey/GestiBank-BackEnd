package com.cama.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("demandeCompte")
public abstract class DemandeCompte extends DemandeClient {

	//Attributes
	private int idCompte;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Compte compte;
	
	//Constructors
	public DemandeCompte() {
		super();
	}
	
	public DemandeCompte(Date dateDemande, Date dateTraitement, String statut, int idCompte,
			com.cama.model.Compte compte) {
		super(dateDemande, dateTraitement, statut);
		this.idCompte = idCompte;
		this.compte = compte;
	}

	//Getters & Setters
	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
}