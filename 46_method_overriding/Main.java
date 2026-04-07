class Cat extends Animal {

}

class Dog extends Animal {

}

class Fish extends Animal {
    @Override
    void move() {
        System.out.println("This animal is swimming.");
    }
}

class Animal {

    void move() {
        System.out.println("This animal is running.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }
}
