package org.example.lab8_exa.repo;

import org.example.lab8_exa.model.Room;
import org.springframework.data.repository.CrudRepository;

/**
 * RoomRepository is a Spring Data repository interface for managing Room entities.
 * It extends CrudRepository, which provides built-in CRUD operations.
 */
public interface RoomRepository extends CrudRepository<Room, String> {
}

// In future labs, we will use the methods from these repositories to
// create, read, update, and delete data from our database.