import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
           System.out.println("Enter a number: ");
           int num = scanner.nextInt();
           System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number.");
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divided by Zero!");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            scanner.close();
            System.out.println("This always execute!");
        }
    }
}
