package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.OperationDebit;

@Repository("operationDebitDao")
public class OperationDebitDaoImpl extends AbstractDao<Integer, OperationDebit> implements OperationDebitDao {

	@Override
	@Transactional
	public List<OperationDebit> findAllOperations() {
		String requete = "select o " + "from OperationDebit as o";
		Query query = getEntityManager().createQuery(requete);
		return (List<OperationDebit>) query.getResultList();
	}

	@Override
	@Transactional
	public OperationDebit findOperationById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createOperation(OperationDebit operation) {
		save(operation);
	}

	@Override
	@Transactional
	public void deleteOperation(OperationDebit operation) {
		delete(getByKey((int) operation.getIdOperation()));
	}

	@Override
	@Transactional
	public void updateOperation(OperationDebit operation) {
		update(operation);
	}
}