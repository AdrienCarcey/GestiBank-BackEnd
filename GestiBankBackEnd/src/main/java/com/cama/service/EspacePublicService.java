package com.cama.service;

import java.util.Hashtable;

import com.cama.model.DemandeInscription;
import com.cama.model.MessagePublic;

public interface EspacePublicService {
	
	Boolean createDemandeInscription(DemandeInscription demandeInscription);
	
	Boolean createMessagePublic(MessagePublic messagePublic);

	Hashtable<String, Object> connexion(String[] connexion);

}
