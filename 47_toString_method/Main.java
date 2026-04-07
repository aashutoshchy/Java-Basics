class Car {

    String make;
    String model;
    String color;
    int year;

    Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.color + " " + this.year + this.model;
    }

}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", "Red", 2025);
        System.out.println(car);

    }
}
