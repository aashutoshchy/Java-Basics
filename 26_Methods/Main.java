import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called ()

        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        greeting(name);
    }

    static void greeting(String name) {
        System.out.println("Hello " + name);
    }
}