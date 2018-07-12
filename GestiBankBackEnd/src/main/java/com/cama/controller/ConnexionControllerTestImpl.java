package com.cama.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConnexionControllerTestImpl implements ConnexionControllerTest {
	
	@Override
	@PostMapping("/connexionTest")
	public ResponseEntity<Object[]> connexion(@RequestBody String[] connexion) {
		Object[] answer = new Object[4];
		
		if (connexion[0].equals("claire")) {
			answer[0] = true;
			answer[1] = 1;
			answer[2] = "Claire";
			answer[3] = "client";
		}else {
			answer[0] = false;
		}
		return new ResponseEntity<>(answer, HttpStatus.OK);
	}

}