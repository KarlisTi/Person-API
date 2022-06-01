package com.example.person.repo;

import com.example.person.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface PersonRepository extends  JpaRepository<Person, Long> {

    Optional<Person> findAllByPersonalIdAndAndDateOfBirth(String personalId, LocalDate dateOfBirth);

}
