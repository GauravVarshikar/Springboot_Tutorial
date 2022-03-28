package com.example.demo.controller;

import com.example.demo.jdbc.EmployeeDAO;
import com.example.demo.jdbc.EmployeeDAOImpl;
import com.example.demo.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeDAO dao;

    @GetMapping("/employees")
    public String getEmployees(){
        dao.findAllEmployees();
        return "All employees retrieved";
    }
    @GetMapping("/employees/{name}")
    public Employee getEmployees(@PathVariable String name) {
        return new Employee(1, "Gaurav", "Varshikar", 10000);
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        employee.setFirstName(employee.getFirstName().toUpperCase());
        employee.setLastName(employee.getLastName().toUpperCase());
        dao.addEmployee(employee);
        return employee;
    }
}
