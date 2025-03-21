package org.example.lab8_exb.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {

    @Id
    private int id;
    private String name;

    @JoinColumn
    @OneToMany
    private List<Employee> teachers;

    @JoinColumn
    @OneToMany
    private List<Employee> researchers;

    @OneToOne
    private Employee headOfDepartment;
}
