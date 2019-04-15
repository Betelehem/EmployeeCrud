package edu.mum.employeecrud.controller;

import edu.mum.employeecrud.domain.Employee;
import edu.mum.employeecrud.service.AddressService;
import edu.mum.employeecrud.service.EmployeeService;
import edu.mum.employeecrud.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class employeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    AddressService addressService;
    @Autowired
    PositionService positionService;

    @GetMapping("/addEmployee")
    public String addEmployee(@ModelAttribute("employee") Employee employee, Model model){
        model.addAttribute("positions",positionService.findAll());

        return "addEmployee";
    }
    @PostMapping("/addEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
     Employee saveDemp= employeeService.save(employee);
        return "redirect:/addEmployee";
    }
    @GetMapping("/listofEmployee")
    public String listEmployee(Model model){
        model.addAttribute("employees",employeeService.findAll());
        return "listofEmployee";
    }


    @GetMapping("/update")
    public String updateEmp(@ModelAttribute("empId")Long empId, Model model){
        Employee employee = employeeService.findById(empId);
        model.addAttribute("employee", employee);
        model.addAttribute("positions",positionService.findAll());
       // model.addAttribute("address",addressService.findAll());
        return "addEmployee";
    }



}
