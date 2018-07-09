package com.cama.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("operationCredit")
public class OperationCredit extends OperationBancaire {
	
	//Constructors
	public OperationCredit() {
		super();
	}

	public OperationCredit(String libelleOperation, double montantOperation, Date dateOperation) {
		super(libelleOperation, montantOperation, dateOperation);
	}
}