package org.example.lab8_exc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Module {

    @Id
    private int id; // use as primary key
    private String name;
    private String code;

    // This means the 'modules' field in Department owns the relationship
    @ManyToMany(mappedBy = "modules")
    private List<Department> departments;
}
