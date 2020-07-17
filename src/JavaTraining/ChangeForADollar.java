package JavaTraining;

import java.util.Scanner;

public class ChangeForADollar {
//    So, you're going to create a program that asks the user to enter the quantities for the following coins.
//
//    You'll ask them how many pennies would you like?
//    How many nickels would you like?
//    How many dimes?
//    And then, how many quarters?

    public static void main(String[] args) {
        double winningAmount = 1; //Amount in dollars
        Scanner scanner = new Scanner(System.in);
        //Ask user to enter quantities of coins
        System.out.println("Enter the Quantities of the following coins");
        //Pennies
        System.out.println("How many Pennies would you like");
        double pennies = scanner.nextDouble();
        //nickles
        System.out.println("How many nickles would you like");
        double nickles = scanner.nextDouble();
        //dimes
        System.out.println("How many dimes would you like");
        double dimes = scanner.nextDouble();
        //Quarters
        System.out.println("How many quarters would you like");
        double quarters = scanner.nextDouble();

        //LOGIC
        //Count up the total amount of coins entered
        double total = pennies + nickles + dimes + quarters;
        //Calculate the exceeding amount of coins
        double excess = total - winningAmount;
        //Calculate the amount of coins they are short of
        double balance = winningAmount - total;



        //DECISION
        if (total == winningAmount) {
            System.out.println("Congrats, you have won. Amount is equal to " +winningAmount);
        }
        else if (total > winningAmount) {
            System.out.println("Sorry Amount is more than 1 dollar, you exceeded amount with " +excess + " dollars");
        }
        else if (total < winningAmount) {
            System.out.println("Sorry Amount is less than 1 dollar, your are below the amount with " + balance  + " dollars");
        }


    }
}
