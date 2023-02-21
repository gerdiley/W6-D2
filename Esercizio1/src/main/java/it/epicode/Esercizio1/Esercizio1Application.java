package it.epicode.Esercizio1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.epicode.Esercizio1.entity.Person;
import it.epicode.Esercizio1.service.PersonSrv;

@SpringBootApplication
public class Esercizio1Application implements CommandLineRunner {
	
	@Autowired
	private PersonSrv ps;

	public static void main(String[] args) {
		SpringApplication.run(Esercizio1Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		boolean populate = false;
		if(populate) {
			makeUser();
		}
	}
	
	public void makeUser() {
		
		Person p1 = Person.builder()
				.fullname("Angelo Midolo")
				.username("Angelo")
				.build();
		
		Person p2 = Person.builder()
				.fullname("Mario Rossi")
				.username("Mrossi")
				.build();
		
		Person p3 = Person.builder()
				.fullname("Gerardo Di Letizia")
				.username("Gerardo")
				.build();
		
		Person p4 = Person.builder()
				.fullname("Luca Verdi")
				.username("Luca")
				.build();
		
		ps.save(p1);
		ps.save(p2);
		ps.save(p3);
		ps.save(p4);
	}

}
