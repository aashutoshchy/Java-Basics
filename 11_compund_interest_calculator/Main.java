import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principle, rate, amt;
        int time, years;

        System.out.print("Enter principle amount: ");
        principle = scanner.nextDouble();

        System.out.print("Enter rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter time: ");
        time = scanner.nextInt();

        System.out.print("Enter Years: ");
        years = scanner.nextInt();

        amt = principle * Math.pow(1 + rate / time, time * years);

        System.out.printf("The amount after %d years is $%.2f", years, amt);

        scanner.close();
    }
}