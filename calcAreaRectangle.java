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

        System.out.println("Is this new rectangle a true or false rectangle.");

        boolean isRectangle = random.nextBoolean();
        System.out.println(isRectangle);
        scanner.close();
        /*
         * Math Class and functions
         */
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double power = Math.pow(2, 5);
        power = Math.abs(-power);
        power = Math.sqrt(area);
        power = Math.round(Math.PI);//rounds to the nearest whole int
        power = Math.ceil(Math.PI);//rounds up
        power = Math.floor(3.99);//rounds down
        power = Math.max(10,20) //finds the max/greater
        power = Math.min(10,20);//finds the min/lesser value
    }
}
