package DiceRoll;

import java.util.*;
public class DiceRoll {
    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1;

        System.out.print("You rolled");

        for (int i = 0; i < 3; i++) {
            Thread.sleep(750); // Delay for 1 second
            System.out.print(".");
        }
        System.out.println(" " + diceRoll);
        Thread.sleep(1000);

        System.out.println(diceSymbol(diceRoll));
    }

    public static String diceSymbol(int number){

        switch(number){
            case 1:
                return " -------\n" +
                        "|       |\n" +
                        "|   o   |\n" +
                        "|       |\n" +
                        " -------";
            case 2:
                return " -------\n" +
                        "| o     |\n" +
                        "|       |\n" +
                        "|     o |\n" +
                        " -------";
            case 3:
                return " -------\n" +
                        "| o     |\n" +
                        "|   o   |\n" +
                        "|     o |\n" +
                        " -------";
            case 4:
                return " -------\n" +
                        "| o   o |\n" +
                        "|       |\n" +
                        "| o   o |\n" +
                        " -------";
            case 5:
                return " -------\n" +
                        "| o   o |\n" +
                        "|   o   |\n" +
                        "| o   o |\n" +
                        " -------";
            case 6:
                return " -------\n" +
                        "| o   o |\n" +
                        "| o   o |\n" +
                        "| o   o |\n" +
                        " -------";
            default:
                return "";
        }
    }
}
