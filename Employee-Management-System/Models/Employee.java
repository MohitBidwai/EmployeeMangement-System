package Models;


public class Employee {
    private final Integer id;
    private  String name;
    private  String department;
    private  Double salary;
    
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }
    public Employee(Integer id, String name, String department, Double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public Double getSalary() {
        return salary;
    }

    public void setName(String name )
    {
        this.name = name;
    }
    public void setDept(String department)
    {
        this.department = department;
    }
    public void setSalary(Double salary )
    {
        this.salary = salary;
    }
    
    

}