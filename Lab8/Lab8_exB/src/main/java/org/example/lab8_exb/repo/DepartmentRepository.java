package org.example.lab8_exb.repo;

import org.example.lab8_exb.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}
