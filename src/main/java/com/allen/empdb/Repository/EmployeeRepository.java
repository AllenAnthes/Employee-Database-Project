package com.allen.empdb.Repository;

import com.allen.empdb.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByFirstNameIgnoreCaseAndLastNameIgnoreCaseOrderByLastNameAsc(String firstName, String lastName);
    List<Employee> findByFirstNameIgnoreCaseOrderByLastNameAsc(String firstName);
    List<Employee> findByLastNameIgnoreCaseOrderByLastNameAsc(String firstName);



}
