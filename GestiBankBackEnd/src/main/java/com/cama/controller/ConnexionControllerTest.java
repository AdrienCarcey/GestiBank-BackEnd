package com.cama.controller;

import org.springframework.http.ResponseEntity;

public interface ConnexionControllerTest {
	
	ResponseEntity<Object[]> connexion(String[] connexion);
}