abstract class Vehicle {

    abstract void go();
}

class Car extends Vehicle {
    @Override
    void go() {
        System.out.println("You drive the Car");
    }
}

class Bike extends Vehicle {
    @Override
    void go() {
        System.out.println("You ride the bike");
    }
}

class Boat extends Vehicle {
    @Override
    void go() {
        System.out.println("You sail the boat");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = { car, bike, boat };

        for (Vehicle vehicle : vehicles) {
            System.out.print(vehicle);
        }

        // car.go();
        // bike.go();
        // boat.go();
    }
}
