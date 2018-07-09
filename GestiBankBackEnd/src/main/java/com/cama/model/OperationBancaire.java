package com.cama.model;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="heritage", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("operationBancaire")
public abstract class OperationBancaire {

	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idOperation;
	private String libelleOperation;
	private double montantOperation;
	private Date dateOperation;
	
	//Constructors
	public OperationBancaire() {
		super();
	}
	
	public OperationBancaire(String libelleOperation, double montantOperation, Date dateOperation) {
		super();
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