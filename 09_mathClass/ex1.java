import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        // HYPOTENUSE c = Math.sqrt(a²+b²)

        Scanner scanner = new Scanner(System.in);

        double a, b, c;
        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        System.out.println(a);
        System.out.println(b);

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.print("The hypotenuse (side c) is: " + c + "CM");

        scanner.close();

    }
}
