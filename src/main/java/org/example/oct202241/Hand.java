package org.example.oct202241;

public class Hand {

    Card[] Cards = new Card[10]; // I would like to have an array with the space specifically for 10 elements only, but the initialising the size to 10 is said to be redundant
    int FirstCard;
    int NumberCards;

    public Hand(Card[] cards, int firstCard, int numberCards) {
        Cards = cards;      // I suspect it is due to this initialisation in the constructor. I still need to have this initialisation.
        FirstCard = firstCard;                  // I suspect that I need to specify the size of the array in the parameters too, but I don't know how.
        NumberCards = numberCards;
    }

}
