package JavaTrainingTwo;

import java.util.Scanner;

public class MethodsInJava {
    public static void main(String[] args) {
        greetByName();
    }

    public static String greetByName() {
        Scanner scanner = new Scanner(System.in);
        //Ask User their name
        System.out.println("Please input your name");
        String name = scanner.next();
        System.out.println("Hello " +name +", How are you?");
        return name;
    }
}
