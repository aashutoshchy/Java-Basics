public class Main {
    public static void main(String[] Args) {
        // .substring() = A method used to extract a portion of a string
        // .substring(start, end)

        // String email = "ashutosh@gmail.com";
        // String username = email.substring(0, 8);
        // String domain = email.substring(9, 18);

        // System.out.println(username);
        // System.out.println(domain);

        String email = "ashutoshchy@gmail.com";
        String username = email.substring(0, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1);

        System.out.println(username);
        System.out.println(domain);
    }
}
