package org.example.jun202242Done;

public class Card {

    final private int Number;
    final private String Colour;

    public Card(int Number, String Colour) {
        this.Number = Number;
        this.Colour = Colour;
    }

    public int GetNumber() {
        return Number;
    }

    public String GetColour() {
        return Colour;
    }

}
