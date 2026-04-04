class Student {

    String name;
    int age;
    double gpa;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    void study() {
        System.out.println(this.name + " is studying.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ashutosh", 19, 4.0);
        Student student2 = new Student("Eren", 18, 3.9);
        Student student3 = new Student("Mikasa", 19, 3.7);

        // System.out.println(student1.name);
        // System.out.println(student1.age);
        // System.out.println(student1.gpa);

        // System.out.println(student2.name);
        // System.out.println(student2.age);
        // System.out.println(student2.gpa);

        // System.out.println(student3.name);
        // System.out.println(student3.age);
        // System.out.println(student3.gpa);

        student1.study();
        student2.study();
        student3.study();
    }
}
