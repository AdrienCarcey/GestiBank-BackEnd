package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.OperationCredit;

@Repository("operationCreditDao")
public class OperationCreditDaoImpl extends AbstractDao<Integer, OperationCredit> implements OperationCreditDao {

	@Override
	@Transactional
	public List<OperationCredit> findAllOperations() {
		String requete = "select o " + "from OperationBancaire as o " + "where o.heritage = 'operationCredit'";
		Query query = getEntityManager().createQuery(requete);
		return (List<OperationCredit>) query.getResultList();
	}

	@Override
	@Transactional
	public OperationCredit findOperationById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createOperation(OperationCredit operation) {
		save(operation);
	}

	@Override
	@Transactional
	public void deleteOperation(OperationCredit operation) {
		delete(getByKey((int) operation.getIdOperation()));
	}

	@Override
	@Transactional
	public void updateOperation(OperationCredit operation) {
		update(operation);
	}
}