package com.cama.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.DemandeRIBDao;
import com.cama.model.DemandeRIB;

@Service("demandeRIBService")
@Transactional
public class DemandeRIBServiceImpl implements DemandeRIBService {

	@Autowired
	private DemandeRIBDao demandeRIBDAO;
	
	@Override
	public List<DemandeRIB> findAllDemandesClients() {
		return demandeRIBDAO.findAllDemandesClients();
	}

	@Override
	public DemandeRIB findDemandeClientById(int id) {
		return demandeRIBDAO.findDemandeClientById(id);
	}

	@Override
	public void createDemandeClient(DemandeRIB demandeClient) {
		demandeRIBDAO.createDemandeClient(demandeClient);
	}

	@Override
	public void deleteDemandeClient(DemandeRIB demandeClient) {
		demandeRIBDAO.deleteDemandeClient(demandeClient);
	}

	@Override
	public void updateDemandeClient(DemandeRIB demandeClient) {
		demandeRIBDAO.updateDemandeClient(demandeClient);
	}
}