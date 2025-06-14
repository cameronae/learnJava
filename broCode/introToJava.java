package broCode;
//this is a package "util" using the class Scanner in order to read user input
import java.util.Scanner;
//All java programs are inside of a class, have to name the class as the file name
public class introToJava{
    //this is like int main()
    public static void main(String[] args) {
        //primative data types are int, double, char, boolean
        //reference data types are string, array, object 
        Scanner scanner = new Scanner(System.in);
        int age = 19;
        System.out.print("Hello World\n");
        System.out.println("This prints a line with auto new line");
        System.out.println("I am " + age + " years old");

        //sout tab creates a print
        System.out.print("Enter your name: ");

        //'scans' the next line or reads input from user
        //declare and initialize the name to whatever is read from the console
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + " how old are you?");

        int userAge = scanner.nextInt();
        scanner.nextLine(); //used to get rid of the new line character so it does not mess up further reading down the road
        System.out.println("You are " + (age - userAge) + " years younger than me");

        System.out.println("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();
        
        //just the name of the bool means true in an if statement
        if(isStudent){
            System.out.println(userName + " is a student");
        }
        else{
            System.out.println(userName + " is not a student");
        }

        

        //HAVE to close the object after it is done being used
        scanner.close();
    }
}