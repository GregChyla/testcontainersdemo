package com.example.testcontainersdemo.repository;

import com.example.testcontainersdemo.configuration.BaseDataJpaTest;
import com.example.testcontainersdemo.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PersonRepositoryTest extends BaseDataJpaTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void testPerson() {
        //GIVEN
        Person person = new Person();
        person.setFirstName("firstName");
        person.setLastName("lastName");

        //WHEN
        Person savedPerson = personRepository.save(person);

        //THEN
        assertNotNull(savedPerson);
        assertThat(savedPerson).isNotNull();
        assertThat(savedPerson.getId()).isEqualTo(1L);
        assertThat(savedPerson.getFirstName()).isEqualTo("firstName");
        assertThat(savedPerson.getLastName()).isEqualTo("lastName");
    }
}
