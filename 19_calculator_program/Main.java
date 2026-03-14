import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum, secNum, result = 0;
        char op;
        boolean validOperation = true;

        System.out.print("Enter the first Number: ");
        firstNum = scanner.nextDouble();

        System.out.print("Enter the second Number: ");
        secNum = scanner.nextDouble();

        System.out.print("Enter and Operator(+, -, *, /): ");
        op = scanner.next().charAt(0);

        // Enhanced switch
        switch (op) {
            case '+' -> result = firstNum + secNum;
            case '-' -> result = firstNum - secNum;
            case '*' -> result = firstNum * secNum;
            case '/' -> {
                if (secNum == 0) {
                    System.out.println("Cannot Divide by 0");
                    validOperation = false;
                } else {
                    result = firstNum / secNum;
                }
            }
            default -> {
                System.out.println("Enter correct operation.");
                validOperation = false;
            }
        }

        if (validOperation) {
            System.out.printf("%.2f %c %.2f = %.2f", firstNum, op, secNum, result);
        }

        scanner.close();
    }
}