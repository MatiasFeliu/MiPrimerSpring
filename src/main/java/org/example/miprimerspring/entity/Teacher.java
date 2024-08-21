package org.example.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id", nullable = false,unique = true)
    private Long id;

    @Column(name = "name",nullable = false,length = 60)
    private String name;

    @Column(name = "lastName",nullable = false,length = 60)
    private String lastName;

    @Column(name = "email",nullable = false,length = 70)
    private String email;

    @Column(name = "subject", nullable = false, length = 150)
    private String subject;

    public Teacher(String name,String lastName,String email,String subject){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.subject = subject;
    }
}
