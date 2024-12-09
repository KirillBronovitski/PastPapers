package org.example.jun202242Done;

import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;
public class Paper7q3 {

    static Card[] Player1 = new Card[4];
    static final Scanner console = new Scanner(System.in);
    static Card[] arrayCards = new Card[30];
    static Card[] selectedCards = new Card[30];
    public static void main(String[] args) throws IOException {
        int number;
        String colour;
        int index = 0;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/card values.txt"))) {
            while (fileReader.hasNextLine()) {
                number = Integer.parseInt(fileReader.next());
                colour = fileReader.next();
                arrayCards[index] = new Card(number, colour);
                index++;
            }
        }
        int indexEntry;
        for (int i = 0; i < Player1.length; i++) {
            indexEntry = ChooseCard();
            if (indexEntry == -1) {
                System.out.println("All available cards were already selected. No available cards for player 1.");
                break;
            } else {
                Player1[i] = arrayCards[indexEntry];
            }
        }
        System.out.println("The data of cards of player 1:");
        for (int i = 0; i < Player1.length; i++) {
            if (Player1[i] != null) {
                System.out.println("Card " + (i + 1) + ":");
                System.out.println("Number: " + Player1[i].GetNumber());
                System.out.println("Colour: " + Player1[i].GetColour());
            } else {
                System.out.println("-no card-");
            }
        }
    }

    public static int ChooseCard() {
        if (selectedCards[selectedCards.length - 1] != null) {
            return -1;
        }
        int index;
        while (true) {
            System.out.println("Enter the index of the card to be chosen:");
            index = Integer.parseInt(console.nextLine());
            boolean cardAlreadySelected = false;
            if (index > 0 && index < 31) {
                for (Card selectedCard : selectedCards) {
                    if (selectedCard == arrayCards[index - 1]) {
                        cardAlreadySelected = true;
                        break;
                    }
                }
                if (cardAlreadySelected) {
                    System.out.println("The card with the given index is not available, please choose the other one.");
                } else {
                    for (int i = 0; i < selectedCards.length; i++) {
                        if (selectedCards[i] == null) {
                            selectedCards[i] = arrayCards[index - 1];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return index - 1;
    }
}