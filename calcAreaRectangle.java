import java.util.Scanner;
import java.util.Random;
public class calcAreaRectangle {
    public static void main(String[] args){
        //create a program that will calculate the size of a rectangle
        //create a scanner object
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        double width, height, area;

        System.out.println("Please enter the rectangles width and height.");
        width = scanner.nextDouble();
        height = scanner.nextDouble();
        area = width * height;
        System.out.println("The area of this rectangle is " + area + " units");

        System.out.println("Now lets randomly generate a new area with random numbers.");
        //the origin is inclusive and the bound is exclusive
        width = random.nextDouble(1, 21);
        height = random.nextDouble(5, 11);
        area = width * height;
        System.out.println("The area is " + area + " units");
        //this uses a placeholder %f for a double/floating point number and uses %d for an int
        //using .# before the f in the %f sets the precision for that number
        //+ = outputs a plus
        //, = commma grouping separator
        // ( = negative number
        // space = display a minus if negative, space if positve
        System.out.printf("The are is %.3f units\n.", area);

        System.out.println("Is this new rectangle a true or false rectangle.");

        boolean isRectangle = random.nextBoolean();
        System.out.println(isRectangle);
        scanner.close();
       
    }
}
