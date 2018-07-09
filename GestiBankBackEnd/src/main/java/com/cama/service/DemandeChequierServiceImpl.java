package com.cama.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.DemandeChequierDao;
import com.cama.model.DemandeChequier;

@Service("demandeChequierService")
public class DemandeChequierServiceImpl implements DemandeChequierService {

	@Autowired
	private DemandeChequierDao demandeChequierDAO;
	
	@Override
	public List<DemandeChequier> findAllDemandesClients() {
		return demandeChequierDAO.findAllDemandesClients();
	}

	@Override
	public DemandeChequier findDemandeClientById(int id) {
		return demandeChequierDAO.findDemandeClientById(id);
	}

	@Override
	public void createDemandeClient(DemandeChequier demandeClient) {
		demandeChequierDAO.createDemandeClient(demandeClient);
	}

	@Override
	public void deleteDemandeClient(DemandeChequier demandeClient) {
		demandeChequierDAO.deleteDemandeClient(demandeClient);
	}

	@Override
	public void updateDemandeClient(DemandeChequier demandeClient) {
		demandeChequierDAO.updateDemandeClient(demandeClient);
	}
}