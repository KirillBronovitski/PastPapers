package org.example.oct202242;

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
