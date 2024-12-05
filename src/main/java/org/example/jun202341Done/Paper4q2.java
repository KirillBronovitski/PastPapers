package org.example.jun202341Done;

public class Paper4q2 {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Tiger", 100, 20);
        Helicopter helicopter1 = new Helicopter("Lion", 350, 40, 3, 100);
        car.IncreaseSpeed();
        car.IncreaseSpeed();
        System.out.println("Position and speed data for the car:");
        car.outputPosition();

        System.out.println();

        helicopter1.IncreaseSpeed();
        helicopter1.IncreaseSpeed();
        System.out.println("Position and speed data for the helicopter:");
        helicopter1.outputPosition();
    }
}
