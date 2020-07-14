package JavaTraining;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        //Initialize what we know
        int salary = 30000;
        int year = 2;

        //Get what we do not know
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary");
        salary = scanner.nextInt();

        System.out.println("Enter the number of years you have worked");
        year = scanner.nextInt();

        //Make a decision if some one Qualifies for a Loan or not
        if (salary>=30000) {
            if (year>=2) {
                System.out.println("You Qualify for a loan");
            }
            else if (year<2) {
                System.out.println("You do not Qualify for a loan");
            }
        } else {
            System.out.println("You do not Qualify for the Loan scheme");
        }
    }
}
