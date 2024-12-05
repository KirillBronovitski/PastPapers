package org.example.jun202341Done;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;
public class Paper4q3 {

    static String[] Animal = new String[20];
    static String[] Colour = new String[20];
    static int AnimalTopPointer = 0;
    static int ColourTopPointer = 0;
    public static void main(String[] args) throws IOException {
        ReadData();
        OutputItem();
        OutputItem();
        OutputItem();
        OutputItem();
    }

    public static boolean PushAnimal(String DataToPush) {
        if (AnimalTopPointer == 20) {
            return false;
        }
        Animal[AnimalTopPointer] = DataToPush;
        AnimalTopPointer++;
        return true;
    }
    public static String PopAnimal() {
        String ReturnData;
        if (AnimalTopPointer == 0) {
            return "";
        }

        ReturnData = Animal[AnimalTopPointer - 1];
        AnimalTopPointer--;
        return ReturnData;
    }
    public static void ReadData() throws IOException {
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/AnimalData.txt"))) {
            while (fileReader.hasNextLine()) {
                if (!PushAnimal(fileReader.next())) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("The source file AnimalData.txt had not been found or does not exist");
        }
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/ColourData.txt"))) {
            while (fileReader.hasNextLine()) {
                if (!PushColour(fileReader.next())) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("The source file ColourData.txt had not been found or does not exist");
        }
    }
    public static boolean PushColour(String DataToPush) {
        if (ColourTopPointer == 20) {
            return false;
        }
        Colour[ColourTopPointer] = DataToPush;
        ColourTopPointer++;
        return true;
    }
    public static String PopColour() {
        String ReturnData;
        if (ColourTopPointer == 0) {
            return "";
        }
        ReturnData = Colour[ColourTopPointer - 1];
        ColourTopPointer--;
        return ReturnData;
    }

    public static void OutputItem() {
        String poppedColour = PopColour();
        String poppedAnimal = PopAnimal();
        if (ColourTopPointer == 0) {
            PushAnimal(poppedAnimal);
            System.out.println("No colour");
        } else if (AnimalTopPointer == 0) {
            PushColour(poppedColour);
            System.out.println("No animal");
        } else {
            System.out.println(poppedColour + " " + poppedAnimal);
        }
    }

}
