package org.example.oct202242Done;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;

public class Paper3q2 {

    static Character[] arrayCharacters = new Character[10];

    public static void main(String[] args) throws IOException {
        String name;
        int xCoordinate;
        int yCoordinate;
        int counter = 0;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/Characters.txt"))) {
            while (fileReader.hasNextLine()) {
                name = fileReader.next();
                xCoordinate = Integer.parseInt(fileReader.next());
                yCoordinate = Integer.parseInt(fileReader.next());
                arrayCharacters[counter] = new Character(name, xCoordinate, yCoordinate);
                counter++;
            }
        } catch (IOException e) {
            System.out.println("The source file had not been found");
        }
        Scanner console = new Scanner(System.in);
        int index = -1;
        while (index == -1) {
            System.out.println("Enter the name of the character:");
            String nameEntry = console.nextLine();
            for (int i = 0; i < 10; i++) {
                if (nameEntry.equals(arrayCharacters[i].GetName())) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("The character had not been found");
            } else {
                System.out.println(index);
            }
        }
        String movement = "";
        while (!movement.equals("A") && !movement.equals("W") && !movement.equals("S") && !movement.equals("D")) {
            movement = console.nextLine();
        }
        switch (movement) {
            case "A":
                arrayCharacters[index].ChangePosition(-1, 0);
                break;
            case "S":
                arrayCharacters[index].ChangePosition(0, -1);
                break;
            case "D":
                arrayCharacters[index].ChangePosition(1, 0);
                break;
            case "W":
                arrayCharacters[index].ChangePosition(0, 1);
                break;
        }
        System.out.println(arrayCharacters[index].GetName() + " has changed coordinates to X = " + arrayCharacters[index].GetXCoordinate() + " and Y = " + arrayCharacters[index].GetYCoordinate());
    }

}
