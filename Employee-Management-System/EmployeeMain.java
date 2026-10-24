import java.util.*;

import Models.Employee;
import Repo.EmployeeRepo;
import Service.EmployeeService;
import Service.EmployeeServiceImpl;

public class EmployeeMain {

    private static EmployeeRepo employeeRepo = new EmployeeRepo();
    private static EmployeeService employeeService = new EmployeeServiceImpl(employeeRepo);
    private static Scanner sc = new Scanner(System.in);
    // private static EmployeeMain employeeMain = new EmployeeMain(employeeService);

    // public EmployeeMain(EmployeeService employeeService)
    // {
    // this.employeeService = employeeService;
    // }

    public static String addEmployee() {

        System.out.println("Enter the id of the employee: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the employee: ");
        String Name = sc.nextLine();
        System.out.println("Enter the dept of the employee: ");
        String dept = sc.nextLine();
        System.out.println("Enter the salary of the employee: ");
        Double salary = sc.nextDouble();
        Employee employee = new Employee(id, Name, dept, salary);
        return employeeService.addEmployee(employee);

    }

    public static void viewEmployee() {
        List<Employee> list = employeeService.viewEmployee();
        list.forEach(e -> System.out.println(e));
    }

    public static void findEmployeeById() {
        System.out.println("Enter the id of the employee: ");
        int id = sc.nextInt();
        Employee emp = employeeService.findEmployeeById(id);
        System.out.println(emp);
    }

    public static void deleteEmployee()
    {
        System.out.println("Enter the id of the employee you want to delete: ");
        int id = sc.nextInt();
        System.out.println(employeeService.deleteEmployee(id)) ;
    }

    public static void updateEmployee() {
        System.out.print("Enter the id of the imployee you want to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the choice you want to update: ");
        System.out.println("1: Name ");
        System.out.println("2: Department ");
        System.out.println("3: Salary ");

        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter the new name you want to update");
                String name = sc.nextLine();
                Employee emp = employeeService.updateName(id, name);
                System.out.println(emp);

            }

            case 2 -> {
                System.out.println("Enter the new dept you want to update");
                String dept = sc.nextLine();
                Employee emp = employeeService.updateDepartment(id, dept);
                System.out.println(emp);

            }

            case 3 -> {
                System.out.println("Enter the new salary you want to update ");
                Double salary = sc.nextDouble();
                Employee emp = employeeService.updateSalary(id, salary);
                System.out.println(emp);
            }

            default -> System.out.println("Invalid Choice");

        }

    }

    public static void main(String[] args) {

        int value;
        do {

            System.out.println("Employee Management System");
            System.out.println("Choose an option:");
            System.out.println("1. ADD Employee: ");
            System.out.println("2. View Employee: ");
            System.out.println("3. Find Employee by ID: ");
            System.out.println("4. Delete Employee: ");
            System.out.println("5. Update  Employee: ");
            System.out.println("6. Search Employee by Dept: ");
            System.out.println("7. Sort Employee by salary: ");
            System.out.println("   Enter your choice: ");
            Scanner sc = new Scanner(System.in);

            value = sc.nextInt();

            switch (value) {
                case 1 -> System.out.print(addEmployee());
                case 2 -> viewEmployee();
                case 3 -> findEmployeeById();
                case 4 -> updateEmployee();
                case 5 -> deleteEmployee();
                // case 6 -> searchByDepartment();
                // case 7 -> sortEmployeeBySalary();
                default -> System.out.print("Invalid choice");
            }
        } while (value != 8);

    }
}