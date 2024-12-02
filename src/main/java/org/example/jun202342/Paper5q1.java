package org.example.jun202342;

public class Paper5q1 {
    String[] Animals = new String[10];


    public static void main(String[] args) {
        Paper5q1 program = new Paper5q1();
        program.setAnimals();
        program.SortDescending();
        for(int i = 0; i < program.getAnimalsLength(); i++) {
            System.out.println(program.getAnimal(i));
        }
    }

    public void setAnimals() {
        Animals[0] = "horse";
        Animals[1] = "lion";
        Animals[2] = "rabbit";
        Animals[3] = "mouse";
        Animals[4] = "bird";
        Animals[5] = "deer";
        Animals[6] = "whale";
        Animals[7] = "elephant";
        Animals[8] = "kangaroo";
        Animals[9] = "tiger";
    }

    public void SortDescending() {
        int ArrayLength;
        String Temp;
        ArrayLength = Animals.length;
        for(int X = 0; X <= ArrayLength - 1; X++) {
            for (int Y = 0; Y < ArrayLength - X - 1; Y++) {
                if (Animals[Y].charAt(0) < Animals[Y + 1].charAt(0)) {
                    Temp = Animals[Y];
                    Animals[Y] = Animals[Y + 1];
                    Animals[Y + 1] = Temp;
                }
            }
        }
    }

    public int getAnimalsLength() {
        return Animals.length;
    }

    public String getAnimal(int arrayIndex) {
        return Animals[arrayIndex];
    }
}