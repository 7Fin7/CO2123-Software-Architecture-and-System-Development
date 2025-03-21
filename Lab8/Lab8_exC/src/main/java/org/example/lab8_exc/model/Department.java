package org.example.lab8_exc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Department {

    @Id
    private int id; // use as primary key
    private String name;

    // 'mappedBy' indicates that the 'teachesIn' field in the Teacher entity owns the relationship.
    @OneToMany(mappedBy = "teachesIn")
    private List<Teacher> teachers;

    @ManyToMany
    private List<Module> modules;
}
