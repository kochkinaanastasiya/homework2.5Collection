package com.homework2.Collection.homework2.Collection;

import java.util.Collection;

public interface EmployeeService {

    Employee addEmployee(String firstName, String lastName);
    Employee deleteEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
    Collection<Employee> findAllEmployee();
}
