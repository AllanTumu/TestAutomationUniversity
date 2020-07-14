package JavaTraining;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYears = 2;

        //Get what we do not know
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years you have worked");
        double years = scanner.nextDouble();

        //Make a decision if some one Qualifies for a Loan or not
        if (salary>=requiredSalary) {
            if (years>=requiredYears) {
                System.out.println("You Qualify for a loan");
            }
            else if (years<requiredYears) {
                System.out.println("You do not Qualify for a loan");
            }
        } else {
            System.out.println("You do not Qualify for the Loan scheme");
        }
        scanner.close();
    }
}
