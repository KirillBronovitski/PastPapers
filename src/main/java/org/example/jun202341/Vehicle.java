package org.example.jun202341;

public class Vehicle {
    private String ID;
    private int MaxSpeed;
    private int CurrentSpeed;
    private int IncreaseAmount;
    private int HorizontalPosition;

    public void Constructor(String id, int maximumSpeed, int increaseAmount) {
        ID = id;
        MaxSpeed = maximumSpeed;
        IncreaseAmount = increaseAmount;
        CurrentSpeed = 0;
        HorizontalPosition = 0;
    }

    public int GetCurrentSpeed() {
        return CurrentSpeed;
    }

    public int GetIncreaseAmount() {
        return IncreaseAmount;
    }

    public int GetMaxSpeed() {
        return MaxSpeed;
    }

    public int getHorizontalPosition() {
        return HorizontalPosition;
    }

    public void SetHorizontalPosition(int horizontalPosition) {
        HorizontalPosition = horizontalPosition;
    }

    public void SetCurrentSpeed(int currentSpeed) {
        CurrentSpeed = currentSpeed;
    }

    public void IncreaseSpeed() {
        if (CurrentSpeed <= MaxSpeed) {
            CurrentSpeed = CurrentSpeed + IncreaseAmount;
            HorizontalPosition = HorizontalPosition + CurrentSpeed;
        }
    }

}