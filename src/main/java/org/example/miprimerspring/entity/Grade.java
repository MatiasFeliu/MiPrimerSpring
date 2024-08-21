package org.example.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Grades")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="grade_id", nullable = false, unique = true)
    private Long id;

    @Column(name="grade_name", nullable = false, length = 90)
    private String gradeName;

    @Column(name = "Description", nullable = false, length = 200)
    private String description;

    public Grade(String gradeName,String description){
        this.gradeName = gradeName;
        this.description = description;
    }
}
