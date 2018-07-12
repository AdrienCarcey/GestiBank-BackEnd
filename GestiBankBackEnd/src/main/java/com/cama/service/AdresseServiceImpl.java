package com.cama.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.AdresseDao;
import com.cama.model.Adresse;

@Service("adresseService")
@Transactional
public class AdresseServiceImpl implements AdresseService {
	
	@Autowired
	private AdresseDao adresseDAO;
	
	@Override
	public List<Adresse> findAllAdresses() {
		return adresseDAO.findAllAdresses();
	}

	@Override
	public Adresse findAdresseById(int id) {
		return adresseDAO.findAdresseById(id);
	}

	@Override
	public void createAdresse(Adresse adresse) {
		adresseDAO.createAdresse(adresse);
	}

	@Override
	public void deleteAdresse(Adresse adresse) {
		adresseDAO.deleteAdresse(adresse);
	}

	@Override
	public void updateAdresse(Adresse adresse) {
		adresseDAO.updateAdresse(adresse);
	}
}