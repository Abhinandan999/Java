// Define the first interface
interface Animal {
    void eat();
}

// Define the second interface
interface Pet {
    void play();
}

// Define a class that implements both interfaces
class Dog implements Animal, Pet {
    @Override
    public void eat() {
        System.out.println("The dog is eating.");
    }

    @Override
    public void play() {
        System.out.println("The dog is playing.");
    }
}

// Main class to run the example
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.play();
    }
}
