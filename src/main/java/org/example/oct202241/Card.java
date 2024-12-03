package org.example.oct202241;

public class Card {

    private int Number;
    private String Colour;

    public Card(int number, String colour) {
        Number = number;
        Colour = colour;
    }

    public int GetNumber() {
        return Number;
    }

    public String GetColour() {
        return Colour;
    }

}
