import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);

        double radius, circum, area, volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circum = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("Circumfarence is: " + circum);
        System.out.println("Area is: " + area);
        System.out.println("Volume is: " + volume);

        scanner.close();

    }
}
