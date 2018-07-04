package com.cama.model;

import java.util.Date;

public class OperationDebit extends OperationBancaire {
	
	//Constructors
	public OperationDebit() {
		super();
	}

	public OperationDebit(int idOperation, String libelleOperation, double montantOperation, Date dateOperation) {
		super(idOperation, libelleOperation, montantOperation, dateOperation);
	}
}