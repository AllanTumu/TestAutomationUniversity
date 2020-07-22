package JavaTraining;

import java.util.Scanner;

public class CashierProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ask the user how many items they would want to scan
        System.out.println("How many items would you like to scan?");
        int quantity = scanner.nextInt();

        double total = 0;

        for (int i = 0; i<quantity; i++){
            //Ask user the cost of the item
            System.out.println("Please enter the cost of the item");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();

        System.out.println("Your total is Ugx " + total);
    }
}
