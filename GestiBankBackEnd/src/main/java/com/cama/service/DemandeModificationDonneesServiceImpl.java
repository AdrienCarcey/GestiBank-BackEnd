package com.cama.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.DemandeModificationDonneesDao;
import com.cama.model.DemandeModificationDonnees;

@Service("demandeModificationDonneesService")
@Transactional
public class DemandeModificationDonneesServiceImpl implements DemandeModificationDonneesService {

	@Autowired
	private DemandeModificationDonneesDao demandeModificationDonneesDAO;
	
	@Override
	public List<DemandeModificationDonnees> findAllDemandesClients() {
		return demandeModificationDonneesDAO.findAllDemandesClients();
	}

	@Override
	public DemandeModificationDonnees findDemandeClientById(int id) {
		return demandeModificationDonneesDAO.findDemandeClientById(id);
	}

	@Override
	public void createDemandeClient(DemandeModificationDonnees demandeClient) {
		demandeModificationDonneesDAO.createDemandeClient(demandeClient);
	}

	@Override
	public void deleteDemandeClient(DemandeModificationDonnees demandeClient) {
		demandeModificationDonneesDAO.deleteDemandeClient(demandeClient);
	}

	@Override
	public void updateDemandeClient(DemandeModificationDonnees demandeClient) {
		demandeModificationDonneesDAO.updateDemandeClient(demandeClient);
	}
}