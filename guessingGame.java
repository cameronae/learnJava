import java.util.Random;
import java.util.Scanner;
public class guessingGame {
    //declares the scanner globally that can be used in all the functions
     private static final Scanner scanner = new Scanner(System.in);
     private static final Random random = new Random();

    public static void main(String[] args) {
       //guessing game that takes in user/computer guess and then plays the guessing game with them
        int randomNumber;
        char gameMode;

        randomNumber = random.nextInt(1, 101);
        System.out.println("Would you like to (p)lay or let the (c)omputer play?");
        gameMode = getGameMode();

        if(gameMode == 'p'){
            playerPlay(randomNumber);
        }
        else if(gameMode == 'c'){
            computerPlay(randomNumber);
        }
        else{
            System.out.println("Wrong input BITCH");
        }
        do {
        System.out.println("(p)lay again, let (c)omputer play again, or (q)uit");
        gameMode = getGameMode();

        if(gameMode == 'p'){
            playerPlay(randomNumber);
        }
        else if(gameMode == 'c'){
            computerPlay(randomNumber);
        }
        else if (gameMode != 'q'){
            System.out.println("Wrong input BITCH");
        }
    }
    while(gameMode != 'q');
     System.out.println("Thanks for playing!");
        scanner.close();
    }


    public static char getGameMode(){
        String userString;
        char gameMode;
        userString = scanner.nextLine();
        if (userString.length() > 1){
            System.out.println("Enter one character only. (p or c)");
            userString = scanner.nextLine();
        }
        userString.toLowerCase();
        gameMode = userString.charAt(0);
        return gameMode;
    }
    private static void playerPlay(int randomNumber){
        int tries = 1;
        int userGuess;
        do{
        System.out.print("Enter your guess: ");
        userGuess = scanner.nextInt();
        ifStatements(userGuess, randomNumber, tries);
        tries++;}
        while (userGuess != randomNumber);
    }

    private static void computerPlay(int randomNumber){
        int min = 1, max = 100, tries = 1, computerGuess;
        do {
        computerGuess = random.nextInt(min, max + 1);
        System.out.printf("Computers guess is: %d\n", computerGuess);
        ifStatements(computerGuess, randomNumber, tries);
        if(computerGuess > randomNumber){
            max = computerGuess;
        }
        else if (computerGuess < randomNumber){
            //has to be +1 because the lower bound is inclusive in java for random
            min = computerGuess + 1;
        }
        tries++;
        }
        while(computerGuess != randomNumber);
    }

    private static void ifStatements(int guess, int num, int tries){
        if(guess > num){
            System.out.println("Guess it too high, try again.");
        }
        else if(guess < num){
            System.out.println("Guess is too low, try again."); 
        }
        else{
            System.out.printf("Congrats! you guessed the number %d correctly in %d tries!", num, tries);
        }
    }
}
