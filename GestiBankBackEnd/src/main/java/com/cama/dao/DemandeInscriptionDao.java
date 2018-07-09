package com.cama.dao;

import java.util.List;

import com.cama.model.DemandeInscription;

public interface DemandeInscriptionDao {

	List<DemandeInscription> findAllDemandesInscriptions();
	
	DemandeInscription findDemandeInscriptionById(int id);
	
	void createDemandeInscription(DemandeInscription demandeInscription);

	void deleteDemandeInscription(DemandeInscription demandeInscription);
	
	void updateDemandeInscription(DemandeInscription demandeInscription);
}