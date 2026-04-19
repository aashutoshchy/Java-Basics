class Car {
    private String model;
    private String color;
    private int price;

    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    int getPrice() {
        return this.price;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setModel(String model) {
        this.model = model;
    }

}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Charger", "Yellow", 10000);
        // System.out.println(car.getColor());
        // System.out.println(car.getModel());

        car.setColor("Blue");

        car.setModel("omething");

        System.out.println(car.getColor());
        System.out.println(car.getModel());

    }
}