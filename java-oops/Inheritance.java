// import bank;

class Shape {
    String color;

    public void area() {
        System.out.println("Displays Area.");
    }
}

class Traingle extends Shape{
    public void area(int l, int b) {
        System.out.println(1/2*l*b);
    }
}

class EquilateralTriangle extends Traingle {
     public void area(int l, int b) {
        System.out.println(1/2*l*b);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14*r*r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Traingle t1 = new Traingle();
        t1.color = "red";

        // bank.Account a = new bank.Account();
    }
}
