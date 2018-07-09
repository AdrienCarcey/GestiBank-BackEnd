package com.cama.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.SituationFamilialeDao;
import com.cama.model.SituationFamiliale;

@Service("situationFamilialeService")
public class SituationFamilialeServiceImpl implements SituationFamilialeService {

	@Autowired
	private SituationFamilialeDao situationFamilialeDAO;
	
	@Override
	public List<SituationFamiliale> findAllSituationsFamiliales() {
		return situationFamilialeDAO.findAllSituationsFamiliales();
	}

	@Override
	public SituationFamiliale findSituationFamilialeById(int id) {
		return situationFamilialeDAO.findSituationFamilialeById(id);
	}

	@Override
	public void createSituationFamiliale(SituationFamiliale situationFamiliale) {
		situationFamilialeDAO.createSituationFamiliale(situationFamiliale);
	}

	@Override
	public void deleteSituationFamiliale(SituationFamiliale situationFamiliale) {
		situationFamilialeDAO.deleteSituationFamiliale(situationFamiliale);
	}

	@Override
	public void updateSituationFamiliale(SituationFamiliale situationFamiliale) {
		situationFamilialeDAO.updateSituationFamiliale(situationFamiliale);
	}
}