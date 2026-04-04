import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java Quiz Game

        // Array of questions
        String[] questions = { "What is the main function of a router?",
                "Which part of the computer is considered the brain?", "What year was Facebook Launched?",
                "Who is knows as the father of computer?", "What was the first programming language?" };

        // 2D Array of Options
        String[][] options = {
                { "1. Storing Files", "2. Encrypting data", "3. Directing Internet Traffic", "4. Managing Password" },
                { "1. CPU", "2. Hard Drive", "3. RAM", "4. GPU" },
                { "1. 2000", "2. 2004", "3. 2006", "4. 2008" },
                { "1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage" },
                { "1. COBOL", "2. C", "3. Fortran", "4. Assembly" },
        };

        // Declare Variables
        int[] answers = { 3, 1, 2, 4, 3 };
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        // Welcome Message
        System.out.println("Welcome to the Java Quiz Game!");

        // Question (loop)
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!!!");
            }
        }

        System.out.println("Your final score is: " + score);

        scanner.close();
    }
}
