package com.example.Devops.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

@Entity
@Table(name="employee")
@Getter@Setter@AllArgsConstructor
public class Employee implements Serializable {
    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @NotEmpty
    @Length(max = 30)
    private String name;

    @Min(18)
    @Max(50)
    private int age;

    @Length(max = 30)
    private String city;

    @Positive
    private double salary;

    @Email
    private String email;

    @AssertTrue
    private boolean acceptingTermsOfUse;

}
