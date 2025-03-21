package org.example.lab8_exa.repo;

import org.example.lab8_exa.model.Hotel;
import org.springframework.data.repository.CrudRepository;

/**
 * HotelRepository is a Spring Data repository interface for managing Hotel entities.
 * It extends CrudRepository, which provides built-in CRUD operations.
 */
public interface HotelRepository extends CrudRepository<Hotel, Integer> {
}

// In future labs, we will use the methods from these repositories to
// create, read, update, and delete data from our database.