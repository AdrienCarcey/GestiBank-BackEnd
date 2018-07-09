package com.cama.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.CompteCourantSansDecouvertDao;
import com.cama.model.CompteCourantSansDecouvert;

@Service("compteCourantSansDecouvertService")
public class CompteCourantSansDecouvertServiceImpl implements CompteCourantSansDecouvertService {

	@Autowired
	private CompteCourantSansDecouvertDao compteCourantSansDecouvertDAO;
	
	@Override
	public List<CompteCourantSansDecouvert> findAllComptes() {
		return compteCourantSansDecouvertDAO.findAllComptes();
	}

	@Override
	public CompteCourantSansDecouvert findCompteById(int id) {
		return compteCourantSansDecouvertDAO.findCompteById(id);
	}

	@Override
	public void createCompte(CompteCourantSansDecouvert compte) {
		compteCourantSansDecouvertDAO.createCompte(compte);
	}

	@Override
	public void deleteCompte(CompteCourantSansDecouvert compte) {
		compteCourantSansDecouvertDAO.deleteCompte(compte);
	}

	@Override
	public void updateCompte(CompteCourantSansDecouvert compte) {
		compteCourantSansDecouvertDAO.updateCompte(compte);
	}
}