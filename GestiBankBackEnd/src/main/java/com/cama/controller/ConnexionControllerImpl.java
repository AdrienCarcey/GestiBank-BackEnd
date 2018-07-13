package com.cama.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cama.service.ConnexionService;


@RestController
public class ConnexionControllerImpl implements ConnexionController {
	
	@Autowired
	private ConnexionService connexionService;
	
	@Override
	@PostMapping("/connexion")
	public ResponseEntity<Hashtable<String, Object>> connexion(@RequestBody String[] connexion) {
		Hashtable<String, Object> hashtable = connexionService.connexion(connexion);		
		return new ResponseEntity<>(hashtable, HttpStatus.OK);
	}

}