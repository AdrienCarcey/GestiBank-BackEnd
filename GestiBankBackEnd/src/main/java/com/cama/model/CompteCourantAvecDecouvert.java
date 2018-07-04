package com.cama.model;

import java.util.List;

public class CompteCourantAvecDecouvert extends Compte {
	
	//Attributes
	private double entreeMensuelle;
	private double montantDecouvert;
	
	//Constructors
	public CompteCourantAvecDecouvert() {
		super();
	}
	
	public CompteCourantAvecDecouvert(int idCompte, Boolean statut, double solde,
			List<OperationBancaire> operationsbancaires, double entreeMensuelle, double montantDecouvert) {
		super(idCompte, statut, solde, operationsbancaires);
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