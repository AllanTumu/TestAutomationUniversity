package JavaTraining;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean repeat;
        do {
            //Ask user for numbers
            System.out.println("Please enter number 1");
            double num1 = scanner.nextDouble();

            System.out.println("Please enter number 2");
            double num2 = scanner.nextDouble();

            //Calculate Sum
            double sum = num1 + num2;
            System.out.println("The sum is " + sum);

            System.out.println("do you want to continue? " + "Reply true/false");
            repeat = scanner.nextBoolean();


        }
        while (repeat);

    }
}
