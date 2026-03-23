public class Main {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name, but different
        // parameters
        System.out.println(add(1, 5));
        System.out.println(add(1, 5, 6));
    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int add(int num1, int num2, int num3) {
        return num1 + num2;
    }
}