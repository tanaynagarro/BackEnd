package BackEndApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import BackEndApp.services.EmployeeService;
import BackEndApp.models.Employee;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;

	@GetMapping()
	public List<Employee> getEmployee(){
		return empservice.getEmployees();
	}
	
	@PostMapping()
	public String uploadEmployee(@RequestBody Employee emp)
	{
		String Result="Error";
		if(emp != null)
			Result=empservice.uploadEmployee(emp);
		
		return Result;
	}
	
	@PutMapping()
	public String updateEmployee(@RequestBody Employee emp)
	{
		String Result="Error";
		if(emp != null)
			Result=empservice.updateEmployee(emp);
		System.out.println("Hello");
		return Result;
	}
}
