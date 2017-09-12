package com.allen.empdb.Repository;

import com.allen.empdb.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByFirstNameContainsIgnoreCaseOrLastNameContainsIgnoreCaseOrderByLastNameAsc(
            @Param("firstName") String firstName,@Param("lastName") String lastName);
    List<Employee> findByFirstNameIgnoreCaseOrderByLastNameAsc(String firstName);
    List<Employee> findByLastNameContainsIgnoreCaseOrderByLastNameAsc(@Param("lastName") String lastName);
    List<Employee> findByTrade(@Param("trade") String trade);

}
