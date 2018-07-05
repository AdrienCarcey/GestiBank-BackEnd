package com.cama.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cama.model.Conseiller;

public interface ConseillerController {
	
	ResponseEntity<List<Conseiller>> findAllConseiller();
	
	ResponseEntity<Conseiller> findConseillerById(int id);
	
	ResponseEntity<Boolean> createConseiller(Conseiller conseiller);
	
	ResponseEntity<Boolean> deleteConseillerById(int id);
	
	ResponseEntity<Boolean> updateConseillerById(int id, Conseiller conseiller);
}
