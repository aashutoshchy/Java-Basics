public class Main {
    // Variable Arguments (Varargs) in Java allow a method to accept a flexible
    // number of parameters, making code more concise and reusable

    public static void main(String[] args) {
        System.out.println(add(1, 2, 3, 4));
        System.out.println(average(1, 2, 3, 4, 5, 6, 7));
    }

    static int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    static double average(double... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }
}
