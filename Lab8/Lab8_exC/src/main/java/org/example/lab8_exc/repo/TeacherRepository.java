package org.example.lab8_exc.repo;

import org.example.lab8_exc.model.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Integer> {
}
