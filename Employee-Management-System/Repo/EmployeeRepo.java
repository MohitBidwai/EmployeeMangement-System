package Repo;

import java.util.ArrayList;
import java.util.List;

import Models.*;

public class EmployeeRepo {

    private final List<Employee> empList = new ArrayList<>();

    public String save(Employee employee) {

        empList.add(employee);
        return "Employee added successfully: ";

    }

    public List<Employee> findEmployee()
    {
        return empList;
    }

    public Employee findById(int id)
    {
        return  empList.stream().filter(e->e.getId().equals(id)).findFirst().orElse(null);
    }

    

    public  Employee updateByName(int id , String name)
    {
       Employee emp = empList.stream().filter(e->e.getId()==id).findFirst().orElse(null);
       emp.setName(name);
       return  emp;

    }
    public  Employee updateByDept(int id , String dept)
    {
      Employee emp = empList.stream().filter(e->e.getId()==id).findFirst().orElse(null);
      emp.setDept(dept);
      return emp;
    }
    public  Employee updateBySalary(int id , Double salary)
    {
        Employee emp = empList.stream().filter(e->e.getId()==id).findFirst().orElse(null);
        emp.setSalary(salary);
        return emp;
    }

    public String deleteById(int id)
    {

        Employee emp = empList.stream().filter(e->e.getId()==id).findFirst().orElse(null);
        empList.remove(emp);
        return "Employee deleted successfully";

    }
}
