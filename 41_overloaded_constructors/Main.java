class User {
    String username;
    String email;
    int age;

    User(String username) {
        this.username = username;
        this.email = "Not Provided";
        this.age = 0;
    }

    User(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    User() {
        this.username = "Not Provided";
        this.email = "Not Provided";
        this.age = 0;
    }
}

public class Main {
    public static void main(String[] args) {

        User user1 = new User("aaashutoshchy_");
        User user2 = new User("mikasa", "mikasa@gmail.com", 20);
        User user3 = new User("leviiii", "levi@gmail.com");
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println("");

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println("");

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println("");

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
