package org.example.lab8_exc.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Teacher {

    @Id
    private int id; // use as primary key
    private String name;

    @ManyToOne
    private Department teachesIn;

    @JoinColumn
    @OneToMany
    private List<Module> modules;
}
