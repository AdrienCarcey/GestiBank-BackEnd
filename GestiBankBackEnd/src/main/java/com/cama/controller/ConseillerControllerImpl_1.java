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

import com.cama.dao.ConseillerDAO;
import com.cama.model.Conseiller;

@RestController
public class ConseillerControllerImpl_1 implements ConseillerController {
	
	@Autowired
	private ConseillerDAO conseillerDAO;
	
	@Override
	@GetMapping("/conseillers")
	public ResponseEntity<List<Conseiller>> findAllConseiller() {
		List<Conseiller> conseillers = conseillerDAO.findAllConseiller();
		
		return new ResponseEntity<List<Conseiller>>(conseillers, HttpStatus.OK);
	}

	@Override
	@GetMapping("/conseillers/{id}")
	public ResponseEntity<Conseiller> findConseillerById(@PathVariable("id") int id) {
		Conseiller conseiller = conseillerDAO.findConseillerById(id);
		
		if(conseiller == null) {
			return new ResponseEntity<Conseiller>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Conseiller>(conseiller, HttpStatus.OK);
	}

	@Override
	@PostMapping("/conseillers")
	public ResponseEntity<Conseiller> createConseiller(@RequestBody Conseiller conseiller) {
		conseillerDAO.createConseiller(conseiller);
				
		return new ResponseEntity<Conseiller>(conseiller, HttpStatus.OK);
	}

	@Override
	@DeleteMapping("/conseillers/{id}")
	public ResponseEntity<Integer> deleteConseillerById(@PathVariable("id") int id) {
		if(conseillerDAO.deleteConseillerById(id) == null) {
			return new ResponseEntity<Integer>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
	}

	@Override
	@PutMapping("/conseillers/{id}")
	public ResponseEntity<Conseiller> updateConseillerById(@PathVariable("id")int id, @RequestBody Conseiller conseiller) {
		conseiller = conseillerDAO.updateConseillerById(id, conseiller);
		
		if(conseiller == null) {
			return new ResponseEntity<Conseiller>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Conseiller>(conseiller, HttpStatus.OK);
	}
}