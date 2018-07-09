package com.cama.dao;

import java.util.List;

import com.cama.model.OperationDebit;

public interface OperationDebitDao {
	List<OperationDebit> findAllOperations();
	
	OperationDebit findOperationById(int id);
	
	void createOperation(OperationDebit operation);

	void deleteOperation(OperationDebit operation);
	
	void updateOperation(OperationDebit operation);
}