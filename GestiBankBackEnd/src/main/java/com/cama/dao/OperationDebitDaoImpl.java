package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.OperationDebit;

@Repository("operationDebitDao")
public class OperationDebitDaoImpl extends AbstractDao<Integer, OperationDebit> implements OperationDebitDao {

	@Override
	public List<OperationDebit> findAllOperations() {
		String requete = "select o " + "from OperationDebit as o";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<OperationDebit>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public OperationDebit findOperationById(int id) {
		String requete = "select o " + "from OperationDebit as o " + "where o.idOperation = :id";
        Query query = getEntityManager().createQuery(requete);
        query.setParameter("id", id);
        try {
        	return (OperationDebit) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
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