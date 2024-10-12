// Class to demonstrate encapsulation
public class Employee {
    // Private fields (variables) - encapsulated
    private String name;
    private int age;
    private double salary;

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'age'
    public int getAge() {
        return age;
    }

    // Setter method for 'age'
    public void setAge(int age) {
        if(age > 0) {  // Basic validation
            this.age = age;
        } else {
            System.out.println("Age should be positive.");
        }
    }

    // Getter method for 'salary'
    public double getSalary() {
        return salary;
    }

    // Setter method for 'salary'
    public void setSalary(double salary) {
        if(salary > 0) {  // Basic validation
            this.salary = salary;
        } else {
            System.out.println("Salary should be positive.");
        }
    }

    // Display method to print details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee();

        // Set values using setter methods
        emp.setName("John Doe");
        emp.setAge(30);
        emp.setSalary(50000);

        // Display employee details
        emp.displayDetails();

        // Trying to set negative age or salary (should show validation message)
        emp.setAge(-5);
        emp.setSalary(-1000);
    }
}
