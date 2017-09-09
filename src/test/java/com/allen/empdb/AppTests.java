package com.allen.empdb;

import com.allen.empdb.Repository.EmployeeRepository;
import com.allen.empdb.controller.EmployeeController;
import com.allen.empdb.model.Employee;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class AppTests {

    @InjectMocks
    private EmployeeController ec;

    @Mock
    private EmployeeRepository employeeRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testEmployeeGet() {

        Employee emp = new Employee();
        emp.setId(1L);
        Mockito.when(employeeRepository.findOne(1L)).thenReturn(emp);
        Employee employee = ec.get(1L);
        Mockito.verify(employeeRepository).findOne(1L);

    }

}
