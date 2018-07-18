package com.cama.service;

import java.util.List;

import com.cama.model.DemandeInscription;

public interface EspaceAdminService {
	
	List<DemandeInscription> findAllDemandes (int idAdmin);
}
