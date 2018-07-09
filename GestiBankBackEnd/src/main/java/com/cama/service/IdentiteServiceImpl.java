package com.cama.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.IdentiteDao;
import com.cama.model.Identite;

@Service("identiteService")
public class IdentiteServiceImpl implements IdentiteService {

	@Autowired
	private IdentiteDao identiteDAO;
	
	@Override
	public List<Identite> findAllIdentites() {
		return identiteDAO.findAllIdentites();
	}

	@Override
	public Identite findIdentiteById(int id) {
		return identiteDAO.findIdentiteById(id);
	}

	@Override
	public void createIdentite(Identite identite) {
		identiteDAO.createIdentite(identite);
	}

	@Override
	public void deleteIdentite(Identite identite) {
		identiteDAO.deleteIdentite(identite);
	}

	@Override
	public void updateIdentite(Identite identite) {
		identiteDAO.updateIdentite(identite);
	}
}