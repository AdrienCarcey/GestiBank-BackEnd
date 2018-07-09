package com.cama.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.CompteRemunerateurDao;
import com.cama.model.CompteRemunerateur;

@Service("compteRemunerateurService")
public class CompteRemunerateurServiceImpl implements CompteRemunerateurService {

	@Autowired
	private CompteRemunerateurDao compteRemunerateurDAO;
	
	@Override
	public List<CompteRemunerateur> findAllComptes() {
		return compteRemunerateurDAO.findAllComptes();
	}

	@Override
	public CompteRemunerateur findCompteById(int id) {
		return compteRemunerateurDAO.findCompteById(id);
	}

	@Override
	public void createCompte(CompteRemunerateur compte) {
		compteRemunerateurDAO.createCompte(compte);
	}

	@Override
	public void deleteCompte(CompteRemunerateur compte) {
		compteRemunerateurDAO.deleteCompte(compte);
	}

	@Override
	public void updateCompte(CompteRemunerateur compte) {
		compteRemunerateurDAO.updateCompte(compte);
	}
}