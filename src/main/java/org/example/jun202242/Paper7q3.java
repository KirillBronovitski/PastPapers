package org.example.jun202242;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;

public class Paper7q3 {

    static Card[] cardArray = new Card[30];
    static Card[] cardArraySelected = new Card[30];

    public static void main(String[] args) throws IOException {

        int index = 0;
        int cardNum;
        String cardColour;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/card values.txt"))) {
            while (fileReader.hasNextLine()) {
                cardNum = Integer.parseInt(fileReader.next());
                cardColour = fileReader.nextLine();
                cardArray[index] = new Card(cardNum, cardColour);
                index++;
            }
        }

        for (int i = 0; i < cardArraySelected.length; i++) {
            cardArraySelected[i] = new Card(-1, "");
        }
        ChooseCard();
        ChooseCard();
    }

    public static int ChooseCard() {
        boolean cardSelected = false;
        Scanner console = new Scanner(System.in);
        int numberEntry = -1;
        while (numberEntry == -1 || cardSelected) {
            while (numberEntry < 1 || numberEntry > 30) {
                System.out.println("Enter the number of card that needs to be selected (number between 1 and 30 inclusive):");
                numberEntry = Integer.parseInt(console.nextLine());
            }
            for (int i = 0; i < cardArraySelected.length; i++) {

                if (cardArraySelected[i].GetNumber() != numberEntry) {
                    cardSelected = false;
                    continue;
                }
                cardSelected = true;
                break;

            }
            if (!cardSelected) {
                cardArraySelected[numberEntry - 1] = cardArray[numberEntry - 1];
                return numberEntry;
            } else {
                System.out.println("The card with this number has been selected before; choose the other one.");
                numberEntry = -1;

            }
        }

        return -1;
    }

}
