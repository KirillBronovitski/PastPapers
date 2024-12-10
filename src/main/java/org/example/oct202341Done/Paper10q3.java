package org.example.oct202341Done;
import java.util.Scanner;
public class Paper10q3 {
    final static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        Character Jack = new Character("Jack", 50, 50);
        BikeCharacter Karla = new BikeCharacter("Karla", 100, 50);
        String nameEntry = "";
        while (!nameEntry.equals("jack") && !nameEntry.equals("karla")) {
            System.out.println("Choose one of the given players:");
            System.out.println("Jack");
            System.out.println("Karla");
            System.out.println("Enter the name of the chosen character to proceed:");
            nameEntry = console.nextLine();
        }
        System.out.println("Enter the direction in which the chosen character is required to move:");
        String directionEntry = console.nextLine();
        if (nameEntry.equals("jack")) {
            Jack.Move(directionEntry);
            System.out.println("Jack's new position is X = " + Jack.GetXPosition() + " Y = " + Jack.GetYPosition());
        } else {
            Karla.Move(directionEntry);
            System.out.println("Karla's new position is X = " + Karla.GetXPosition() + " Y = " + Karla.GetYPosition());
        }
    }

}
