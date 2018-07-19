package com.cama.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.AdminDao;
import com.cama.dao.ClientDao;
import com.cama.dao.ConseillerDao;
import com.cama.model.Admin;
import com.cama.model.Client;
import com.cama.model.Compte;
import com.cama.model.CompteCourantAvecDecouvert;
import com.cama.model.CompteCourantSansDecouvert;
import com.cama.model.CompteRemunerateur;
import com.cama.model.Conseiller;
import com.cama.model.Demande;
import com.cama.model.DemandeInscription;
import com.cama.model.MessagePublic;


@Service("espacePublicService")
@Transactional
public class EspacePublicServiceImpl implements EspacePublicService {
	
		
	@Autowired
	private AdminDao adminDao;
	
	@Autowired
	private ConseillerDao conseillerDao;

	@Autowired
	private ClientDao clientDao;
	

	
	@Override
	public Boolean createDemandeInscription(DemandeInscription demandeInscription) {
		List<Compte> comptesBancaires = new ArrayList<Compte>();
		
		CompteCourantSansDecouvert ccsd = new CompteCourantSansDecouvert();
		CompteCourantAvecDecouvert ccad = new CompteCourantAvecDecouvert();
		CompteRemunerateur cr = new CompteRemunerateur();
		
		ccsd.setStatut(true);
		ccsd.setRib("rib");
		
		ccad.setStatut(false);
		cr.setStatut(false);
		
		comptesBancaires.add(ccsd);
		comptesBancaires.add(ccad);
		comptesBancaires.add(cr);
		
		demandeInscription.getClient().setComptes(comptesBancaires);
		
		Admin admin = adminDao.findAdminById(1);
		admin.getDemandes().add(demandeInscription);
		adminDao.updateAdmin(admin);
		
		return true;
	}


	@Override
	public Boolean createMessagePublic(MessagePublic messagePublic) {
		
		List<Conseiller> conseillers = conseillerDao.findAllConseillers();
		
		int idConseiller = 0;
		int nbMessageConseiller = 100000;
		for (Conseiller c:conseillers) {
			int nbMessage = 0;
			List<Demande> demandes = c.getDemandes();
			for (Demande d:demandes) {
				if (d instanceof MessagePublic) {
					nbMessage ++;
				}				
			}
			if (nbMessage < nbMessageConseiller) {
				idConseiller = c.getIdUtilisateur();
				nbMessageConseiller = nbMessage;
			}
		}
		
		Conseiller conseiller = conseillerDao.findConseillerById(idConseiller);
		conseiller.getDemandes().add(messagePublic);
		conseillerDao.updateConseiller(conseiller);
		
		return true;
	}

	
	@Override
	public Hashtable<String, Object> connexion(String[] connexion) {
		String name = connexion[0];
		String mdp = connexion[1];
		
		Client client = clientDao.findClientByName(name);
		Conseiller conseiller = conseillerDao.findConseillerByName(name);
		Admin admin = adminDao.findAdminByName(name);

		Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
		hashtable.put("utilisateurValide", false);
		hashtable.put("mdpValide", false);

		if (client != null) {	
			hashtable.put("utilisateurValide", true);
			if (client.getMotDePasse().equals(mdp)) {
				hashtable.put("typeUtilisateur", "client");
				hashtable.put("mdpValide", true);
				hashtable.put("nomUtilisateur", client.getNomUtilisateur());
				hashtable.put("idUtilisateur", client.getIdUtilisateur());			
				hashtable.put("nom", client.getIdentite().getNom());						
				hashtable.put("prenom", client.getIdentite().getPrenom());
			}			
		}else if (conseiller != null) {			
			hashtable.put("utilisateurValide", true);
			if (conseiller.getMotDePasse().equals(mdp)) {
				hashtable.put("typeUtilisateur", "conseiller");				
				hashtable.put("mdpValide", true);
				hashtable.put("nomUtilisateur", conseiller.getNomUtilisateur());
				hashtable.put("idUtilisateur", conseiller.getIdUtilisateur());			
				hashtable.put("nom", conseiller.getIdentite().getNom());						
				hashtable.put("prenom", conseiller.getIdentite().getPrenom());			}			
		} else if (admin != null) {
			hashtable.put("utilisateurValide", true);
			if (admin.getMotDePasse().equals(mdp)) {
				hashtable.put("typeUtilisateur", "admin");
				hashtable.put("mdpValide", true);
				hashtable.put("nomUtilisateur", admin.getNomUtilisateur());
				hashtable.put("idUtilisateur", admin.getIdUtilisateur());				
				hashtable.put("nom", admin.getIdentite().getNom());						
				hashtable.put("prenom", admin.getIdentite().getPrenom());			} 
		}
		
		return hashtable;
	}
	
}
