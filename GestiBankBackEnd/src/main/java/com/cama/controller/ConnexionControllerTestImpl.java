package com.cama.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConnexionControllerTestImpl implements ConnexionControllerTest {
	
	@Override
	@GetMapping("/connexionTest")
	public ResponseEntity<Boolean> connexion() {
		String answer = "admin";
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
	
	
}