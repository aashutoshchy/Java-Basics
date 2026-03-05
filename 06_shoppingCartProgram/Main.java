import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Shopping Cart Program

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to purchase?: ");
        item = scanner.nextLine();

        System.out.print("Enter Quantity: ");
        quantity = scanner.nextInt();

        System.out.print("Enter the Price: ");
        price = scanner.nextDouble();

        total = quantity * price;

        System.out.println("Your Total Price for " + item + " is " + currency + total);

        scanner.close();
    }
}