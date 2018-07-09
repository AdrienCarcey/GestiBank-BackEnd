package com.cama.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("operationDebit")
public class OperationDebit extends OperationBancaire {
	
	//Constructors
	public OperationDebit() {
		super();
	}

	public OperationDebit(String libelleOperation, double montantOperation, Date dateOperation) {
		super(libelleOperation, montantOperation, dateOperation);
	}
}