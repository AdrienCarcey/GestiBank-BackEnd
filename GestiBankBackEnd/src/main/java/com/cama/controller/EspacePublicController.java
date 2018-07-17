package com.cama.controller;


import java.util.Hashtable;

import org.springframework.http.ResponseEntity;
import com.cama.model.DemandeInscription;
import com.cama.model.MessagePublic;

public interface EspacePublicController {
	
	ResponseEntity<Boolean> demandeInscription(DemandeInscription demandeInscription);
	
	ResponseEntity<Boolean> createMessagePublic(MessagePublic messagePublic);

	ResponseEntity<Hashtable<String, Object>> connexion(String[] connexion);
	
}
