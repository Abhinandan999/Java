// Define the Student class
class Student {
    // Attributes (fields) of the class
    private String name;
    private int age;
    private double grade;

    // Constructor to initialize the Student object
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

// Main class to test the Student class
public class StudentManagementSystem {
    public static void main(String[] args) {
        // Creating objects of the Student class
        Student student1 = new Student("Alice", 20, 89.5);
        Student student2 = new Student("Bob", 22, 76.8);

        // Displaying information about each student
        System.out.println("Student 1:");
        student1.displayInfo();

        System.out.println("\nStudent 2:");
        student2.displayInfo();

        // Modifying student details using setter methods
        student1.setName("Alice Johnson");
        student1.setGrade(91.0);

        // Display updated information
        System.out.println("\nUpdated Student 1:");
        student1.displayInfo();
    }
}
