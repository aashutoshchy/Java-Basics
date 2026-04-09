interface Prey {

    void flee();
}

interface Predator {
    void hunt();
}

class Fish {

}

class Rabbit implements Prey {
    @Override
    public void flee() {
        System.out.println("The rabbit runnning is away.");
    }
}

class Hawk implements Predator {
    @Override
    public void hunt() {
        System.out.println("The hawk is hunting...");
    }
}

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();

        rabbit.flee();
        hawk.hunt();
    }
}
