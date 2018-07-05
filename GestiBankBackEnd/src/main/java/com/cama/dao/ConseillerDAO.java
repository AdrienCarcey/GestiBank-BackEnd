package com.cama.dao;

import java.util.List;

import com.cama.model.Conseiller;

public interface ConseillerDAO {
	
	List<Conseiller> findAllConseiller();
	
	Conseiller findConseillerById(int id);
	
	void createConseiller(Conseiller conseiller);
	
	void deleteConseiller(Conseiller conseiller);
	
	void updateConseillerById(int id, Conseiller conseiller);
}