package com.example.Devops.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

@Entity
@Table(name="student")
@Getter @Setter
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    public Student(){}

    public Student(String fullName, Integer psycoScore, Double graduationScore, String phone, String profilePicture) {
        this.fullName = fullName;
        this.psycoScore = psycoScore;
        this.graduationScore = graduationScore;
        this.phone = phone;
        this.profilePicture = profilePicture;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Length(max = 30)
    private String fullName;

    @Min(100)
    @Max(800)
    private int psycoScore;

    @Min(30)
    @Max(100)
    private Double graduationScore;

    @Length(max = 10)
    private String phone;

    @Length(max = 500)
    private String profilePicture;
}