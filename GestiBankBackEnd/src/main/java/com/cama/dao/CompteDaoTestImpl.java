package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.CompteTest;

@Repository("compteDaoTest")
public class CompteDaoTestImpl extends AbstractDao<Integer, CompteTest> implements CompteDaoTest {

	@Override
	public List<CompteTest> findAllComptes() {
		String requete = "select c " + "from CompteTest as c";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<CompteTest>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public CompteTest findCompteById(int idCompte) {
		try {
			return getByKey(idCompte);
		} catch (NoResultException e) {
			return null;
		}
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