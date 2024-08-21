package org.example.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name ="person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id", nullable = false, unique = true)
    private long id;

    @Column(name = "name", nullable = false, length = 60)
    private String name;

    @Column(name ="lastName", nullable = false,length = 60)
    private String lastName;

    public Person(String name,String lastName){
        this.name = name;
        this.lastName = lastName;
    }
}
