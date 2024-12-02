package org.example.oct202141;

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
