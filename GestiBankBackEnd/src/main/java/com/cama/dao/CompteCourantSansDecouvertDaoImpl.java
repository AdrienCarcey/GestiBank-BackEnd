package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.CompteCourantSansDecouvert;

@Repository("compteCourantSansDecouvertDao")
public class CompteCourantSansDecouvertDaoImpl extends AbstractDao<Integer, CompteCourantSansDecouvert> implements CompteCourantSansDecouvertDao {

	@Override
	@Transactional
	public List<CompteCourantSansDecouvert> findAllComptes() {
		String requete = "select c " + "from Compte as c " + "where c.heritage = 'compteCourantSansDecouvert'";
		Query query = getEntityManager().createQuery(requete);
		return (List<CompteCourantSansDecouvert>) query.getResultList();
	}

	@Override
	@Transactional
	public CompteCourantSansDecouvert findCompteById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createCompte(CompteCourantSansDecouvert compte) {
		save(compte);
	}

	@Override
	@Transactional
	public void deleteCompte(CompteCourantSansDecouvert compte) {
		delete(getByKey((int) compte.getIdCompte()));
	}

	@Override
	@Transactional
	public void updateCompte(CompteCourantSansDecouvert compte) {
		update(compte);
	}
}