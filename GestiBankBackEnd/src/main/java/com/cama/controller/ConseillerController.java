package com.cama.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cama.model.Conseiller;

public interface ConseillerController {
	
	ResponseEntity<List<Conseiller>> findAllConseiller();
	
	ResponseEntity<Conseiller> findConseillerById(int id);
	
	ResponseEntity<Conseiller> createConseiller(Conseiller conseiller);
	
	ResponseEntity<Integer> deleteConseillerById(int id);
	
	ResponseEntity<Conseiller> updateConseillerById(int id, Conseiller conseiller);
}
