package com.example.person.configuration;

import com.example.person.domain.Gender;
import com.example.person.domain.Person;
import com.example.person.repo.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class PersonConfig {
    PersonRepository repository;

    public PersonConfig(PersonRepository repository) {
        this.repository = repository;
    }

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository repository) {
        return args -> {
            Person janis = new Person("Janis", "Ozols","021290-12334",Gender.Male, LocalDate.of(1990, 12, 2));
            Person ieva = new Person("Ieva", "Dzerve","061095-12325", Gender.Female, LocalDate.of(1995, 10, 6));
            Person aldis = new Person("Aldis", "Zarins","030597-12312", Gender.Male, LocalDate.of(1997, 5, 3));
            Person zane = new Person("Zane","Abolina","061191-12346", Gender.Female, LocalDate.of(1991,11,6));
            Person bruno = new Person("Bruno","Zirnis","100203-12333", Gender.Male, LocalDate.of(2003,2,10));
            Person aija = new Person("Aija","Viksna","230845-12334", Gender.Female, LocalDate.of(1945,8,23));
            Person zigurds = new Person("Zigurds","Veinbergs","070794-12332", Gender.Male, LocalDate.of(1994,7,7));

            repository.saveAll(List.of(janis,ieva,aldis,zane,bruno,aija,zigurds));
        };
    }
}
