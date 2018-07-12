package com.cama.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.DocumentsDao;
import com.cama.model.Documents;

@Service("doucmentsService")
@Transactional
public class DocumentsServiceImpl implements DocumentsService {

	@Autowired
	private DocumentsDao documentsDAO;
	
	@Override
	public List<Documents> findAllDocuments() {
		return documentsDAO.findAllDocuments();
	}

	@Override
	public Documents findDocumentsById(int id) {
		return documentsDAO.findDocumentsById(id);
	}

	@Override
	public void createDocuments(Documents documents) {
		documentsDAO.createDocuments(documents);
	}

	@Override
	public void deleteDocuments(Documents documents) {
		documentsDAO.deleteDocuments(documents);
	}

	@Override
	public void updateDocuments(Documents documents) {
		documentsDAO.updateDocuments(documents);
	}
}