package com.example.test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Setter;
import lombok.Getter;

@Setter
@Entity
public class Student {
    private Long id;
    @Getter
    private String first;
    @Getter
    private String last;
    @Getter
    private int num;
    @Getter
    private float av;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
}
