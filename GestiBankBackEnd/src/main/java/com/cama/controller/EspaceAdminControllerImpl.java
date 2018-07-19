package com.cama.controller;

import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cama.model.Conseiller;
import com.cama.model.DemandeInscription;
import com.cama.service.EspaceAdminService;

@RestController
public class EspaceAdminControllerImpl implements EspaceAdminController {
	
	@Autowired
	private EspaceAdminService espaceAdminService;

	@Override
	@GetMapping("/admin/conseillers/{idAdmin}")
	public ResponseEntity<List<Conseiller>> findAllConseillers(@PathVariable("idAdmin") int idAdmin) {
		if(espaceAdminService.findAllConseillers(idAdmin) == null) {
			return new ResponseEntity<List<Conseiller>>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Conseiller>>(espaceAdminService.findAllConseillers(idAdmin), HttpStatus.OK);	
	}
	
	@Override
	@GetMapping("/admin/demandes/{idAdmin}")
	public ResponseEntity<List<DemandeInscription>> findAllDemandes(@PathVariable("idAdmin") int idAdmin) {
		if(espaceAdminService.findAllDemandes(idAdmin) == null) {
			return new ResponseEntity<List<DemandeInscription>>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<DemandeInscription>>(espaceAdminService.findAllDemandes(idAdmin), HttpStatus.OK);
	}
	
	@Override
	@PostMapping("/admin/demandes")
	public ResponseEntity<Boolean> affectDemandeInscription(@RequestBody List<Integer> affectation) {
		return new ResponseEntity<Boolean>(espaceAdminService.affectDemandeInscription(affectation), HttpStatus.OK);	
	}

	@Override
	@GetMapping("/admin/dashboard/{idAdmin}")
	public ResponseEntity<Hashtable<String, String>> dashboard(@PathVariable("idAdmin") int idAdmin) {
		return new ResponseEntity<Hashtable<String, String>>(espaceAdminService.dashboard(idAdmin), HttpStatus.OK);	
	}
}
