import java.util.LinkedList;

public class LinkedList00 {

    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.addFirst(4);
        nums.addLast(8);
        System.out.println(nums);

        if (nums.isEmpty()) {
            System.out.println("List is Empty.");
        } else {
            System.out.println("List is not Empty");
        }
    }
}