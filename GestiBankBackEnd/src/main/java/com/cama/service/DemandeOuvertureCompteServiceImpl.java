package com.cama.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.DemandeOuvertureCompteDao;
import com.cama.model.DemandeOuvertureCompte;

@Service("demandeOuvertureCompteService")
public class DemandeOuvertureCompteServiceImpl implements DemandeOuvertureCompteService {

	@Autowired
	private DemandeOuvertureCompteDao demandeOuvertureCompteDAO;
	
	@Override
	public List<DemandeOuvertureCompte> findAllDemandesComptes() {
		return demandeOuvertureCompteDAO.findAllDemandesComptes();
	}

	@Override
	public DemandeOuvertureCompte findDemandeCompteById(int id) {
		return demandeOuvertureCompteDAO.findDemandeCompteById(id);
	}

	@Override
	public void createDemandeCompte(DemandeOuvertureCompte demandeCompte) {
		demandeOuvertureCompteDAO.createDemandeCompte(demandeCompte);
	}

	@Override
	public void deleteDemandeCompte(DemandeOuvertureCompte demandeCompte) {
		demandeOuvertureCompteDAO.deleteDemandeCompte(demandeCompte);
	}

	@Override
	public void updateDemandeCompte(DemandeOuvertureCompte demandeCompte) {
		demandeOuvertureCompteDAO.updateDemandeCompte(demandeCompte);
	}
}