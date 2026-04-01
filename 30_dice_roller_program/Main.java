import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java Dice Roller Program

        Scanner scanner = new Scanner(System.in);

        // Declare Variable

        Random random = new Random();
        int numOfDice, total = 0;

        // Get # of Dice from the user
        System.out.println("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        // Check if the # of Dice > 0
        if (numOfDice > 0) {
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                // Get the Total
                total += roll;
            }
            System.out.println("Total: " + total);
        } else {
            System.out.println("Number of dice must be greater than 0.");
        }

    }

    // Display ASCII Of Dice
    static void printDie(int roll) {
        String dice1 = """
                 -------
                |       |
                |       |
                |       |
                 -------
                """;
    }
}