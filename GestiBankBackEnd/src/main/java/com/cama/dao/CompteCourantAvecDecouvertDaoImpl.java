package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.CompteCourantAvecDecouvert;

@Repository("compteCourantAvecDecouvertDao")
public class CompteCourantAvecDecouvertDaoImpl extends AbstractDao<Integer, CompteCourantAvecDecouvert> implements CompteCourantAvecDecouvertDao {

	@Override
	public List<CompteCourantAvecDecouvert> findAllComptes() {
		String requete = "select c " + "from CompteCourantAvecDecouvert as c";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<CompteCourantAvecDecouvert>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public CompteCourantAvecDecouvert findCompteById(int id) {
		String requete = "select c " + "from CompteCourantAvecDecouvert as c " + "where c.idCompte = :id";
        Query query = getEntityManager().createQuery(requete);
        query.setParameter("id", id);
        try {
        	return (CompteCourantAvecDecouvert) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public void createCompte(CompteCourantAvecDecouvert compte) {
		save(compte);
	}

	@Override
	public void deleteCompte(CompteCourantAvecDecouvert compte) {
		delete(getByKey((int) compte.getIdCompte()));
	}

	@Override
	public void updateCompte(CompteCourantAvecDecouvert compte) {
		update(compte);
	}
}