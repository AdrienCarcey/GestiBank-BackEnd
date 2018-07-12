package com.cama.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.ConseillerDao;
import com.cama.model.Conseiller;

@Service("conseillerService")
@Transactional
public class ConseillerServiceImpl implements ConseillerService {

	@Autowired
	private ConseillerDao conseillerDAO;
	
	@Override
	public List<Conseiller> findAllConseillers() {
		return conseillerDAO.findAllConseillers();
	}

	@Override
	public Conseiller findConseillerById(int id) {
		return conseillerDAO.findConseillerById(id);
	}

	@Override
	public void createConseiller(Conseiller conseiller) {
		conseillerDAO.createConseiller(conseiller);
	}

	@Override
	public void deleteConseiller(Conseiller conseiller) {
		conseillerDAO.deleteConseiller(conseiller);
	}

	@Override
	public void updateConseiller(Conseiller conseiller) {
		conseillerDAO.updateConseiller(conseiller);
	}
}