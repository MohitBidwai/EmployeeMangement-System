package Service;

import Models.Employee;
import Repo.EmployeeRepo;
import java.util.*;

public class EmployeeServiceImpl implements  EmployeeService{

    private final EmployeeRepo employeeRepo;

    public EmployeeServiceImpl (EmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    @Override 
    public String addEmployee(Employee employee)
    {
        return  employeeRepo.save(employee);
    }

    @Override 
    public List<Employee> viewEmployee()
    {
       return  employeeRepo.findEmployee();

    }

    @Override 
    public Employee findEmployeeById(int id)
    {
        return employeeRepo.findById(id);
    }

    @Override 
    public Employee updateName(int id, String name)
    {
        return employeeRepo.updateByName(id,name);
    }
    @Override 
    public Employee updateDepartment(int id , String dept)
    {
        return employeeRepo.updateByDept(id, dept);
    }

    @Override 
    public Employee updateSalary(int id, Double salary)
    {
        return employeeRepo.updateBySalary(id,salary);
    }

    @Override 
    public String deleteEmployee(int id)
    {
         return employeeRepo.deleteById(id);
    }


}
