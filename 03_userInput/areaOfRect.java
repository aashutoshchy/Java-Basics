import java.util.Scanner;

public class areaOfRect {
    public static void main(String[] args) {
        double length = 0;
        double breadth = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Length: ");
        length = scanner.nextDouble();

        System.out.print("Enter Breadth: ");
        breadth = scanner.nextDouble();

        area = length * breadth;

        System.out.println("Area is: " + area + "cm2");

        scanner.close();
    }
}
