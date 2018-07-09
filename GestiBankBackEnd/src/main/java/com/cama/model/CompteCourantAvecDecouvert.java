package com.cama.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("compteCourantAvecDecouvert")
public class CompteCourantAvecDecouvert extends Compte {
	
	//Attributes
	private double entreeMensuelle;
	private double montantDecouvert;
	
	//Constructors
	public CompteCourantAvecDecouvert() {
		super();
	}

	public CompteCourantAvecDecouvert(Boolean statut, List<OperationBancaire> operationsbancaires,
			double entreeMensuelle, double montantDecouvert) {
		super(statut, operationsbancaires);
		this.entreeMensuelle = entreeMensuelle;
		this.montantDecouvert = montantDecouvert;
	}

	//Getters & Setters
	public double getEntreeMensuelle() {
		return entreeMensuelle;
	}
	
	public void setEntreeMensuelle(double entreeMensuelle) {
		this.entreeMensuelle = entreeMensuelle;
	}
	
	public double getMontantDecouvert() {
		return montantDecouvert;
	}
	
	public void setMontantDecouvert(double montantDecouvert) {
		this.montantDecouvert = montantDecouvert;
	}
}