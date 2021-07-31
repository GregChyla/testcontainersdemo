package com.example.testcontainersdemo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@NoArgsConstructor
@Getter
@Setter
@Entity
@SequenceGenerator(name = "person_sequence", sequenceName = "person_sequence", initialValue = 1, allocationSize = 1)
public class Person {

    @Id
    @GeneratedValue(generator = "person_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstName;
    private String lastName;
}
