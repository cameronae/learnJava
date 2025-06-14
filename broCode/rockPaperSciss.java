
import java.util.Random;
import java.util.Scanner;
public class rockPaperSciss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //create a rock paper scissors game with a computer that uses random to pick

        String[] options = {"Rock", "Paper", "Scissors"};
        String computerGuess, userGuess;
        boolean isRunning = true;

        while(isRunning) {
            System.out.print("Enter your move (rock, paper, scissors): ");
            userGuess = scanner.nextLine();
            computerGuess = options[random.nextInt(0,2)];
            System.out.println("Computer guess is " + computerGuess);
            if(userGuess.equals(computerGuess)) {
                System.out.println("You win!!!");
            }
        }
        scanner.close();
    }
}
