package JavaTraining;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {

        //Declare what we know
        int students = 24;
        int test = 4;

        Scanner scanner = new Scanner(System.in);
        //Calculating Average per students using a for loop
        for (int i = 0; i<students; i++) {

            double total = 0;
            for (int j = 0; j<test; j++) {
                System.out.println("Please enter the marks for test " + (j+1));
                double marks = scanner.nextDouble();
                total = total + marks;
            }

            double average = total/test;
            System.out.println("The test average for student " +(i+1) + " is " + average);
        }
        scanner.close();
    }
}
