package com.cama.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.OperationDebit;

@Repository("operationDebitDao")
public class OperationDebitDaoImpl extends AbstractDao<Integer, OperationDebit> implements OperationDebitDao {

	@Override
	public List<OperationDebit> findAllOperations() {
		String requete = "select o " + "from OperationDebit as o";
		Query query = getEntityManager().createQuery(requete);
		return (List<OperationDebit>) query.getResultList();
	}

	@Override
	public OperationDebit findOperationById(int id) {
		return getByKey(id);
	}

	@Override
	public void createOperation(OperationDebit operation) {
		save(operation);
	}

	@Override
	public void deleteOperation(OperationDebit operation) {
		delete(getByKey((int) operation.getIdOperation()));
	}

	@Override
	public void updateOperation(OperationDebit operation) {
		update(operation);
	}
}