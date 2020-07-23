package JavaTraining;

import java.util.Random;

public class DiceRollGame {
    public static void main(String[] args) {
        //Declare what we know
        int lastSpace = 20;
        int currentSpace = 0;
        int maxDiceRolls = 5;
        Random random = new Random();

        System.out.println("Let the game begin!!!");

        for (int i=1; i<=maxDiceRolls; i++) {
            //Roll the dice to generate random number between 1 and 6

            int die = random.nextInt(6) +1;
            currentSpace = currentSpace + die;

            //Tell user which game space they are
            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if(currentSpace == lastSpace){
                System.out.print("You're on space " + currentSpace + ". Congrats, you win!");
                break;
            }
            else if(currentSpace > lastSpace){
                System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
                break;
            }
            else if(i==maxDiceRolls && currentSpace < lastSpace){
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " +
                        lastSpace + " spaces. You lose!");
            }
            else{
                int spacesToGo = lastSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace +
                        " and have " + spacesToGo + " more to go.");
            }

            System.out.println();

        }
    }
}
