package com.anily.employee_management.dao;

import com.anily.employee_management.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
