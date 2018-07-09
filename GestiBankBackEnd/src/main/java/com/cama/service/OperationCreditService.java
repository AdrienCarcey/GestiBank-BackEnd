package com.cama.service;

import java.util.List;

import com.cama.model.OperationCredit;

public interface OperationCreditService {

	List<OperationCredit> findAllOperations();
	
	OperationCredit findOperationById(int id);
	
	void createOperation(OperationCredit operation);

	void deleteOperation(OperationCredit operation);
	
	void updateOperation(OperationCredit operation);
}