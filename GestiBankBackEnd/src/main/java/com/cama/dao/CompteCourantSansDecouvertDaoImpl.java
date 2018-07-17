package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.CompteCourantSansDecouvert;

@Repository("compteCourantSansDecouvertDao")
public class CompteCourantSansDecouvertDaoImpl extends AbstractDao<Integer, CompteCourantSansDecouvert> implements CompteCourantSansDecouvertDao {

	@Override
	public List<CompteCourantSansDecouvert> findAllComptes() {
		String requete = "select c " + "from CompteCourantSansDecouvert as c";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<CompteCourantSansDecouvert>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public CompteCourantSansDecouvert findCompteById(int id) {
		String requete = "select c " + "from CompteCourantSansDecouvert as c " + "where c.idCompte = :id";
        Query query = getEntityManager().createQuery(requete);
        query.setParameter("id", id);
        try {
        	return (CompteCourantSansDecouvert) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public void createCompte(CompteCourantSansDecouvert compte) {
		save(compte);
	}

	@Override
	public void deleteCompte(CompteCourantSansDecouvert compte) {
		delete(getByKey((int) compte.getIdCompte()));
	}

	@Override
	public void updateCompte(CompteCourantSansDecouvert compte) {
		update(compte);
	}
}