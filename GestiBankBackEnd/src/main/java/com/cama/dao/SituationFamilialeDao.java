package com.cama.dao;

import java.util.List;

import com.cama.model.SituationFamiliale;

public interface SituationFamilialeDao {

	List<SituationFamiliale> findAllSituationsFamiliales();
	
	SituationFamiliale findSituationFamilialeById(int id);
	
	void createSituationFamiliale(SituationFamiliale situationFamiliale);

	void deleteSituationFamiliale(SituationFamiliale situationFamiliale);
	
	void updateSituationFamiliale(SituationFamiliale situationFamiliale);
}