package JavaTraining;

import java.util.Scanner;

public class SwitchGradeMessage {

    public static void main(String[] args) {
        //Ask for the grade message
        System.out.println("Please enter your grade message");

        //Input your grade message
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        //Declare message to be returned
        String message;
        scanner.close();


        //Decision
        switch (grade) {
            case "A":
                message = "Excellent";
                break;
            case "B":
                message = "Passed";
                break;
            case "C":
                message = "Tried";
                break;
            case "D":
                message = "Pull up your socks";
                break;
            case "E":
                message = "More effort is needed";
                break;

            default:
                message = "Error invalid grade submitted";
        }

        System.out.println("According to your submitted grade, you are " +message);
    }
}