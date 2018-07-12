package com.cama.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.OperationDebitDao;
import com.cama.model.OperationDebit;

@Service("operationDebitService")
@Transactional
public class OperationDebitServiceImpl implements OperationDebitService {

	@Autowired
	private OperationDebitDao operationDebitDAO;
	
	@Override
	public List<OperationDebit> findAllOperations() {
		return operationDebitDAO.findAllOperations();
	}

	@Override
	public OperationDebit findOperationById(int id) {
		return operationDebitDAO.findOperationById(id);
	}

	@Override
	public void createOperation(OperationDebit operation) {
		operationDebitDAO.createOperation(operation);
	}

	@Override
	public void deleteOperation(OperationDebit operation) {
		operationDebitDAO.deleteOperation(operation);
	}

	@Override
	public void updateOperation(OperationDebit operation) {
		operationDebitDAO.updateOperation(operation);
	}
}