package com.example.person.service;

import com.example.person.domain.Person;
import com.example.person.exceptions.PersonNotFoundException;
import com.example.person.repo.PersonRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class PersonService {

    PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public Person getPersonsByPersonalIdAndBirthDate(String personalId, LocalDate date) {
        return personRepository.findAllByPersonalIdAndAndDateOfBirth(personalId, date)
                .orElseThrow(() -> new PersonNotFoundException("Person by this " + personalId + " and " + date + " not found"));
    }
}


