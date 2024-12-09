package org.example.jun202241;

public class Balloon {

    private int Health;
    private String Colour;
    private String DefenceItem;

    public Balloon(String Colour, String DefenceItem) {
        Health = 100;
        this.Colour = Colour;
        this.DefenceItem = DefenceItem;
    }

    public String GetDefenceItem() {
        return DefenceItem;
    }

    public void ChangeHealth(int healthChange) {
        Health = Health + healthChange;
    }

    public boolean CheckHealth() {
        if (Health <= 0) {
            return true;
        }
        return false;
    }

}
