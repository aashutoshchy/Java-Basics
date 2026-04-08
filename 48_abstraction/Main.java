abstract class Shape {
    abstract double area(); // Abstract method

    void display() { // Concrete
        System.out.println("This is a shape");
    }
}

class Cirlce extends Shape {

    double radius;

    Cirlce(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {

    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return (1.0 / 2.) * base * height;
    }
}

class Rectangle extends Shape {

    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Cirlce cirlce = new Cirlce(4.2);
        Triangle triangle = new Triangle(4.2, 5.3);
        Rectangle rectangle = new Rectangle(5, 6);

        System.out.println(cirlce.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
