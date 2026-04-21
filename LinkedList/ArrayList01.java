import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Aashutosh");
        students.add("Merry");
        students.add("Carry");
        students.add("Jerry");
        students.add("Harry");

        students.remove("Jerry");

        for (String student : students) {
            System.out.println(student);
        }
    }
}