package com.allen.empdb.controller;

import com.allen.empdb.Repository.EmployeeRepository;
import com.allen.empdb.model.Employee;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "employees", method = RequestMethod.GET)
    public List<Employee> list() {
        return employeeRepository.findAll();
    }

    @RequestMapping(value = "employees", method = RequestMethod.POST)
    public Employee create(@RequestBody Employee employee) {
        return employeeRepository.saveAndFlush(employee);
    }

    @RequestMapping(value = "employees/{id}", method = RequestMethod.GET)
    public Employee get(@PathVariable Long id) {
        return employeeRepository.findOne(id);
    }

    @RequestMapping(value = "employees/{id}", method = RequestMethod.PUT)
    public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
        Employee existingEmployee = employeeRepository.findOne(id);
        BeanUtils.copyProperties(employee, existingEmployee);
        return employeeRepository.saveAndFlush(existingEmployee);
    }

    @RequestMapping(value = "employee/{id}", method = RequestMethod.DELETE)
    public Employee delete(@PathVariable Long id) {
        Employee existingEmployee = employeeRepository.findOne(id);
        employeeRepository.delete(existingEmployee);
        return existingEmployee;
    }

}
