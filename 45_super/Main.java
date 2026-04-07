class Person {
    String first;
    String last;

    Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    void showName () {
        System.out.println("Hi " + this.first + " " + this.last);
    }
}

class Student extends Person{
    double gpa;

    Student(String first, String last, double gpa) {
        super(first, last);
        this.gpa = gpa;
    }

    void showGPA() {
        System.out.println(this.first + "'s gpa is " + this.gpa);
    }
}

class Employee extends Person {
    int salary;

    Employee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.first + " salary is: " + this.salary);
    }
}

public class Main {
    public static void main(String[] Args) {
        Person person = new Person("Ashutosh", "Chaudhary");
        Student student = new Student("Mark", "Zukerburg", 3.25);
        Employee employee = new Employee("Traviss", "Scott", 50000);

        // person.showName();
        // student.showName();

        // student.showGPA();

        employee.showSalary();

    }
}