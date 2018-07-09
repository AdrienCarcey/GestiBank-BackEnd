package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.Conseiller;

@Repository("conseillerDao")
public class ConseillerDaoImpl extends AbstractDao<Integer, Conseiller> implements ConseillerDao {

	@Override
	@Transactional
	public List<Conseiller> findAllConseillers() {
		String requete = "select u " + "from Utilisateur as u " + "where u.heritage = 'conseiller'";
		Query query = getEntityManager().createQuery(requete);
		return (List<Conseiller>) query.getResultList();
	}

	@Override
	@Transactional
	public Conseiller findConseillerById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createConseiller(Conseiller conseiller) {
		save(conseiller);
	}

	@Override
	@Transactional
	public void deleteConseiller(Conseiller conseiller) {
		delete(getByKey((int) conseiller.getIdUtilisateur()));
	}

	@Override
	@Transactional
	public void updateConseiller(Conseiller conseiller) {
		update(conseiller);
	}
}