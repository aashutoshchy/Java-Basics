public class Main {

    static int x = 3;

    public static void main(String[] args) {
        int x = 1; // LOCAL
        System.out.println(x);
        doSomething();
    }

    static void doSomething() {
        int x = 2; // Local
        System.out.println(x);
    }
}