import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int guess, attempts = 0;
        int randomNumber = random.nextInt(1, 10);

        System.out.print("Welcome to Number Guessing Game");
        System.out.println("Guess a number between 1-10");

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < randomNumber) {
                System.out.println("Too Low! Try again");
            } else if (guess > randomNumber) {
                System.out.println("Too High! Try again");
            } else {
                System.out.println("You have won!");
                System.out.println("Number of attempts: " + attempts);
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}
