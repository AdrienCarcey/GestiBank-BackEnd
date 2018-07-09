package com.cama.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.DemandeFermetureCompteDao;
import com.cama.model.DemandeFermetureCompte;

@Service("demandeFermetureCompteService")
public class DemandeFermetureCompteServiceImpl implements DemandeFermetureCompteService {

	@Autowired
	private DemandeFermetureCompteDao demandeFermetureCompteDAO;
	
	@Override
	public List<DemandeFermetureCompte> findAllDemandesComptes() {
		return demandeFermetureCompteDAO.findAllDemandesComptes();
	}

	@Override
	public DemandeFermetureCompte findDemandeCompteById(int id) {
		return demandeFermetureCompteDAO.findDemandeCompteById(id);
	}

	@Override
	public void createDemandeCompte(DemandeFermetureCompte demandeCompte) {
		demandeFermetureCompteDAO.createDemandeCompte(demandeCompte);
	}

	@Override
	public void deleteDemandeCompte(DemandeFermetureCompte demandeCompte) {
		demandeFermetureCompteDAO.deleteDemandeCompte(demandeCompte);
	}

	@Override
	public void updateDemandeCompte(DemandeFermetureCompte demandeCompte) {
		demandeFermetureCompteDAO.updateDemandeCompte(demandeCompte);
	}
}