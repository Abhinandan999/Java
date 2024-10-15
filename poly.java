// Parent class (Superclass)
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("This is a generic animal sound");
    }
}

// Subclass Dog that overrides the sound() method
class Dog extends Animal {
    // Method overriding
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat that overrides the sound() method
class Cat extends Animal {
    // Method overriding
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Parent reference, but child objects
        Animal myAnimal = new Animal();  // Animal object
        Animal myDog = new Dog();        // Dog object
        Animal myCat = new Cat();        // Cat object

        // Calling the overridden methods
        myAnimal.sound();  // Output: This is a generic animal sound
        myDog.sound();     // Output: Dog barks
        myCat.sound();     // Output: Cat meows
    }
}
