package org.example.lab8_exb.repo;

import org.example.lab8_exb.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
