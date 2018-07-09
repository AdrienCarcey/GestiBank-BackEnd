package com.cama.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("compteRemunerateur")
public class CompteRemunerateur extends Compte {
	
	//Attributes
	private double tauxRenumeration;
	
	//Constructors
	public CompteRemunerateur() {
		super();
	}

	public CompteRemunerateur(Boolean statut, List<OperationBancaire> operationsbancaires, double tauxRenumeration) {
		super(statut, operationsbancaires);
		this.tauxRenumeration = tauxRenumeration;
	}

	//Getters & Setters
	public double getTauxRenumeration() {
		return tauxRenumeration;
	}

	public void setTauxRenumeration(double tauxRenumeration) {
		this.tauxRenumeration = tauxRenumeration;
	}	
}