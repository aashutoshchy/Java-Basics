public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 9, 2, 8, 3, 5, 4 };
        String[] fruits = { "apple", "orange", "banana" };

        // int target = 2;
        String target = "orange";
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (target == fruits[i]) {
                System.out.println("Elements found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Target Not Found.");
        }
    }
}