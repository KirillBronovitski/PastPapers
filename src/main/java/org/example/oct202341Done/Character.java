package org.example.oct202341Done;

public class Character {

    private String Name;
    private Integer XPosition;
    private Integer YPosition;

    public Character(String Name, Integer XPosition, Integer YPosition) {
        this.Name = Name;
        this.XPosition = XPosition;
        this.YPosition = YPosition;
    }

    public Integer GetXPosition() {
        return XPosition;
    }

    public Integer GetYPosition() {
        return YPosition;
    }

    public void SetXPosition(Integer XPosition) {
        if (XPosition < 0) {
            this.XPosition = 0;
        } else if (XPosition > 10000) {
            this.XPosition = 10000;
        } else {
            this.XPosition = XPosition;
        }
    }

    public void SetYPosition(Integer YPosition) {
        if (YPosition < 0) {
            this.YPosition = 0;
        } else if (YPosition > 10000) {
            this.YPosition = 10000;
        } else {
            this.YPosition = YPosition;
        }
    }

    public void Move(String direction) {
        if (!direction.equals("up") && !direction.equals("down") && !direction.equals("left") && !direction.equals("right")) {
            System.out.println("Invalid direction");
        } else {
            switch (direction) {
                case "up":
                    SetYPosition(YPosition + 10);
                    break;
                case "down":
                    SetYPosition(YPosition - 10);
                    break;
                case "left":
                    SetXPosition(XPosition - 10);
                    break;
                case "right":
                    SetXPosition(XPosition + 10);
            }
        }
    }

}
