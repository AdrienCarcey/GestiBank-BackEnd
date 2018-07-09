package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.Adresse;

@Repository("adresseDao")
public class AdresseDaoImpl extends AbstractDao<Integer, Adresse> implements AdresseDao {

	@Override
	@Transactional
	public List<Adresse> findAllAdresses() {
		String requete = "select a " + "from Adresse as a";
		Query query = getEntityManager().createQuery(requete);
		return (List<Adresse>) query.getResultList();
	}

	@Override
	@Transactional
	public Adresse findAdresseById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createAdresse(Adresse adresse) {
		save(adresse);
	}

	@Override
	@Transactional
	public void deleteAdresse(Adresse adresse) {
		delete(getByKey((int) adresse.getIdAdresse()));
	}

	@Override
	@Transactional
	public void updateAdresse(Adresse adresse) {
		update(adresse);
	}
}