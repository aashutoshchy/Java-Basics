import java.util.Scanner;

abstract class Animal {
    abstract void speak();
}


class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Woof.");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Meow.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Runtime Polymorphism = When the method that gets executed is decided at runtime based on the actual type of the object.
        Animal animal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like a Dog or a Car? (1: Dog, 2: Cat");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else {
            animal = new Dog();
            animal.speak();
        }


    }
}
