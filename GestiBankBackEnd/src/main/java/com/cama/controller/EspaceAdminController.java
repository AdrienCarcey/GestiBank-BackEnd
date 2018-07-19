package com.cama.controller;

import java.util.Hashtable;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cama.model.Conseiller;
import com.cama.model.DemandeInscription;

public interface EspaceAdminController {
	
	ResponseEntity<List<Conseiller>> findAllConseillers(int idAdmin);
	
	ResponseEntity<List<DemandeInscription>> findAllDemandes(int idAdmin);
	
	ResponseEntity<Boolean> affectDemandeInscription(List<Integer> affectation);
	
	ResponseEntity<Hashtable<String, String>> dashboard(int idAdmin);
}
