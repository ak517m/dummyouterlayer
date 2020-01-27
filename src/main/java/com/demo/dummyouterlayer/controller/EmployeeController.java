package com.demo.dummyouterlayer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dummyouterlayer.model.Employee;
import com.demo.dummyouterlayer.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees/{empId}/address")
	public List<Employee> retrieveAddressForEmployee(@PathVariable String empId) {
		return employeeService.retrieveEmployeeInfo(empId);

	}
	
	@RequestMapping("/test")
    public String getTest()
    {
        return "Test1!";
    }

}
