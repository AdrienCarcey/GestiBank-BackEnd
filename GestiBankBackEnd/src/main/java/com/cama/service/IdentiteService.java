package com.cama.service;

import java.util.List;

import com.cama.model.Identite;

public interface IdentiteService {

	List<Identite> findAllIdentites();
	
	Identite findIdentiteById(int id);
	
	void createIdentite(Identite identite);

	void deleteIdentite(Identite identite);
	
	void updateIdentite(Identite identite);
}