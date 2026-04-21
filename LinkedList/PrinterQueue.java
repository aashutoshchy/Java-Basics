import java.util.*;

public class PrinterQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Document1");
        queue.add("Document2");
        queue.add("Document3");

        queue.poll();

        queue.add("Document4");
        queue.add("Document5");

        System.out.println("Next job: " + queue.peek());

        System.out.println("Queue: " + queue);
    }
}