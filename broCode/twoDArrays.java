package broCode;

public class twoDArrays {
    public static void main(String[] args) {
        /*String[] fruits = {"apple", "banana"};
        String[] vegatables = {"potato", "onion"};
        String[] meat = {"chicken", "beef"};

        //creates an array of arrays
        String[][] groceries = {fruits, vegatables, meat};
        groceries[0][0] = "strawberry";//replaces index 0 of groceries "fruits" index 0 of fruits
        for (String[] foods : groceries) { //itereates through each array inside of groceries
            for(String food : foods) {//iterates through each intem inside of that array
                System.out.println(food + " ");
            }
            System.out.println();
        }*/
        char[][] telephone = {{'1', '2', '3'}, 
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

        for(char[] row : telephone) {
            for (char num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
