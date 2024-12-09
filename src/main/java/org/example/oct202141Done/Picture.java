package org.example.oct202141Done;

public class Picture {

    private String Description;
    private int Width;
    private int Height;
    private String FrameColour;

    public Picture(String Description, int Width, int Height, String FrameColour) {
        this.Description = Description;
        this.Width = Width;
        this.Height = Height;
        this.FrameColour = FrameColour;
    }

    public String GetDescription() {
        return Description;
    }

    public int GetWidth() {
        return Width;
    }

    public int GetHeight() {
        return Height;
    }

    public String GetFrameColour() {
        return FrameColour;
    }

    public void SetDescription(String Description) {
        this.Description = Description;
    }



}














































/*
public class Picture {

    private String Description;
    private int Width;
    private int Height;
    private String FrameColour;

    public Picture(String description, int width, int height, String frameColour) {
        Description = description;
        Width = width;
        Height = height;
        FrameColour = frameColour;
    }

    public String GetDescription() {
        return Description;
    }

    public int GetWidth() {
        return Width;
    }

    public int GetHeight() {
        return Height;
    }

    public String GetFrameColour() {
        return FrameColour;
    }

    public void SetDescription(String description) {
        Description = description;
    }

}
*/