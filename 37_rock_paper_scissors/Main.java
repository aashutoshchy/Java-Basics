import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };
        String playerChoice;
        String compChoice;

        System.out.print("Enter your move: ");
        playerChoice = scanner.nextLine().toLowerCase();

        if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
            System.out.println("Invalid Choice");
        }

        compChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice: " + compChoice);

        if (playerChoice.equals(compChoice)) {
            System.out.println("It's a Tie");
        } else if (playerChoice.equals("rock") && compChoice.equals("scissors")) {
            System.out.println("You win");
        } else if (playerChoice.equals("paper") && compChoice.equals("rock")) {
            System.out.println("You win");
        } else if (playerChoice.equals("scissors") && compChoice.equals("paper")) {
            System.out.println("You win");
        } else {
            System.out.println("You loose!");
        }
        scanner.close();
    }
}
