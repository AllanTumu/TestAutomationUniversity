package JavaTraining;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {

        //Base Salary per hour
        double baseSalary = 15; //In Usd
        //Base Time
        double baseTime = 1; //Per Hour

        //Maximum number of hours worked
        double maxNumberOfHours = 40;

        double employeeSalary = 0;

        //Please Enter your number hours worked
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number of hours worked");
        double hoursWorked = scanner.nextDouble();

        while (baseTime<= maxNumberOfHours && !(hoursWorked<baseTime)) {
            if (hoursWorked<=maxNumberOfHours) {
                employeeSalary = baseSalary*hoursWorked;

            }
            else {
                System.out.println("Maximum number of hours to work, is " +maxNumberOfHours +" No Overtime");
                System.exit(0);
            }
            baseTime++;
        }
        System.out.println("Your Salary is " + employeeSalary + " USDs");
    }
}
