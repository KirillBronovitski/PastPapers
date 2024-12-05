package org.example.jun202341Done;

public class Helicopter extends Vehicle {
    private int VerticalPosition;
    private int VerticalChange;
    private int MaxHeight;

    public Helicopter(String ID, int MaxSpeed, int IncreaseAmount, int VerticalChange, int MaxHeight) {
        super(ID, MaxSpeed, IncreaseAmount);
        this.VerticalChange = VerticalChange;
        this.MaxHeight = MaxHeight;
        VerticalPosition = 0;
    }

    public void IncreaseSpeed() {
        VerticalPosition = VerticalPosition + VerticalChange;
        if (VerticalPosition > MaxHeight) {
            throw new IllegalArgumentException();
        }
        SetCurrentSpeed(GetCurrentSpeed() + GetIncreaseAmount());
        if (GetCurrentSpeed() > GetMaxSpeed()) {
            throw new IllegalArgumentException();
        }
        SetHorizontalPosition(GetHorizontalPosition() + GetCurrentSpeed());
    }

    public void outputPosition() {
        System.out.println("Horizontal position: " + GetHorizontalPosition());
        System.out.println("Current speed: " + GetCurrentSpeed());
        System.out.println("Vertical Position: " + VerticalPosition);
    }

}
