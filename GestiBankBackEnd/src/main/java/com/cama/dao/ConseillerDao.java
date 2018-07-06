package com.cama.dao;

import java.util.List;

import com.cama.model.Conseiller;

public interface ConseillerDao {
	
	List<Conseiller> findAllConseillers();
	
	Conseiller findConseillerById(int id);
	
	void createConseiller(Conseiller conseiller);
	
	void deleteConseiller(Conseiller conseiller);
	
	void updateConseiller(Conseiller conseiller);
}