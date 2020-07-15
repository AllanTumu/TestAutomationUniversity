package JavaTraining;

import java.util.Scanner;

public class IfElseIF {
    public static void main(String[] args) {
        
        //Declare what we know
        String grading = null;
        double markScored;
        
        //Request for what we do not know
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your mark scored");
        markScored = scanner.nextDouble();
        scanner.close();
        
        //Decision(Grading System)
        if (markScored<35) {
            grading = "E";
        }
        else if (markScored>=35 && markScored<=39.9) {
            grading = "D-";
        }
        else if (markScored>=40 && markScored<=44.9) {
            grading = "D";
        }
        else if (markScored>=45 && markScored<=49.9) {
            grading = "D+";
        }
        else if (markScored>=50 && markScored<=54.9) {
            grading = "C-";
        }
        else if (markScored>=60 && markScored<=64.9) {
            grading = "C";
        }
        else if (markScored>=65 && markScored<=69.9) {
            grading = "C+";
        }
        else if (markScored>=70 && markScored<=74.9) {
            grading = "B";
        }
        else if (markScored>=75 && markScored<=79.9) {
            grading = "B+";
        }
        else if(markScored>=80) {
            grading = "A";
        }
        
        //Output
        System.out.println("Your grade point is " + grading);
        
    }
}
