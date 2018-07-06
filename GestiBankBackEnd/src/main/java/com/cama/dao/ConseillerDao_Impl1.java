package com.cama.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cama.model.Conseiller;

@Repository("conseillerDAO")
public class ConseillerDao_Impl1 implements ConseillerDao {
	
	//Fake DataBase
	private static List<Conseiller> conseillers;
	{
		conseillers = new ArrayList<Conseiller>();
		conseillers.add(new Conseiller());
		conseillers.add(new Conseiller());
	}
	
	//Constructor
	public ConseillerDao_Impl1() {
		super();
	}
	
	//Methods
	@Override
	public List<Conseiller> findAllConseillers() {
		return conseillers;
	}

	@Override
	public Conseiller findConseillerById(int id) {
		for(Conseiller c : conseillers) {
			if(c.getIdUtilisateur() == id) {
				return c;
			}
		}
		
		return null;
	}

	@Override
	public void createConseiller(Conseiller conseiller) {
		conseiller.setIdUtilisateur(conseillers.size());
		conseillers.add(conseiller);
	}

	@Override
	public void deleteConseiller(Conseiller conseiller) {
		conseillers.remove(conseiller);
	}

	@Override
	public void updateConseiller(Conseiller conseiller) {
		conseillers.add(conseiller);
	}
}