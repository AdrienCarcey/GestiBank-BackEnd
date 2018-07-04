package com.cama.model;

import java.util.Date;

public abstract class OperationBancaire {

	//Attributes
	int idOperation;
	String libelleOperation;
	double montantOperation;
	Date dateOperation;
	
	//Constructors
	public OperationBancaire() {
		super();
	}
	
	public OperationBancaire(int idOperation, String libelleOperation, double montantOperation, Date dateOperation) {
		super();
		this.idOperation = idOperation;
		this.libelleOperation = libelleOperation;
		this.montantOperation = montantOperation;
		this.dateOperation = dateOperation;
	}
	
	//Getters & Setters
	public int getIdOperation() {
		return idOperation;
	}
	
	public void setIdOperation(int idOperation) {
		this.idOperation = idOperation;
	}
	
	public String getLibelleOperation() {
		return libelleOperation;
	}
	
	public void setLibelleOperation(String libelleOperation) {
		this.libelleOperation = libelleOperation;
	}
	
	public double getMontantOperation() {
		return montantOperation;
	}
	
	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}
	
	public Date getDateOperation() {
		return dateOperation;
	}
	
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
}