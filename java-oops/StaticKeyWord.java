class Student {
    String name;
    static String school;
}

public class StaticKeyWord {
    public static void main(String[] args) {
        // Using Static, we can access through class.
        Student.school = "Herald College";
        Student s1 = new Student();
        s1.name = "Ashutosh";
        System.out.println(s1.name);
    }
}
