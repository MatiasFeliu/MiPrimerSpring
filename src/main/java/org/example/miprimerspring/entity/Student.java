package org.example.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="students")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // genera id autoincremental
    @Column(name="id_estudiante", nullable = false) //indica que es columna en la BD y su nombre
    private long id;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(name = "apellido", nullable = true, length = 50)
    private String lastname;
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate birthDate;
    @Column(nullable = false, unique = true)
    private String email;
}
