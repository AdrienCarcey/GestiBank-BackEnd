package com.cama.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.DemandeInscriptionDao;
import com.cama.model.DemandeInscription;

@Service("demandeInscriptionService")
@Transactional
public class DemandeInscriptionServiceImpl implements DemandeInscriptionService {

	@Autowired
	private DemandeInscriptionDao demandeInscriptionDAO;
	
	@Override
	public List<DemandeInscription> findAllDemandesInscriptions() {
		return demandeInscriptionDAO.findAllDemandesInscriptions();
	}

	@Override
	public DemandeInscription findDemandeInscriptionById(int id) {
		return demandeInscriptionDAO.findDemandeInscriptionById(id);
	}

	@Override
	public void createDemandeInscription(DemandeInscription demandeInscription) {
		demandeInscriptionDAO.createDemandeInscription(demandeInscription);
	}

	@Override
	public void deleteDemandeInscription(DemandeInscription demandeInscription) {
		demandeInscriptionDAO.deleteDemandeInscription(demandeInscription);
	}

	@Override
	public void updateDemandeInscription(DemandeInscription demandeInscription) {
		demandeInscriptionDAO.updateDemandeInscription(demandeInscription);
	}
}