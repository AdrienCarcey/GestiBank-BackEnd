package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.CompteCourantAvecDecouvert;

@Repository("compteCourantAvecDecouvertDao")
public class CompteCourantAvecDecouvertDaoImpl extends AbstractDao<Integer, CompteCourantAvecDecouvert> implements CompteCourantAvecDecouvertDao {

	@Override
	@Transactional
	public List<CompteCourantAvecDecouvert> findAllComptes() {
		String requete = "select c " + "from CompteCourantAvecDecouvert as c";
		Query query = getEntityManager().createQuery(requete);
		return (List<CompteCourantAvecDecouvert>) query.getResultList();
	}

	@Override
	@Transactional
	public CompteCourantAvecDecouvert findCompteById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createCompte(CompteCourantAvecDecouvert compte) {
		save(compte);
	}

	@Override
	@Transactional
	public void deleteCompte(CompteCourantAvecDecouvert compte) {
		delete(getByKey((int) compte.getIdCompte()));
	}

	@Override
	@Transactional
	public void updateCompte(CompteCourantAvecDecouvert compte) {
		update(compte);
	}
}