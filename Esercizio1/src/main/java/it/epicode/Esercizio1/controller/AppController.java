package it.epicode.Esercizio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.epicode.Esercizio1.entity.Person;
import it.epicode.Esercizio1.service.PersonSrv;

@RestController
@RequestMapping("/app")
public class AppController {
	
	@Autowired
	PersonSrv ps;
	
	@GetMapping("/data1")
	public String data1() {
		return "data 1 response";
	}
	
	@GetMapping("/data2")
	public List<Person> data2() {
		return ps.getList();
	}
	
	@GetMapping("/data3")
	@RequestMapping(value = "/data3", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> data3() {
		return ps.getList();
	}
}
