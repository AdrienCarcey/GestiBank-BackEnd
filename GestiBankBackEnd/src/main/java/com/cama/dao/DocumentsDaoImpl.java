package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.Documents;

@Repository("documentsDao")
public class DocumentsDaoImpl extends AbstractDao<Integer, Documents> implements DocumentsDao {

	@Override
	@Transactional
	public List<Documents> findAllDocuments() {
		String requete = "select d " + "from Documents as d";
		Query query = getEntityManager().createQuery(requete);
		return (List<Documents>) query.getResultList();
	}

	@Override
	@Transactional
	public Documents findDocumentsById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createDocuments(Documents documents) {
		save(documents);
	}

	@Override
	@Transactional
	public void deleteDocuments(Documents documents) {
		delete(getByKey((int) documents.getIdDocuments()));
	}

	@Override
	@Transactional
	public void updateDocuments(Documents documents) {
		update(documents);
	}
}