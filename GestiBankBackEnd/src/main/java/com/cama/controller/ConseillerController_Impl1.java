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

import com.cama.dao.ConseillerDao;
import com.cama.model.Conseiller;

@RestController
public class ConseillerController_Impl1 implements ConseillerController {
	
	@Autowired
	private ConseillerDao conseillerDAO;
	
	@Override
	@GetMapping("/conseillers")
	public ResponseEntity<List<Conseiller>> findAllConseillers() {
		List<Conseiller> conseillers = conseillerDAO.findAllConseillers();
		
		if(conseillers == null) {
			return new ResponseEntity<List<Conseiller>>(HttpStatus.NOT_FOUND);
		}
		
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
	public ResponseEntity<Boolean> createConseiller(@RequestBody Conseiller conseiller) {
		conseillerDAO.createConseiller(conseiller);
				
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@Override
	@DeleteMapping("/conseillers/{id}")
	public ResponseEntity<Boolean> deleteConseillerById(@PathVariable("id") int id) {
		if(conseillerDAO.findConseillerById(id) == null) {
			return new ResponseEntity<Boolean>(false, HttpStatus.NOT_FOUND);
		}
		
		conseillerDAO.deleteConseiller(conseillerDAO.findConseillerById(id));
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@Override
	@PutMapping("/conseillers/{id}")
	public ResponseEntity<Boolean> updateConseillerById(@PathVariable("id")int id, @RequestBody Conseiller conseiller) {
		if(conseillerDAO.findConseillerById(id) == null) {
			return new ResponseEntity<Boolean>(false, HttpStatus.NOT_FOUND);
		}
		
		conseillerDAO.updateConseiller(conseillerDAO.findConseillerById(id));
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
}