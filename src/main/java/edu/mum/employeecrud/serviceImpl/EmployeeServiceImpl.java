package edu.mum.employeecrud.serviceImpl;

import edu.mum.employeecrud.domain.Employee;
import edu.mum.employeecrud.repository.EmployeeRepository;
import edu.mum.employeecrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> findAll() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee save(Employee emp) {
        return employeeRepository.save(emp);
    }
}
