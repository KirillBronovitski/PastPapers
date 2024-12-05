package org.example.jun202341Done;

public class Vehicle {

    private String ID;
    private int MaxSpeed;
    private int CurrentSpeed;
    private int IncreaseAmount;
    private int HorizontalPosition;


    public Vehicle(String ID, int MaxSpeed, int IncreaseAmount) {
        this.ID = ID;
        this.MaxSpeed = MaxSpeed;
        this.IncreaseAmount = IncreaseAmount;
        CurrentSpeed = 0;
        HorizontalPosition = 0;
    }

    public int GetMaxSpeed(){
        return MaxSpeed;
    }

    public int GetCurrentSpeed() {
        return CurrentSpeed;
    }

    public int GetIncreaseAmount() {
        return IncreaseAmount;
    }

    public int GetHorizontalPosition() {
        return HorizontalPosition;
    }

    public void SetCurrentSpeed(int CurrentSpeed) {
        this.CurrentSpeed = CurrentSpeed;
    }

    public void SetHorizontalPosition(int HorizontalPosition) {
        this.HorizontalPosition = HorizontalPosition;
    }

    public void IncreaseSpeed() {
        CurrentSpeed = CurrentSpeed + IncreaseAmount;
        if (CurrentSpeed > MaxSpeed) {
            throw new IllegalArgumentException();
        }
        HorizontalPosition = HorizontalPosition + CurrentSpeed;
    }

    public void outputPosition() {
        System.out.println("Horizontal position: " + HorizontalPosition);
        System.out.println("Current speed: " + CurrentSpeed);
    }

}