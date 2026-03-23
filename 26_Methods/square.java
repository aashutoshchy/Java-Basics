import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = scanner.nextInt();

        int sq = square(num);
        System.out.printf("Square is: %d", sq);
    }

    static int square(int num) {
        return num * num;
    }
}
