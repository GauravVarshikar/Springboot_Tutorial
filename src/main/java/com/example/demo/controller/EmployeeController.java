package com.example.demo.controller;

import com.example.demo.pojo.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class EmployeeController {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello World!";
    }

    @GetMapping("/employees/{name}")
    public Employee getEmployees(@PathVariable String name) {
        return new Employee(1, "Gaurav", "Varshikar", 10000);
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        employee.setFirstName(employee.getFirstName().toUpperCase());
        employee.setLastName(employee.getLastName().toUpperCase());
        return employee;
    }
}
