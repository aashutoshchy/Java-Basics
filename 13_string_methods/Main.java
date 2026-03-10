public class Main {
    public static void main(String[] args) {

        // String name = "Aashutosh Chaudhary";

        // int length = name.length();
        // System.out.printf("Length is: ", length);

        // char letter = name.charAt(3);
        // System.out.println(letter);

        // int index = name.indexOf(" ");
        // System.out.println(index);

        // String nameInUpr = name.toUpperCase();
        // System.out.println(nameInUpr);

        // String nameInLwr = name.toLowerCase();
        // System.out.println(nameInLwr);

        // Triming whit space
        // String wrd = " Hello. ";
        // String trimmedWord = wrd.trim();
        // System.out.println(trimmedWord);

        String usrName = "Rosie";
        if (usrName.contains(" ")) {
            System.out.println("User name should not contains space.");
        } else {
            System.out.println("Success!");
        }
    }
}
