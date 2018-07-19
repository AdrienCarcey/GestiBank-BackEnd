package com.cama.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.AdminDao;
import com.cama.dao.ConseillerDao;
import com.cama.dao.DemandeInscriptionDao;
import com.cama.model.Admin;
import com.cama.model.Conseiller;
import com.cama.model.Demande;
import com.cama.model.DemandeInscription;

@Service("espaceAdminService")
@Transactional
public class EspaceAdminServiceImpl implements EspaceAdminService {
	
	@Autowired
	private AdminDao adminDao;
	@Autowired
	private ConseillerDao conseillerDao;
	@Autowired
	private DemandeInscriptionDao demandeInscriptionDao;
	
	@Override
	public List<Conseiller> findAllConseillers(int idAdmin) {
		return adminDao.findAdminById(idAdmin).getConseillers();
	}
	
	@Override
	public List<DemandeInscription> findAllDemandes(int idAdmin) {
		List<DemandeInscription> demandes = new ArrayList<DemandeInscription>();
		
		for (Demande demande: adminDao.findAdminById(idAdmin).getDemandes()) {
			if(demande instanceof DemandeInscription) {
				demandes.add((DemandeInscription) demande);
			}
		}
		
		return demandes;
	}
	
	@Override
	public Boolean affectDemandeInscription(List<Integer> affectation) {
		int idDemande = affectation.get(0);
		int idAdmin = affectation.get(1);
		int idConseiller = affectation.get(2);
		
		DemandeInscription demande;
		Admin admin;
		Conseiller conseiller;
		
		if(demandeInscriptionDao.findDemandeInscriptionById(idDemande) == null) {
			return false;
		}
		else if(adminDao.findAdminById(idAdmin) == null) {
			return false;
		}
		else if(conseillerDao.findConseillerById(idConseiller) == null) {
			return false;
		}
		else {
			demande = demandeInscriptionDao.findDemandeInscriptionById(idDemande);
			admin = adminDao.findAdminById(idAdmin);
			conseiller = conseillerDao.findConseillerById(idConseiller);
		}
		
		admin.getDemandes().remove(demande);
		adminDao.updateAdmin(admin);
		demande.setStatut("demande non traitee");
		conseiller.getDemandes().add(demande);
		conseillerDao.updateConseiller(conseiller);
		
		return true;
	}
	
	@Override
	public Hashtable<String, String> dashboard(int idAdmin) {
		Hashtable<String, String> dashboard = new Hashtable<String, String>();
		
		Admin admin = adminDao.findAdminById(idAdmin);
		String nombreConseillers;
		String nombreDemandes;
		
		if(admin.getConseillers().size() != 0) {
			nombreConseillers = Integer.toString(admin.getConseillers().size());
		}
		else {
			nombreConseillers = "aucun";
		}
		
		if(admin.getDemandes().size() != 0) {
			nombreDemandes = Integer.toString(admin.getDemandes().size());
		}
		else {
			nombreDemandes = "aucune";
		}
		
		dashboard.put("nom", admin.getIdentite().getNom());
		dashboard.put("prenom", admin.getIdentite().getPrenom());
		dashboard.put("nombreConseillers", nombreConseillers);
		dashboard.put("nombreDemandes", nombreDemandes);
		
		return dashboard;
	}
}
