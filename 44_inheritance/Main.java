class Organism {
    boolean isAlive;

    Organism() {
        isAlive = true;
    }
}

class Plant  extends Organism{
    void photosynthesize() {
        System.out.println("The plant absorbs sunlight");
    }
}


class Animal extends Organism{
    void eat() {
        System.out.println("The animal is eating");
    }
}

class Dog extends Animal{
    int lives = 1;

    void speak() {
        System.out.println("Woof!!!");
    }
}

class Cat extends Animal {
    int lives = 9;

    void speak() {
        System.out.println("Meowwww!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        // System.out.println(dog.lives);
        // System.out.println(cat.lives);

        // System.out.println(dog.isAlive);

        plant.photosynthesize();

    }
}
