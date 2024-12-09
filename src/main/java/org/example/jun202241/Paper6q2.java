package org.example.jun202241;
import java.util.Scanner;
public class Paper6q2 {

    static final Scanner console = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the defence item of the balloon:");
        String defenceItemEntry = console.nextLine();
        System.out.println("Enter the colour of the balloon:");
        String colourEntry = console.nextLine();
        Balloon Balloon1 = new Balloon(colourEntry, defenceItemEntry);
        Defend(Balloon1);
    }

    public static Balloon Defend(Balloon protectedBalloon) {
        System.out.println("Enter the strength of the opponent:");
        int opponentStrength = Integer.parseInt(console.nextLine());
        protectedBalloon.ChangeHealth(-opponentStrength);
        System.out.println(protectedBalloon.GetDefenceItem());
        if (protectedBalloon.CheckHealth()) {
            System.out.println("The balloon has no health remaining");
        } else {
            System.out.println("The balloon still has health remaining");
        }
        return protectedBalloon;
    }

}
