package Service;

import Models.Employee;
import java.util.*;

public interface EmployeeService {

    public String addEmployee(Employee employee);

    public List<Employee> viewEmployee();

    public Employee findEmployeeById(int id);

    public Employee updateName(int id ,String name);

    public Employee updateDepartment(int id , String dept);

    public Employee updateSalary(int id, Double salary);

    public String deleteEmployee(int id);


}
