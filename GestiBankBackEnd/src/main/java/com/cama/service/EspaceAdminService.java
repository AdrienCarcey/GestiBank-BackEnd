package com.cama.service;

import java.util.Hashtable;
import java.util.List;

import com.cama.model.Conseiller;
import com.cama.model.DemandeInscription;

public interface EspaceAdminService {
	
	List<Conseiller> findAllConseillers(int idAdmin);
	
	List<DemandeInscription> findAllDemandes(int idAdmin);
	
	Boolean affectDemandeInscription(List<Integer> affectation);
	
	Hashtable<String, String> dashboard(int idAdmin);
}
