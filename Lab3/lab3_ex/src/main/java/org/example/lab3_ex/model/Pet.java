package org.example.lab3_ex.model;

// Simple Pet class
public class Pet {
    private String name;
    private String species;

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String toString() {
        return "Pet " + name + " is a " + species;
    }
}
