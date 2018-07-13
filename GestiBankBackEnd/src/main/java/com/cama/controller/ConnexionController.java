package com.cama.controller;

import java.util.Hashtable;

import org.springframework.http.ResponseEntity;

public interface ConnexionController {
	
	ResponseEntity<Hashtable<String, Object>> connexion(String[] connexion);
}