package it.epicode.Esercizio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.Esercizio1.entity.Person;
import it.epicode.Esercizio1.repo.PersonRepo;

@Service
public class PersonSrv {
	
	@Autowired
	private PersonRepo pr;
	
	public Person save(Person p) {
		return pr.save(p);
	}
	
	public List<Person> getList() {
		return pr.findAll();
	}
}
