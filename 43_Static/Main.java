class Friend {
    static int numOfFrnd = 0;
    String name;

    Friend(String name) {
        this.name = name;
        numOfFrnd++;
    }

    static void showFrd() {
        System.out.println("You have " + numOfFrnd + " total friends");
    }
    
}

public class Main {
    public static void main(String[] args) {
        Friend frd1 = new Friend("Ashutosh");
        Friend frd2 = new Friend("Ashutosh");

        // System.out.println(frd2.numOfFrnd);
        Friend.showFrd();
    }
}
