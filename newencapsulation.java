// A class that demonstrates encapsulation
class Student {
    // Private variables to prevent direct access
    private String name;
    private int age;
    
    // Public method to set the name
    public void setName(String name) {
        this.name = name;
    }
    
    // Public method to get the name
    public String getName() {
        return this.name;
    }

    // Public method to set the age
    public void setAge(int age) {
        if (age > 0) { // Validation check
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }
    
    // Public method to get the age
    public int getAge() {
        return this.age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a new Student object
        Student student = new Student();

        // Set the student's details using setter methods
        student.setName("Rahul");
        student.setAge(20);

        // Get and print the student's details using getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
