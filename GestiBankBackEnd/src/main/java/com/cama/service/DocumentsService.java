package com.cama.service;

import java.util.List;

import com.cama.model.Documents;

public interface DocumentsService {
	
	List<Documents> findAllDocuments();
	
	Documents findDocumentsById(int id);
	
	void createDocuments(Documents documents);

	void deleteDocuments(Documents documents);
	
	void updateDocuments(Documents documents);
}