package com.cama.service;

import java.util.List;

import com.cama.model.SituationFamiliale;

public interface SituationFamilialeService {
	
	List<SituationFamiliale> findAllSituationsFamiliales();
	
	SituationFamiliale findSituationFamilialeById(int id);
	
	void createSituationFamiliale(SituationFamiliale situationFamiliale);

	void deleteSituationFamiliale(SituationFamiliale situationFamiliale);
	
	void updateSituationFamiliale(SituationFamiliale situationFamiliale);
}