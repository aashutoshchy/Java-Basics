import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Mlue", "Blue", "Yellow", "Purple"));

        for (String color : colors) {
            System.out.println(color);
        }

        Collections.shuffle(colors);
        System.out.println("After shuffling: " + colors);

        Collections.sort(colors);
        System.out.println("In Ascending Order: " + colors);
    }
}