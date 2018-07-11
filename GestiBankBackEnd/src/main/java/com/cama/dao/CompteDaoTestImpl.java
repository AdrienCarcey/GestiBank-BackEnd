package com.cama.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.CompteTest;

@Repository("compteDaoTest")
public class CompteDaoTestImpl extends AbstractDao<Integer, CompteTest> implements CompteDaoTest {

	@Override
	public List<CompteTest> findAllComptes() {
		String requete = "select c " + "from CompteTest as c";
		Query query = getEntityManager().createQuery(requete);
		return (List<CompteTest>) query.getResultList();
	}

	@Override
	public CompteTest findCompteById(int idCompte) {
		return getByKey(idCompte);
	}

	@Override
	public void createCompte(CompteTest compte) {
		save(compte);
	}

	@Override
	public void deleteCompte(CompteTest compte) {
		delete(getByKey((int) compte.getIdCompte()));
	}

	@Override
	public void updateCompte(CompteTest compte) {
		update(compte);
	}
}