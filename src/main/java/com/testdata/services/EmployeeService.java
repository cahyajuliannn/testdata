package com.testdata.services;

import com.testdata.models.entities.Employee;
import com.testdata.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee (Employee employee){
        return employeeRepository.save(employee);
    }
    public Employee getById (String id){
        return employeeRepository.findById(id).get();
    }
    public List<Employee> getAllEmployee(){
        return  employeeRepository.findAll();
    }
    public List<Employee> getEmployeeBySlave(String slave){
        return employeeRepository.findBySlave(slave);
    }
    public String deleteAllEmployee(){
        employeeRepository.deleteAll();
        if (employeeRepository.findAll().isEmpty())
            return "Successfully deleted all data";
        else return "Something went wrong";
    }
}
