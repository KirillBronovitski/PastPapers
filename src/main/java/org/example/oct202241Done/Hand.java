package org.example.oct202241Done;

public class Hand {

    private Card[] Cards = new Card[10];
    private int FirstCard;
    private int NumberCards;

    public Hand(Card playerCard1, Card playerCard2, Card playerCard3, Card playerCard4, Card playerCard5) {
        Cards[0] = playerCard1;
        Cards[1] = playerCard2;
        Cards[2] = playerCard3;
        Cards[3] = playerCard4;
        Cards[4] = playerCard5;

        FirstCard = 0;
        NumberCards = 5;
    }

    public Card GetCard(int arrayIndex) {
        return Cards[arrayIndex];
    }

}
