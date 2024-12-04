package org.example.oct202242Done;

public class Character {

    private String Name;
    private int XCoordinate;
    private int YCoordinate;

    public Character(String Name, int XCoordinate, int YCoordinate) {
        this.Name = Name;
        this.XCoordinate = XCoordinate;
        this.YCoordinate = YCoordinate;
    }

    public String GetName() {
        return Name;
    }

    public int GetXCoordinate() {
        return XCoordinate;
    }

    public int GetYCoordinate() {
        return YCoordinate;
    }

    public void ChangePosition(int XChange, int YChange) {
        XCoordinate = XCoordinate + XChange;
        YCoordinate = YCoordinate + YChange;
    }

}

























/*
public class Character {
    String Name;
    int XCoordinate;
    int YCoordinate;

    public void constructor(String name, int xCoordinate, int yCoordinate) {
        Name = name;
        XCoordinate = xCoordinate;
        YCoordinate = yCoordinate;
    }

    public String getName() {
        return Name;
    }

    public int getXcoordinate() {
        return XCoordinate;
    }

    public int getYcoordinate() {
        return YCoordinate;
    }

    public void ChangePosition(int XChange, int YChange) {
        XCoordinate = XCoordinate + XChange;
        YCoordinate = YCoordinate + YChange;
    }
}
*/