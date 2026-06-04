class Pen {
    String color;
    String type;
    
    public void write() {
        System.out.println("Writing something...");
    }

    public void printColor() {
        System.out.println("Color: " + this.color);
    }
}

class Student{
    String name;
    int age;

    // Compile Time Polymorphism 
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + age);
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "Red";
        // pen1.type = "Ball Pen";

        // Pen pen2 = new Pen();
        // pen2.color = "Blue";

        // pen1.write();
        // pen1.printColor();

        // pen2.printColor();

        Student s1 = new Student();
        s1.name = "Aashutosh Chaudhary";
        s1.age = 19;

        s1.printInfo("Ashutosh");
        s1.printInfo("Ashutosh", 19);
    }
}