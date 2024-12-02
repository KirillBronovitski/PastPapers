package org.example.jun202341;

public class Helicopter extends Vehicle {
    private int VerticalPosition;
    private int VerticalChange;
    private int Height;

    public void Constructor(String id, int maxSpeed, int increaseAmount, int verticalChange, int maxHeight) {
        VerticalPosition = 0;
    }

    public void IncreaseSpeed() {
        VerticalPosition = VerticalPosition + VerticalChange;
        SetCurrentSpeed(GetCurrentSpeed() + GetIncreaseAmount());
    }
}
