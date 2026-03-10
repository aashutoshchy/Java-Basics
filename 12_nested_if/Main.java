import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter the any first number: ");
        a = scanner.nextInt();

        System.out.print("Enter the any second number: ");
        b = scanner.nextInt();

        System.out.print("Enter the any third number: ");
        c = scanner.nextInt();

        // Demonstratation of Nested if
        if (a > b && a > c) {
            System.out.printf("%d is greatest number.\n", a);
        } else if (b > a && b > c) {
            System.out.printf("%d is greatest number.\n", b);
        } else {
            System.out.printf("%d is greatest number.\n", c);
        }

        scanner.close();
    }
}
