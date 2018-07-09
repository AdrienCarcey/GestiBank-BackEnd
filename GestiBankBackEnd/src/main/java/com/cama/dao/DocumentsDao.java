package com.cama.dao;

import java.util.List;

import com.cama.model.Documents;

public interface DocumentsDao {

	List<Documents> findAllDocuments();
	
	Documents findDocumentsById(int id);
	
	void createDocuments(Documents documents);

	void deleteDocuments(Documents documents);
	
	void updateDocuments(Documents documents);
}