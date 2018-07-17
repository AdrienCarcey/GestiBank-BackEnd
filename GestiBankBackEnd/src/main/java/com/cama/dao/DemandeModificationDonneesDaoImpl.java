package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.DemandeModificationDonnees;

@Repository("demandeModificationDonneesDao")
public class DemandeModificationDonneesDaoImpl extends AbstractDao<Integer, DemandeModificationDonnees> implements DemandeModificationDonneesDao {

	@Override
	public List<DemandeModificationDonnees> findAllDemandesClients() {
		String requete = "select d " + "from DemandeModificationDonnees as d";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<DemandeModificationDonnees>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public DemandeModificationDonnees findDemandeClientById(int id) {
		String requete = "select d " + "from DemandeModificationDonnees as d " + "where d.idDemande = :id";
        Query query = getEntityManager().createQuery(requete);
        query.setParameter("id", id);
        try {
        	return (DemandeModificationDonnees) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public void createDemandeClient(DemandeModificationDonnees demandeClient) {
		save(demandeClient);
	}

	@Override
	public void deleteDemandeClient(DemandeModificationDonnees demandeClient) {
		delete(getByKey((int) demandeClient.getIdDemande()));
	}

	@Override
	public void updateDemandeClient(DemandeModificationDonnees demandeClient) {
		update(demandeClient);
	}
}