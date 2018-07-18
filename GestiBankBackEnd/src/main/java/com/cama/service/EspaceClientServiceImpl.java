package com.cama.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.ClientDao;
import com.cama.dao.CompteCourantAvecDecouvertDao;
import com.cama.dao.CompteCourantSansDecouvertDao;
import com.cama.dao.CompteRemunerateurDao;
import com.cama.dao.ConseillerDao;
import com.cama.model.Client;
import com.cama.model.Compte;
import com.cama.model.Conseiller;
import com.cama.model.DemandeChequier;
import com.cama.model.DemandeRIB;
import com.cama.model.MessageClient;
import com.cama.model.OperationBancaire;
import com.cama.model.OperationDebit;


@Service("espaceClientService")
@Transactional
public class EspaceClientServiceImpl implements EspaceClientService {

	@Autowired
	ClientDao clientDao;
	
	@Autowired
	ConseillerDao conseillerDao;
	
	@Autowired
	CompteRemunerateurDao compteRemunerateurDao;
	
	@Autowired
	CompteCourantAvecDecouvertDao compteCourantAvecDecouvertDao;
	
	@Autowired
	CompteCourantSansDecouvertDao compteCourantSansDecouvertDao; 
	
	
	@Override
	public List<Compte> findComptesById(int idClient) {
		Client client = clientDao.findClientById(idClient);
		if (client == null) {
			return null;
		} else {
			return client.getComptes();
		}
	}

	
	@Override
	public Compte findClientCompte(int idCompte) {
		if(compteCourantAvecDecouvertDao.findCompteById(idCompte) != null) {
			return compteCourantAvecDecouvertDao.findCompteById(idCompte);
		}
		
		else if(compteCourantSansDecouvertDao.findCompteById(idCompte) != null) {
			return compteCourantSansDecouvertDao.findCompteById(idCompte);
		}
		
		else if(compteRemunerateurDao.findCompteById(idCompte) != null) {			
			return compteRemunerateurDao.findCompteById(idCompte);
		}
		
		else {
			return null;
		}
	}
	
	
	@Override
	public List<OperationBancaire> findOperationsById(int idCompte) {
		
		if (findClientCompte(idCompte) != null) {
			List<OperationBancaire> operationsBancaires = new ArrayList<OperationBancaire>();
			for(OperationBancaire operation:findClientCompte(idCompte).getOperationsBancaires()) {
				if(operation instanceof OperationDebit) {
					operation.setMontantOperation(-operation.getMontantOperation());
				}
				operationsBancaires.add(operation);
			}
			return operationsBancaires;
		} else {
			return null;
		}
	}
	
	
	@Override
	public Boolean createMessageClient(MessageClient messageClient) {
		
		Client client = clientDao.findClientById(messageClient.getIdClient());
		client.getDemandes().add(messageClient);
		clientDao.updateClient(client);		
		
		return true;
	}


	@Override
	public Client getClientById(int idClient) {
		return clientDao.findClientById(idClient);
	}


	@Override
	public Boolean createDemandeChequier(DemandeChequier demandeChequier, int idClient) {
		Client client = clientDao.findClientById(idClient);
		client.getDemandes().add(demandeChequier);
		clientDao.updateClient(client);
		return true;
	}


	@Override
	public Boolean createDemandeRib(DemandeRIB demandeRib, int idClient) {
		Client client = clientDao.findClientById(idClient);
		client.getDemandes().add(demandeRib);
		clientDao.updateClient(client);
		return true;
	}
	
	

}
