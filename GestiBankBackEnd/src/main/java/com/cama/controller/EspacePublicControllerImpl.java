package com.cama.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cama.model.DemandeInscription;
import com.cama.model.MessagePublic;
import com.cama.service.EspacePublicService;

@RestController
public class EspacePublicControllerImpl implements EspacePublicController {
	
	@Autowired
	private EspacePublicService espacePublicService;
	
	@Override
	@PostMapping("/public/connexion")
	public ResponseEntity<Hashtable<String, Object>> connexion(@RequestBody String[] connexion) {
		Hashtable<String, Object> hashtable = espacePublicService.connexion(connexion);		
		return new ResponseEntity<>(hashtable, HttpStatus.OK);
	}
	
	@Override
	@PostMapping("/public/adhesion")
	public ResponseEntity<Boolean> demandeInscription(@RequestBody DemandeInscription demandeInscription) {
		return new ResponseEntity<Boolean>(espacePublicService.createDemandeInscription(demandeInscription), HttpStatus.OK);
	}

	@Override
	@PostMapping("/public/message")
	public ResponseEntity<Boolean> createMessagePublic(@RequestBody MessagePublic messagePublic) {
		return new ResponseEntity<Boolean>(espacePublicService.createMessagePublic(messagePublic), HttpStatus.OK);
	}
	
}
