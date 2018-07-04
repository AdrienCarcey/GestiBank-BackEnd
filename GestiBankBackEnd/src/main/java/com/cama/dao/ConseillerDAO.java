package com.cama.dao;

import java.util.List;

import com.cama.model.Conseiller;

public interface ConseillerDAO {
	
	List<Conseiller> findAllConseiller();
	
	Conseiller findConseillerById(int id);
	
	Conseiller createConseiller(Conseiller conseiller);
	
	Integer deleteConseillerById(int id);
	
	Conseiller updateConseillerById(int id, Conseiller conseiller);
}