package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.Adresse;

@Repository("adresseDao")
public class AdresseDaoImpl extends AbstractDao<Integer, Adresse> implements AdresseDao {

	@Override
	public List<Adresse> findAllAdresses() {
		String requete = "select a " + "from Adresse as a";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<Adresse>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public Adresse findAdresseById(int id) {
		try {
			return getByKey(id);
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public void createAdresse(Adresse adresse) {
		save(adresse);
	}

	@Override
	public void deleteAdresse(Adresse adresse) {
		delete(getByKey((int) adresse.getIdAdresse()));
	}

	@Override
	public void updateAdresse(Adresse adresse) {
		update(adresse);
	}
}