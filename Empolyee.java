// Base class (Parent class)
class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

// Derived class (Child class)
class Manager extends Employee {
    String department;

    // Constructor for Manager
    Manager(String name, int id, double salary, String department) {
        super(name, id, salary); // Calling parent class constructor
        this.department = department;
    }

    // Overriding displayDetails method
    @Override
    void displayDetails() {
        super.displayDetails(); // Call parent class method
        System.out.println("Department: " + department);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp1 = new Employee("Rahul Sharma", 101, 50000);
        emp1.displayDetails();

        System.out.println();

        // Creating a Manager object
        Manager mgr1 = new Manager("Anita Mehta", 201, 75000, "IT");
        mgr1.displayDetails();
    }
}
