import java.util.Scanner;
public class quizprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {"1. What is 2 + 4",
                              "2. What is 2 + 5"};
        String[][] answers = {{"6", "5", "4"}, {"7", "8", "9"}};
        int correct = 0;

        for (int i = 0; i < questions.length; ++i) {
            System.out.println(questions[i] + ": ");
            for(String option : answers[i]) {
                System.out.println(option);
            }
            int userAnswer = scanner.nextInt(); //there is not nextChar so have to use string and read first
            correct += checkAnswer(answers[0], userAnswer, correct);
        }
        scanner.close();
    }
    static int checkAnswer(String answer, int input, int correct) {
        if (answer == input) {
            System.out.println("GOOD JOB");
            correct++;
        }
        else
            System.out.println("WRONG BITCH");
        return correct;
    }
    
}
