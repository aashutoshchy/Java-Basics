class Calculator {
    void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    void add(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(4, 5);

        cal.add(1, 2, 3);

        cal.add(2.4, 3.4);
    }
}