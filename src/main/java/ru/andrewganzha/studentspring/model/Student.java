package ru.andrewganzha.studentspring.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateofBirth;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;
}
