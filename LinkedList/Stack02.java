import java.util.*;

public class Stack02 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");

        for (String word : sc.nextLine().split(" ")) {
            stack.push(word);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}