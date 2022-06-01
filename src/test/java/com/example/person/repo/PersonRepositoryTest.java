package com.example.person.repo;
import com.example.person.domain.Gender;
import com.example.person.domain.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class PersonRepositoryTest {
    @Autowired
    private PersonRepository underTest;

    @AfterEach
    void tearDown(){
        underTest.deleteAll();
    }

    @Test
    void itShouldSelectByPersonalIdAndAndDateOfBirth() {
        //given
        String personalId = "021292-12334";
        LocalDate dateOfBirth = LocalDate.of(1992,12,2);

        Person person = new Person(
                "Aigars",
                "Odzins",
                personalId,
                Gender.Male,
                dateOfBirth
        );
        underTest.save(person);

        //when
       Optional <Person> newPerson = underTest.findAllByPersonalIdAndAndDateOfBirth(personalId,dateOfBirth);

        //then
      assertNotNull(newPerson);
      assertEquals(person.getPersonalId(),personalId);
      assertEquals(person.getDateOfBirth(),dateOfBirth);

    }


}