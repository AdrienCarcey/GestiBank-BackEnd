package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.DemandeChequier;
import com.cama.model.DemandeModificationDonnees;

@Repository("demandeModificationDonneesDao")
public class DemandeModificationDonneesDaoImpl extends AbstractDao<Integer, DemandeModificationDonnees> implements DemandeModificationDonneesDao {

	@Override
	@Transactional
	public List<DemandeModificationDonnees> findAllDemandesClients() {
		String requete = "select d " + "from DemandeModificationDonnees as d";
		Query query = getEntityManager().createQuery(requete);
		return (List<DemandeModificationDonnees>) query.getResultList();
	}

	@Override
	@Transactional
	public DemandeModificationDonnees findDemandeClientById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createDemandeClient(DemandeModificationDonnees demandeClient) {
		save(demandeClient);
	}

	@Override
	@Transactional
	public void deleteDemandeClient(DemandeModificationDonnees demandeClient) {
		delete(getByKey((int) demandeClient.getIdDemande()));
	}

	@Override
	@Transactional
	public void updateDemandeClient(DemandeModificationDonnees demandeClient) {
		update(demandeClient);
	}
}