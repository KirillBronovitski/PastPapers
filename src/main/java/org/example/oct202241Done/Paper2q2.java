package org.example.oct202241Done;

public class Paper2q2 {

    public static void main(String[] args) {
        Card card1 = new Card(1, "red");
        Card card2 = new Card(2, "red");
        Card card3 = new Card(3, "red");
        Card card4 = new Card(4, "red");
        Card card5 = new Card(5, "red");
        Card card6 = new Card(1, "blue");
        Card card7 = new Card(2, "blue");
        Card card8 = new Card(3, "blue");
        Card card9 = new Card(4, "blue");
        Card card10 = new Card(5, "blue");
        Card card11 = new Card(1, "yellow");
        Card card12 = new Card(2, "yellow");
        Card card13 = new Card(3, "yellow");
        Card card14 = new Card(4, "yellow");
        Card card15 = new Card(5, "yellow");

        Hand Player1 = new Hand(card1, card2, card3, card4, card11);
        Hand Player2 = new Hand(card12, card13, card14, card15, card6);

        if (CalculateValue(Player1) > CalculateValue(Player2)) {
            System.out.println("Player 1 wins");
        }
        if (CalculateValue(Player1) < CalculateValue(Player2)) {
            System.out.println("Player 2 wins");
        }
        if (CalculateValue(Player1) == CalculateValue(Player2)) {
            System.out.println("Draw");
        }
    }

    public static int CalculateValue(Hand playerHand) {
        int score = 0;
        int arrayIndex = 0;
        for (int i = 0; i < 5; i++) {
            switch (playerHand.GetCard(arrayIndex).GetColour()) {
                case "red":
                    score = score + 5;
                    break;

                case "blue":
                    score = score + 10;
                    break;

                case "yellow":
                    score = score + 15;
                    break;
            }
        }
        return score;
    }

}
