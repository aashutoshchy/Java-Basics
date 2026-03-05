import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // If/Elses

        // int age = 19;

        // if (age >= 18) {
        // System.out.println("You can cast a vote!");
        // } else {
        // System.out.println("You can't cast a vote.");
        // }

        // Else If
        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You can cast a vote!");
        } else if (age <= 0) {
            System.out.println("Enter correct age!");
        } else {
            System.out.println("You can't cast a vote.");
        }

    }
}
