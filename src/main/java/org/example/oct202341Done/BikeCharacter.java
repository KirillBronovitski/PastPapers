package org.example.oct202341Done;

public class BikeCharacter  extends Character {

    public BikeCharacter(String Name, Integer XPosition, Integer YPosition) {
        super(Name, XPosition, YPosition);
    }

    public void Move(String direction) {
        if (!direction.equals("up") && !direction.equals("down") && !direction.equals("left") && !direction.equals("right")) {
            System.out.println("Invalid direction");
        } else {
            switch (direction) {
                case "up":
                    SetYPosition(GetYPosition() + 20);
                    break;
                case "down":
                    SetYPosition(GetYPosition() - 20);
                    break;
                case "left":
                    SetXPosition(GetXPosition() - 20);
                    break;
                case "right":
                    SetXPosition(GetXPosition() + 20);
            }
        }
    }

}
