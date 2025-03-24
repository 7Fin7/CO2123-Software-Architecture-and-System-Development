package org.example.lab8_exa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity    // Marks this class as a JPA entity, meaning it will be mapped to a database table
public class Hotel {

    @Id    // Specifies the primary key of the Hotel entity
    private int id;
    private String name;
    private String description;

    @OneToMany    // Defines a one-to-many relationship between Hotel and Room (one hotel can have many rooms)
    @JoinColumn(name = "hotel_id")   // Indicates that the foreign key column for the relationship will be in the "Room" table
    private List<Room> rooms;
}
