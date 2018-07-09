package com.cama.dao;

import java.util.List;

import com.cama.model.Identite;

public interface IdentiteDao {

	List<Identite> findAllIdentites();
	
	Identite findIdentiteById(int id);
	
	void createIdentite(Identite identite);

	void deleteIdentite(Identite identite);
	
	void updateIdentite(Identite identite);
}