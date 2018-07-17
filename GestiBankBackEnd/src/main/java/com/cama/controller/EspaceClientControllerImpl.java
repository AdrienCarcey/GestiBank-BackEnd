package com.cama.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cama.model.Client;
import com.cama.model.Compte;
import com.cama.model.MessageClient;
import com.cama.model.OperationBancaire;
import com.cama.service.EspaceClientService;

@RestController
public class EspaceClientControllerImpl implements EspaceClientController {
	
	@Autowired
	private EspaceClientService espaceClientService;
	
	@Override
	@GetMapping("/client/comptes/{idClient}")
	public ResponseEntity<List<Compte>> findComptesById(@PathVariable("idClient") int idClient) {
		return new ResponseEntity<List<Compte>>(espaceClientService.findComptesById(idClient), HttpStatus.OK);
	}

	@Override
	@GetMapping("/client/operations/{idCompte}")
	public ResponseEntity<List<OperationBancaire>> findOperationsById(@PathVariable("idCompte") int idCompte) {
		return new ResponseEntity<List<OperationBancaire>>(espaceClientService.findOperationsById(idCompte), HttpStatus.OK);
	}

	@Override
	@PostMapping("/client/message")
	public ResponseEntity<Boolean> createMessageClient(@RequestBody MessageClient messageClient) {
		return new ResponseEntity<Boolean>(espaceClientService.createMessageClient(messageClient), HttpStatus.OK);
	}

	@Override
	@GetMapping("/client/{idClient}")
	public ResponseEntity<Client> getClientById(@PathVariable("idClient") int idClient) {
		return new ResponseEntity<Client>(espaceClientService.getClientById(idClient), HttpStatus.OK);
	}

}
