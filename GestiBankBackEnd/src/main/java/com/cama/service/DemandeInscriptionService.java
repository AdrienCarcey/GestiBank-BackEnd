package com.cama.service;

import java.util.List;

import com.cama.model.DemandeInscription;

public interface DemandeInscriptionService {

	List<DemandeInscription> findAllDemandesInscriptions();
	
	DemandeInscription findDemandeInscriptionById(int id);
	
	void createDemandeInscription(DemandeInscription demandeInscription);

	void deleteDemandeInscription(DemandeInscription demandeInscription);
	
	void updateDemandeInscription(DemandeInscription demandeInscription);
}