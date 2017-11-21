package com.example.models;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String surname;

    @Column(name="BIRTH_DATE")
    private LocalDate birthDate;
}
