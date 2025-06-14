package broCode;
import java.util.Scanner;

public class bankingProgram {
    //global declaration
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //declare int for the user to pick what they want you have to initialize it too
        int selection = 0;
        boolean isRunning = true;
        double balance = 0.0;
        System.out.println("**************************\nWELCOME TO THE BANKING APP\nWOULD YOU LIKE TO");
        System.out.println("1. SHOW BALANCE\n2. DEPOSIT\n3. WITHDRAW\n4. EXIT\n**************************");

        while(isRunning){
        System.out.println("Enter your choice (1-4)");
        selection = scanner.nextInt();
        switch (selection) {
            case 1 -> showBalance(balance);
            case 2 -> balance = deposit(balance); 
            case 3 -> balance = withdraw(balance);       
            case 4 -> isRunning = false;
            case 5 -> System.out.println("1. SHOW BALANCE\n2. DEPOSIT\n3. WITHDRAW\n4. EXIT");
            default -> System.out.println("Error only enter (1-4), enter 5 if you would like to see the options");
            }
        }
        scanner.close();
    }   


static void showBalance(double balance){
    System.out.println(balance);
}

static double deposit(double balance){
    System.out.print("Enter the amount you would like to deposit: $");
    double deposit = scanner.nextDouble();
    if (deposit > 0)
        balance += deposit;
    else
        System.out.println("Can only deposit more than $0");

    return balance;
}

static double withdraw(double balance){
    System.out.println("Enter the amount you would like to withdraw: $");
    double withdraw = scanner.nextDouble();
    if(withdraw <= balance)
        balance -= withdraw;
    else
        System.out.println("Can only withdrawal less than you have");

    return balance;
}
}
