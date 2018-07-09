package com.cama.dao;

import java.util.List;

import com.cama.model.OperationCredit;

public interface OperationCreditDao {

	List<OperationCredit> findAllOperations();
	
	OperationCredit findOperationById(int id);
	
	void createOperation(OperationCredit operation);

	void deleteOperation(OperationCredit operation);
	
	void updateOperation(OperationCredit operation);
}