package oops;

interface Animal {
    void makeSound(); // Abstract method

    default void eat() { // Concrete method
        System.out.println("This animal is eating.");
    }
}

// Define an abstract class with both abstract and concrete methods
abstract class Pet {
    abstract void play(); // Abstract method

    void sleep() { // Concrete method
        System.out.println("Pet is sleeping.");
    }
}

// Create a class that extends the abstract class and implements the interface
class Dog extends Pet implements Animal {
    // Implement the abstract method from Animal interface
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    // Implement the abstract method from Pet abstract class
    void play() {
        System.out.println("Dog is playing.");
    }
}

public class ConcreteMethodExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // Using methods from the Animal interface
        myDog.makeSound();
        myDog.eat();
        
        // Using methods from the Pet abstract class
        myDog.play();
        myDog.sleep();
    }
}
