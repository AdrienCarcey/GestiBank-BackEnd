package com.cama.model;

import java.util.Date;

public class OperationCredit extends OperationBancaire {
	
	//Constructors
	public OperationCredit() {
		super();
	}

	public OperationCredit(int idOperation, String libelleOperation, double montantOperation, Date dateOperation) {
		super(idOperation, libelleOperation, montantOperation, dateOperation);
	}
}