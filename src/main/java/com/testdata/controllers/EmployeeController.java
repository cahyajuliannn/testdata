package com.testdata.controllers;

import com.testdata.models.entities.Employee;
import com.testdata.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/{id}")
    public Employee getById(@PathVariable String id){
        return employeeService.getById(id);
    }

    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/slave/{slave}")
    public List<Employee> getAllEmployeeBySlave(@PathVariable String slave){
        return employeeService.getEmployeeBySlave(slave);
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping
    public String deleteAllEmployee(){
        return employeeService.deleteAllEmployee();sdsa
    }
}
