import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        // // To Generate Random Integers
        // int num1, num2, num3;

        // num1 = random.nextInt(1, 7);
        // num2 = random.nextInt(1, 7);
        // num3 = random.nextInt(1, 7);
        // System.out.print(num1);
        // System.out.print(num2);
        // System.out.print(num3);

        // // To Generate Random Doubles
        // double num;
        // num = random.nextDouble();
        // System.out.println(num);

        // To Generate Random Booleans
        boolean isHeads;
        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }

    }
}
