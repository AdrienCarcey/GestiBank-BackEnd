package com.cama.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.CompteCourantSansDecouvert;

@Repository("compteCourantSansDecouvertDao")
public class CompteCourantSansDecouvertDaoImpl extends AbstractDao<Integer, CompteCourantSansDecouvert> implements CompteCourantSansDecouvertDao {

	@Override
	public List<CompteCourantSansDecouvert> findAllComptes() {
		String requete = "select c " + "from CompteCourantSansDecouvert as c";
		Query query = getEntityManager().createQuery(requete);
		return (List<CompteCourantSansDecouvert>) query.getResultList();
	}

	@Override
	public CompteCourantSansDecouvert findCompteById(int id) {
		return getByKey(id);
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