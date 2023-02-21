package it.epicode.Esercizio1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.epicode.Esercizio1.entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {

}
