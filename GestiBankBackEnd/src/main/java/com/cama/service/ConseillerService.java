package com.cama.service;

import java.util.List;

import com.cama.model.Conseiller;

public interface ConseillerService {
	
	List<Conseiller> findAllConseillers();
	
	Conseiller findConseillerById(int id);
	
	void createConseiller(Conseiller conseiller);
	
	void deleteConseiller(Conseiller conseiller);
	
	void updateConseiller(Conseiller conseiller);
}