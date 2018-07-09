package com.cama.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.CompteCourantAvecDecouvertDao;
import com.cama.model.CompteCourantAvecDecouvert;

@Service("compteCourantAvecDecouvertService")
public class CompteCourantAvecDecouvertServiceImpl implements CompteCourantAvecDecouvertService {
	
	@Autowired
	private CompteCourantAvecDecouvertDao compteCourantAvecDecouvertDAO;
	
	@Override
	public List<CompteCourantAvecDecouvert> findAllComptes() {
		return compteCourantAvecDecouvertDAO.findAllComptes();
	}

	@Override
	public CompteCourantAvecDecouvert findCompteById(int id) {
		return compteCourantAvecDecouvertDAO.findCompteById(id);
	}

	@Override
	public void createCompte(CompteCourantAvecDecouvert compte) {
		compteCourantAvecDecouvertDAO.createCompte(compte);
	}

	@Override
	public void deleteCompte(CompteCourantAvecDecouvert compte) {
		compteCourantAvecDecouvertDAO.deleteCompte(compte);
	}

	@Override
	public void updateCompte(CompteCourantAvecDecouvert compte) {
		compteCourantAvecDecouvertDAO.updateCompte(compte);
	}
}