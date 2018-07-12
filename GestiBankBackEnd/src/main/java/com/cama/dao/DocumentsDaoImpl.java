package com.cama.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.Documents;

@Repository("documentsDao")
public class DocumentsDaoImpl extends AbstractDao<Integer, Documents> implements DocumentsDao {

	@Override
	public List<Documents> findAllDocuments() {
		String requete = "select d " + "from Documents as d";
		Query query = getEntityManager().createQuery(requete);
		return (List<Documents>) query.getResultList();
	}

	@Override
	public Documents findDocumentsById(int id) {
		return getByKey(id);
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