package com.example.person.controller;

import com.example.person.domain.Person;
import com.example.person.service.PersonService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api")
public class PersonController {

    PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/PersonalIdAndBirth")
    public ResponseEntity<Person> getPersonsByPersonalIdAndBirthDate(@RequestParam String personalId, @DateTimeFormat(pattern = "yyyy.MM.dd") LocalDate date) {
        Person newPerson = personService.getPersonsByPersonalIdAndBirthDate(personalId, date);
        return new ResponseEntity<>(newPerson, HttpStatus.OK);
    }
}
