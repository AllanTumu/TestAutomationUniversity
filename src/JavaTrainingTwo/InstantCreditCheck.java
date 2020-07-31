package JavaTrainingTwo;

import java.util.Scanner;

public class InstantCreditCheck {
    public static void main(String[] args) {
        creditCheck();

    }
    public static void creditCheck() {
        Scanner scanner = new Scanner(System.in);
        //Ask User the amount of Money they earn
        System.out.println("How much do you earn?");
        double earnings = scanner.nextDouble();

        //Ask User for Credit scores
        System.out.println("Please input your credit scores");
        double creditScore = scanner.nextDouble();

        if (earnings>=25000 && creditScore>=700) {
            System.out.println("You Qualify for a Credit");
        }
        else {
            System.out.println("You do not Qualify for a Credit");

        }

    }
}
