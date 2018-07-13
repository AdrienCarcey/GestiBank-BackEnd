package com.cama.service;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cama.dao.AdminDao;
import com.cama.dao.ClientDao;
import com.cama.dao.ConseillerDao;
import com.cama.model.Admin;
import com.cama.model.Client;
import com.cama.model.Conseiller;
import com.cama.model.Utilisateur;

@Service("connexion")
@Transactional
public class ConnexionServiceImpl implements ConnexionService {

	@Autowired
	private ClientDao clientDao;
	@Autowired
	private ConseillerDao conseillerDao;
	@Autowired
	private AdminDao adminDao;
	
	
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
				hashtable.put("idUtilisateur", client.getIdUtilisateur());			}			
		}else if (conseiller != null) {			
			hashtable.put("utilisateurValide", true);
			if (conseiller.getMotDePasse().equals(mdp)) {
				hashtable.put("typeUtilisateur", "conseiller");				
				hashtable.put("mdpValide", true);
				hashtable.put("nomUtilisateur", conseiller.getNomUtilisateur());
				hashtable.put("idUtilisateur", conseiller.getIdUtilisateur());			}			
		} else if (admin != null) {
			hashtable.put("utilisateurValide", true);
			if (admin.getMotDePasse().equals(mdp)) {
				hashtable.put("typeUtilisateur", "admin");
				hashtable.put("mdpValide", true);
				hashtable.put("nomUtilisateur", admin.getNomUtilisateur());
				hashtable.put("idUtilisateur", admin.getIdUtilisateur());				
			} 
		}
		
		return hashtable;
	}
	
}
