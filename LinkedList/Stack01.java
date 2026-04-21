import java.util.Stack;

public class Stack01 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Read");
        stack.push("Write");
        stack.push("Code");

        stack.pop();

        stack.push("Debug");
        stack.push("Test");

        System.out.println("Top task: " + stack.peek());

        System.out.println("Stack: " + stack);
    }
}