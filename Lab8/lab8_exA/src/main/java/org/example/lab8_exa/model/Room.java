package org.example.lab8_exa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity    // Marks this class as a JPA entity, meaning it will be mapped to a database table
public class Room {

    @Id    // Specifies the primary key of the Room entity
    private String name;
    private String description;
    private String category;
    private int guests;
}
