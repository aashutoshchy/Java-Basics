public class main {

    public static void main(String[] args) {

        // // printf() is a method used to format output.

        // String name = "Aashutosh";
        // char firstLetter = 'A';
        // int age = 19;
        // double height = 6.7;
        // boolean isEmployed = true;

        // System.out.printf("Hello %s \n", name);
        // System.out.printf("First Letter is: %c \n", firstLetter);
        // System.out.printf("You are %d years old.\n", age);
        // System.out.printf("Your height is %f \n", height);

        // System.out.printf("%s is %d years old", name, age);

        // double price = 999.9;
        // double price2 = 100.15;
        // double price3 = -123.2112;

        // System.out.printf("%f \n", price);
        // System.out.printf("%.1f \n", price2);
        // System.out.printf("%.2f \n", price3);

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        // double num1 = 123123.12;
        // double num2 = -123123.12;

        // System.out.printf("%+.1f \n", num1);
        // System.out.printf("%(.1f \n", num2);

        // System.out.printf("%,.1f \n", num1);

        // To add 0 padding, eg: 123 -> 00123
        int id1 = 1;
        int id2 = 23;
        int id3 = 123;
        int id4 = 1234;

        System.out.printf("%04d \n", id1);
        System.out.printf("%04d \n", id2);
        System.out.printf("%04d \n", id3);
        System.out.printf("%04d \n", id4);

        System.out.printf("%4d \n", id1);
        System.out.printf("%4d \n", id2);
        System.out.printf("%4d \n", id3);
        System.out.printf("%4d \n", id4);

        System.out.printf("%-4d \n", id1);
        System.out.printf("%-4d \n", id2);
        System.out.printf("%-4d \n", id3);
        System.out.printf("%-4d \n", id4);
    }
}