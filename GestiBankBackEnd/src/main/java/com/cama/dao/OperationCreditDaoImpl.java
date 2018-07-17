package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.OperationCredit;

@Repository("operationCreditDao")
public class OperationCreditDaoImpl extends AbstractDao<Integer, OperationCredit> implements OperationCreditDao {

	@Override
	public List<OperationCredit> findAllOperations() {
		String requete = "select o " + "from OperationCredit as o";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<OperationCredit>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public OperationCredit findOperationById(int id) {
		String requete = "select o " + "from OperationCredit as o " + "where o.idOperation = :id";
        Query query = getEntityManager().createQuery(requete);
        query.setParameter("id", id);
        try {
        	return (OperationCredit) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public void createOperation(OperationCredit operation) {
		save(operation);
	}

	@Override
	public void deleteOperation(OperationCredit operation) {
		delete(getByKey((int) operation.getIdOperation()));
	}

	@Override
	public void updateOperation(OperationCredit operation) {
		update(operation);
	}
}