package com.cama.service;

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
import com.cama.model.MessageClient;
import com.cama.model.OperationBancaire;


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
	public List<OperationBancaire> findOperationsById(int idCompte) {
		
		if (compteCourantAvecDecouvertDao.findCompteById(idCompte) != null) {
			return compteCourantAvecDecouvertDao.findCompteById(idCompte).getOperationsBancaires();
		} else if (compteCourantSansDecouvertDao.findCompteById(idCompte) != null) {
			return compteCourantSansDecouvertDao.findCompteById(idCompte).getOperationsBancaires();
		} else if (compteRemunerateurDao.findCompteById(idCompte) != null) {			
			return compteRemunerateurDao.findCompteById(idCompte).getOperationsBancaires();
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
	
	

}
