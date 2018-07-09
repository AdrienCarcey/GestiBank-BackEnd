package com.cama.dao;

import java.util.List;

import com.cama.model.DemandeChequier;

public interface DemandeChequierDao {

	List<DemandeChequier> findAllDemandesClients();
	
	DemandeChequier findDemandeClientById(int id);
	
	void createDemandeClient(DemandeChequier demandeClient);

	void deleteDemandeClient(DemandeChequier demandeClient);
	
	void updateDemandeClient(DemandeChequier demandeClient);
}