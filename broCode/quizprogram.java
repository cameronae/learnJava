package broCode;
import java.util.Scanner;
public class quizprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {"1. What is 2 + 4",
                              "2. What is 2 + 5"};
        String[][] answers = {{"1. 6", "2. 5", "3. 4"}, {"1. 7", "2. 8", "3. 9"}};
        int[] correctAnswers = {1, 1};
        int correct = 0, guess;

        for (int i = 0; i < questions.length; ++i) { //this will cycle through the questions
            System.out.println(questions[i]); //prints out the question
            for(String option : answers[i]) { //this cycles through the answers
                System.out.println(option); //prints out the options for that questions
            }
            guess = scanner.nextInt();
            if(guess == correctAnswers[i]) {
                System.out.println("CORRECT");
                correct++; 
            }
            else {
                System.out.println("WRONGWRONG");
            }
        }
        System.out.println("Total correct is: " + correct + " out of " + questions.length);
        scanner.close();
    }
};
       
    
