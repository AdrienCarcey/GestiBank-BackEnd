package com.cama.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.AdminDao;
import com.cama.model.Demande;
import com.cama.model.DemandeInscription;

@Service("espaceAdminService")
@Transactional
public class EspaceAdminServiceImpl implements EspaceAdminService {
	
	@Autowired
	private AdminDao adminDao;	
	
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
}
