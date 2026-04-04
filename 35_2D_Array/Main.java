public class Main {
    public static void main(String[] args) {
        /*
         * String[] fruits = { "Apple", "Orange", "Banana" };
         * String[] vegs = { "potato", "onion" };
         * String[] meats = { "Chicken", "Pork", "Fish" };
         * 
         * String[][] groceries = { fruits, vegs, meats };
         * 
         * groceries[0][0] = "Litchi";
         * 
         * for (String[] foods : groceries) {
         * for (String food : foods) {
         * System.out.print(food + " ");
         * }
         * System.out.println("");
         * }
         */

        char[][] telephone = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' }, { '*', '0', '#' } };

        for (char[] row : telephone) {
            for (char num : row) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }
    }
}
