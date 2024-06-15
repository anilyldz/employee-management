package com.anily.employee_management.dao;

import com.anily.employee_management.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int employeeId);

    Employee save(Employee employee);

    void deleteById(int employeeId);
}
