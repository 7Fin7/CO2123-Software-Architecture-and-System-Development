package org.example.lab8_exc.repo;

import org.example.lab8_exc.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}
