package com.cama.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cama.model.DemandeInscription;
import com.cama.service.EspaceAdminService;

@RestController
public class EspaceAdminControllerImpl implements EspaceAdminController {
	
	@Autowired
	private EspaceAdminService espaceAdminService;

	@Override
	@GetMapping("/admin/demandes/{idAdmin}")
	public ResponseEntity<List<DemandeInscription>> findAllDemandes(@PathVariable("idAdmin") int idAdmin) {
		if(espaceAdminService.findAllDemandes(idAdmin) == null) {
			return new ResponseEntity<List<DemandeInscription>>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<DemandeInscription>>(espaceAdminService.findAllDemandes(idAdmin), HttpStatus.OK);
	}
}
