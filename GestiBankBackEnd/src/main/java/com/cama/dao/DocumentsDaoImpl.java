package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.Documents;

@Repository("documentsDao")
public class DocumentsDaoImpl extends AbstractDao<Integer, Documents> implements DocumentsDao {

	@Override
	public List<Documents> findAllDocuments() {
		String requete = "select d " + "from Documents as d";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<Documents>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public Documents findDocumentsById(int id) {
		try {
			return getByKey(id);
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public void createDocuments(Documents documents) {
		save(documents);
	}

	@Override
	public void deleteDocuments(Documents documents) {
		delete(getByKey((int) documents.getIdDocuments()));
	}

	@Override
	public void updateDocuments(Documents documents) {
		update(documents);
	}
}