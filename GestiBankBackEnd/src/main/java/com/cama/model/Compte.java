package com.cama.model;

import java.util.List;

public abstract class Compte {
	
	//Attributes
	private int idCompte;
	private Boolean statut;
	private double solde;
	private List<OperationBancaire> operationsbancaires;
	
	//Constructors
	public Compte() {
		super();
	}
	
	public Compte(int idCompte, Boolean statut, double solde, List<OperationBancaire> operationsbancaires) {
		super();
		this.idCompte = idCompte;
		this.statut = statut;
		this.solde = solde;
		this.operationsbancaires = operationsbancaires;
	}
	
	//Getters & Setters
	public int getIdCompte() {
		return idCompte;
	}
	
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	
	public Boolean getStatut() {
		return statut;
	}
	
	public void setStatut(Boolean statut) {
		this.statut = statut;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public List<OperationBancaire> getOperationsbancaires() {
		return operationsbancaires;
	}
	
	public void setOperationsbancaires(List<OperationBancaire> operationsbancaires) {
		this.operationsbancaires = operationsbancaires;
	}
}