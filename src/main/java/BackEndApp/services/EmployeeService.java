package BackEndApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BackEndApp.repository.EmployeeRepository;
import BackEndApp.models.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> getEmployees(){
		
		return repo.findAll();
	}
	
	public String uploadEmployee(Employee emp)
	{
		String Result="OK";
		try {
		  repo.save(emp);
		}
		catch(Exception ex) {
			Result="Error";
		}
		return Result;
	}
	
	public String updateEmployee(Employee emp)
	{
		String Result="OK";
		try {
		  repo.save(emp);
		}
		catch(Exception ex) {
			Result="Error";
		}
		return Result;
	}
}
