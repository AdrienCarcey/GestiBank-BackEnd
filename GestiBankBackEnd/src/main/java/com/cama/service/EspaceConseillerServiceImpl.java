package com.cama.service;

import java.util.ArrayList;
import java.util.Hashtable;
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
import com.cama.model.CompteCourantAvecDecouvert;
import com.cama.model.CompteCourantSansDecouvert;
import com.cama.model.CompteRemunerateur;
import com.cama.model.Demande;
import com.cama.model.DemandeChequier;
import com.cama.model.DemandeFermetureCompte;
import com.cama.model.DemandeInscription;
import com.cama.model.DemandeModificationDonnees;
import com.cama.model.DemandeOuvertureCompte;
import com.cama.model.DemandeRIB;
import com.cama.model.MessageClient;
import com.cama.model.MessagePublic;
import com.cama.model.OperationBancaire;
import com.cama.model.OperationDebit;

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
	public Boolean openClientAccount(int idClient) {
		if(clientDao.findClientById(idClient) == null) {
			return false;
		}
		
		else {
			Client client = clientDao.findClientById(idClient);
			client.setStatut("ouvert");
			clientDao.updateClient(client);
			
			return true;
		}
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
		if(clientDao.findClientById(idClient) == null) {
			return false;
		}
		
		else {
			Client clientUpdate = clientDao.findClientById(idClient);
			
			if(client.getIdentite().getTitreCivilite() != null) {
				clientUpdate.getIdentite().setTitreCivilite(client.getIdentite().getTitreCivilite());
			}
			if(client.getIdentite().getNom() != null) {
				clientUpdate.getIdentite().setNom(client.getIdentite().getNom());
			}
			if(client.getIdentite().getPrenom() != null) {
				clientUpdate.getIdentite().setPrenom(client.getIdentite().getPrenom());
			}
			if(client.getIdentite().getDateNaissance() != null) {
				clientUpdate.getIdentite().setDateNaissance(client.getIdentite().getDateNaissance());
			}
			
			if(client.getSituationFamiliale().getSituationMatrimoniale() != null) {
				clientUpdate.getSituationFamiliale().setSituationMatrimoniale(client.getSituationFamiliale().getSituationMatrimoniale());
			}
			if(client.getSituationFamiliale().getNombreEnfants() != 0) {
				clientUpdate.getSituationFamiliale().setNombreEnfants(client.getSituationFamiliale().getNombreEnfants());
			}
			
			if(client.getContact().getAdresse().getNumeroVoie() != 0) {
				clientUpdate.getContact().getAdresse().setNumeroVoie(client.getContact().getAdresse().getNumeroVoie());
			}
			if(client.getContact().getAdresse().getLibelleVoie() != null) {
				clientUpdate.getContact().getAdresse().setLibelleVoie(client.getContact().getAdresse().getLibelleVoie());
			}
			if(client.getContact().getAdresse().getComplementAdresse() != null) {
				clientUpdate.getContact().getAdresse().setComplementAdresse(client.getContact().getAdresse().getComplementAdresse());
			}
			if(client.getContact().getAdresse().getCodePostal() != 0) {
				clientUpdate.getContact().getAdresse().setCodePostal(client.getContact().getAdresse().getCodePostal());
			}
			if(client.getContact().getAdresse().getVille() != null) {
				clientUpdate.getContact().getAdresse().setVille(client.getContact().getAdresse().getVille());
			}
			if(client.getContact().getAdresse().getPays() != null) {
				clientUpdate.getContact().getAdresse().setPays(client.getContact().getAdresse().getPays());
			}
			if(client.getContact().getTelephone() != null) {
				clientUpdate.getContact().setTelephone(client.getContact().getTelephone());
			}
			if(client.getContact().getEmail() != null) {
				clientUpdate.getContact().setEmail(client.getContact().getEmail());
			}
			
			if(client.getDocuments().getPieceIdentite() != null) {
				clientUpdate.getDocuments().setPieceIdentite(client.getDocuments().getPieceIdentite());
			}
			if(client.getDocuments().getJustificatifDomicile() != null) {
				clientUpdate.getDocuments().setJustificatifDomicile(client.getDocuments().getJustificatifDomicile());
			}
			
			clientDao.updateClient(clientUpdate);
			
			return true;
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
	public List<OperationBancaire> findCompteOperation(int idCompte) {
		if(findClientCompte(idCompte) == null) {
			return null;
		}
		
		else {
			List<OperationBancaire> operationsBancaires = new ArrayList<OperationBancaire>();
			
			for(OperationBancaire operation: findClientCompte(idCompte).getOperationsBancaires()) {
				if(operation instanceof OperationDebit) {
					operation.setMontantOperation(-operation.getMontantOperation());
					operationsBancaires.add(operation);
				}
				else {
					operationsBancaires.add(operation);
				}
			}
			
			return operationsBancaires;
		}		
	}
	
	@Override
	public Hashtable<String, List> findAllDemandes(int idConseiller) {
		Hashtable<String, List> demandes = new Hashtable<String, List>();
		
		List<DemandeInscription> demandeInscription = new ArrayList<DemandeInscription>();
		List<DemandeModificationDonnees> demandeModificationDonnees = new ArrayList<DemandeModificationDonnees>();
		List<DemandeChequier> demandeChequier = new ArrayList<DemandeChequier>();
		List<DemandeRIB> demandeRIB = new ArrayList<DemandeRIB>();
		List<DemandeOuvertureCompte> demandeOuvertureCompte = new ArrayList<DemandeOuvertureCompte>();
		List<DemandeFermetureCompte> demandeFermetureCompte = new ArrayList<DemandeFermetureCompte>();
		List<MessagePublic> messagePublic = new ArrayList<MessagePublic>();
		List<MessageClient> messageClient = new ArrayList<MessageClient>();
		
		List<Demande> demandesConseiller = conseillerDao.findConseillerById(idConseiller).getDemandes();
		List<Demande> demandesClient = new ArrayList<Demande>();
		
		for(Client client: findAllClients(idConseiller)) {
			demandesClient.addAll(client.getDemandes());
		}
		
		for(Demande demande: demandesConseiller) {
			if(demande instanceof DemandeInscription) {
				demandeInscription.add((DemandeInscription) demande);
			}
			if(demande instanceof MessagePublic) {
				messagePublic.add((MessagePublic) demande);
			}
		}
		
		for(Demande demande: demandesClient) {
			if(demande instanceof DemandeModificationDonnees) {
				demandeModificationDonnees.add((DemandeModificationDonnees) demande);
			}
			if(demande instanceof DemandeChequier) {
				demandeChequier.add((DemandeChequier) demande);
			}
			if(demande instanceof DemandeRIB) {
				demandeRIB.add((DemandeRIB) demande);
			}
			if(demande instanceof DemandeOuvertureCompte) {
				demandeOuvertureCompte.add((DemandeOuvertureCompte) demande);
			}
			if(demande instanceof DemandeFermetureCompte) {
				demandeFermetureCompte.add((DemandeFermetureCompte) demande);
			}
			if(demande instanceof MessageClient) {
				messageClient.add((MessageClient) demande);
			}
		}
		
		demandes.put("demandeInscription", demandeInscription);
		demandes.put("messagePublic", messagePublic);
		demandes.put("demandeModificationDonnees", demandeModificationDonnees);
		demandes.put("demandeChequier", demandeChequier);
		demandes.put("demandeRIB", demandeRIB);
		demandes.put("demandeOuvertureCompte", demandeOuvertureCompte);
		demandes.put("demandeFermetureCompte", demandeFermetureCompte);
		demandes.put("messageClient", messageClient);
		
		return demandes;		
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
