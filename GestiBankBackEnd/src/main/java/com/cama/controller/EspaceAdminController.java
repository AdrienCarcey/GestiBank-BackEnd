package com.cama.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cama.model.DemandeInscription;

public interface EspaceAdminController {
	
	ResponseEntity<List<DemandeInscription>> findAllDemandes(int idAdmin);
}
