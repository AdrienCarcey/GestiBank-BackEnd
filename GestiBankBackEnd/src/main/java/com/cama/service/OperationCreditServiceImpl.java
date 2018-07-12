package com.cama.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.OperationCreditDao;
import com.cama.model.OperationCredit;

@Service("operationCreditService")
@Transactional
public class OperationCreditServiceImpl implements OperationCreditService {

	@Autowired
	private OperationCreditDao operationCreditDAO;
	
	@Override
	public List<OperationCredit> findAllOperations() {
		return operationCreditDAO.findAllOperations();
	}

	@Override
	public OperationCredit findOperationById(int id) {
		return operationCreditDAO.findOperationById(id);
	}

	@Override
	public void createOperation(OperationCredit operation) {
		operationCreditDAO.createOperation(operation);
	}

	@Override
	public void deleteOperation(OperationCredit operation) {
		operationCreditDAO.deleteOperation(operation);
	}

	@Override
	public void updateOperation(OperationCredit operation) {
		operationCreditDAO.updateOperation(operation);
	}
}