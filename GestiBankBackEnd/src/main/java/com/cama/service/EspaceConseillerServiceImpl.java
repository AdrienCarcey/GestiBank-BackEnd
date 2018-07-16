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
import com.cama.model.CompteCourantAvecDecouvert;
import com.cama.model.CompteCourantSansDecouvert;
import com.cama.model.CompteRemunerateur;
import com.cama.model.Demande;

@Service("espaceConseillerService")
@Transactional
public class EspaceConseillerServiceImpl implements EspaceConseillerService {
	
	@Autowired
	private ConseillerDao conseillerDao;	
	@Autowired
	private ClientDao clientDao;
	@Autowired
	private CompteCourantAvecDecouvertDao compteCourantAvecDecouvertDao;
	@Autowired
	private CompteCourantSansDecouvertDao compteCourantSansDecouvertDao;
	@Autowired
	private CompteRemunerateurDao compteRemunerateurDao;
	
	@Override
	public List<Client> findAllClients(int idConseiller) {
		return conseillerDao.findConseillerById(idConseiller).getClients();
	}

	@Override
	public Client findClientAccount(int idClient) {
		return clientDao.findClientById(idClient);
	}
	
	@Override
	public Boolean closeClientAccount(int idClient) {
		if(clientDao.findClientById(idClient) == null) {
			return false;
		}
		
		else {
			Client client = clientDao.findClientById(idClient);
			client.setStatut("ferme");
			clientDao.updateClient(client);
			
			return true;
		}
	}

	@Override
	public Boolean updateClientAccount(int idClient, Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean openClientCompte(int idCompte) {
		if(compteCourantAvecDecouvertDao.findCompteById(idCompte) != null) {
			CompteCourantAvecDecouvert compte = compteCourantAvecDecouvertDao.findCompteById(idCompte);
			compte.setStatut(true);
			compteCourantAvecDecouvertDao.updateCompte(compte);
			
			return true;
		}
		
		else if(compteCourantSansDecouvertDao.findCompteById(idCompte) != null) {
			CompteCourantSansDecouvert compte = compteCourantSansDecouvertDao.findCompteById(idCompte);
			compte.setStatut(true);
			compteCourantSansDecouvertDao.updateCompte(compte);
			
			return true;
		}
		
		else if(compteRemunerateurDao.findCompteById(idCompte) != null) {
		
			CompteRemunerateur compte = compteRemunerateurDao.findCompteById(idCompte);
			compte.setStatut(true);
			compteRemunerateurDao.updateCompte(compte);
			
			return true;
		}
		
		else {
			return false;
		}
	}

	@Override
	public Boolean closeClientCompte(int idCompte) {
		if(compteCourantAvecDecouvertDao.findCompteById(idCompte) != null) {
			CompteCourantAvecDecouvert compte = compteCourantAvecDecouvertDao.findCompteById(idCompte);
			compte.setStatut(false);
			compteCourantAvecDecouvertDao.updateCompte(compte);
			
			return true;
		}
		
		else if(compteCourantSansDecouvertDao.findCompteById(idCompte) != null) {
			CompteCourantSansDecouvert compte = compteCourantSansDecouvertDao.findCompteById(idCompte);
			compte.setStatut(false);
			compteCourantSansDecouvertDao.updateCompte(compte);
			
			return true;
		}
		
		else if(compteRemunerateurDao.findCompteById(idCompte) != null) {
		
			CompteRemunerateur compte = compteRemunerateurDao.findCompteById(idCompte);
			compte.setStatut(false);
			compteRemunerateurDao.updateCompte(compte);
			
			return true;
		}
		
		else {
			return false;
		}
	}
	
	@Override
	public List<Demande> findAllDemandes(int idConseiller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean validateDemande(int idDemande, String typeDemande) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean refuseDemande(int idDemande) {
		// TODO Auto-generated method stub
		return null;
	}
}
