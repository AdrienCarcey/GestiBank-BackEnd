package com.cama.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cama.model.Client;
import com.cama.model.Compte;
import com.cama.model.Demande;
import com.cama.service.EspaceConseillerService;

@RestController
public class EspaceConseillerControllerImpl implements EspaceConseillerController {
	
	@Autowired
	private EspaceConseillerService espaceConseillerService;
	
	@Override
	@GetMapping("/conseiller/{idConseiller}")
	public ResponseEntity<List<Client>> findAllClients(@PathVariable("idConseiller") int idConseiller) {
		if(espaceConseillerService.findAllClients(idConseiller) == null) {
			return new ResponseEntity<List<Client>>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Client>>(espaceConseillerService.findAllClients(idConseiller), HttpStatus.OK);
	}

	@Override
	@GetMapping("/conseiller/clients/{idClient}")
	public ResponseEntity<Client> findClientAccount(@PathVariable("idClient") int idClient) {
		if(espaceConseillerService.findClientAccount(idClient) == null) {
			return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Client>(espaceConseillerService.findClientAccount(idClient), HttpStatus.OK);
	}
	
	@Override
	@GetMapping("/conseiller/client/{idClient}")
	public ResponseEntity<Boolean> openClientAccount(@PathVariable("idClient") int idClient) {
		return new ResponseEntity<Boolean>(espaceConseillerService.openClientAccount(idClient), HttpStatus.OK);
		
	}
	
	@Override
	@DeleteMapping("/conseiller/client/{idClient}")
	public ResponseEntity<Boolean> closeClientAccount(@PathVariable("idClient") int idClient) {
		return new ResponseEntity<Boolean>(espaceConseillerService.closeClientAccount(idClient), HttpStatus.OK);
	}

	@Override
	@PutMapping("/conseiller/client/{idClient}")
	public ResponseEntity<Boolean> updateClientAccount(@PathVariable("idClient") int idClient, @RequestBody Client client) {
		return new ResponseEntity<Boolean>(espaceConseillerService.updateClientAccount(idClient, client), HttpStatus.OK);
	}

	@Override
	@GetMapping("/conseiller/comptes/{idCompte}")
	public ResponseEntity<Compte> findClientCompte(@PathVariable("idCompte") int idCompte) {
		if(espaceConseillerService.findClientCompte(idCompte) == null) {
			return new ResponseEntity<Compte>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Compte>(espaceConseillerService.findClientCompte(idCompte), HttpStatus.OK);
	}
	
	@Override
	@GetMapping("/conseiller/compte/{idCompte}")
	public ResponseEntity<Boolean> openClientCompte(@PathVariable("idCompte") int idCompte) {
		return new ResponseEntity<Boolean>(espaceConseillerService.openClientCompte(idCompte), HttpStatus.OK);
	}

	@Override
	@DeleteMapping("/conseiller/compte/{idCompte}")
	public ResponseEntity<Boolean> closeClientCompte(@PathVariable("idCompte") int idCompte) {
		return new ResponseEntity<Boolean>(espaceConseillerService.closeClientCompte(idCompte), HttpStatus.OK);
	}
	
	@Override
	@GetMapping("/conseiller/demandes")
	public ResponseEntity<List<Demande>> findAllDemandes(int idConseiller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PostMapping("/conseiller/demandes/{idDemande}")
	public ResponseEntity<Boolean> validateDemande(@PathVariable("idDemande") int idDemande, @RequestBody String typeDemande) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@DeleteMapping("/conseiller/demandes/{idDemande}")
	public ResponseEntity<Boolean> refuseDemande(@PathVariable("idDemande") int idDemande) {
		// TODO Auto-generated method stub
		return null;
	}
}
