package com.allen.empdb.model.projections;

import com.allen.empdb.model.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "employeeDetailView", types = {Employee.class})
public interface EmployeeDetailView {

    @Value("#{target.firstName} #{target.lastName}")
    String getFullName();

    String getFirstName();
    String getLastName();
    Integer getPhoneNumber();
}
