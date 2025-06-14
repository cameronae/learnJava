package broCode;
import java.util.Arrays;

public class javaArrays {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "fart"};
        fruits[0] = "pineapple";
        //.length returns length
        int length = fruits.length;
        //enhanced for loop for arrays
        //use the identifier : what you are iterating through
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        Arrays.sort(fruits); //will sort alphabetically and if ints will sort numeraically
        Arrays.fill(fruits, "vegatable"); //fills all of the array with the given 

        System.out.println(fruits[0] + ' ' + length);

        System.out.println("NEW LESSON");

        int[] numbers = {1,9,2,8,3,5,4};
        String[] names = {"cam", "kate", "ben"};
        String nameTarget = "kate";
        int target = 10;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; ++i) {
            if(i == target) {
                System.out.println("element found at index " + i);
                isFound = true;
                break;
            }
        }

        for (int i = 0; i < names.length; ++i) {
            if(names[i].equals(nameTarget)) //use .equals for strings because == compares memory addresses
                System.out.println(nameTarget + " found at element " + i);
        }
        //checking if isFound is false
        if(!isFound)
            System.out.println("Target not found");
    }
}
