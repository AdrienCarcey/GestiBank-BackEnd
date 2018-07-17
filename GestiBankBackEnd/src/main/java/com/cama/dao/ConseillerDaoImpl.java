package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.Conseiller;

@Repository("conseillerDao")
public class ConseillerDaoImpl extends AbstractDao<Integer, Conseiller> implements ConseillerDao {

	@Override
	public List<Conseiller> findAllConseillers() {
		String requete = "select c " + "from Conseiller as c";
		Query query = getEntityManager().createQuery(requete);
        try {
        	return (List<Conseiller>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public Conseiller findConseillerById(int id) {
        String requete = "select c " + "from Conseiller as c " + "where c.idUtilisateur = :id";
        Query query = getEntityManager().createQuery(requete);
        query.setParameter("id", id);
        try {
        	return (Conseiller) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
	}
	
	@Override
    public Conseiller findConseillerByName(String name) {
        String requete = "select c " + "from Conseiller as c " + "where c.nomUtilisateur = :nomConseiller AND c.statut = 'ouvert'";
        Query query = getEntityManager().createQuery(requete);
        query.setParameter("nomConseiller", name);
        try {
        	return (Conseiller) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
    }

	@Override
	public void createConseiller(Conseiller conseiller) {
		save(conseiller);
	}

	@Override
	public void deleteConseiller(Conseiller conseiller) {
		delete(getByKey((int) conseiller.getIdUtilisateur()));
	}

	@Override
	public void updateConseiller(Conseiller conseiller) {
		update(conseiller);
	}
}