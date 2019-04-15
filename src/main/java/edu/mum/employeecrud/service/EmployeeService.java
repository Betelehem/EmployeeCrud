package edu.mum.employeecrud.service;

import edu.mum.employeecrud.domain.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee findById(Long id);
    public List<Employee> findAll();
    public Employee save(Employee emp);
}
