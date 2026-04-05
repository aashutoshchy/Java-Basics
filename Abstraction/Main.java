abstract class Vehicle{
    String brand;

    public void displayInfo() {
        System.out.println("Vehicles info are....");
    }

    public abstract void speed();
}

class Car extends Vehicle {
    public void methodInCar() {
        System.out.println("Methods in car class...");
    }

    public void speed() {
        System.out.println("Car's Speed is: 2000kph");
    }
}

public class Main {
    public static void main(String[] args) {
        Car byd = new Car();
        byd.displayInfo();
        byd.methodInCar();
    }
}
