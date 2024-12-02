package org.example.oct202141;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;

public class Paper9q2 {

    static Picture[] pictureArray = new Picture[100];

    public static void main(String[] args) throws IOException {
        ReadData();
        Scanner console = new Scanner(System.in);
        int widthEntry = -1;
        int heightEntry = -1;
        String frameColourEntry = "";
        System.out.println("Enter the required width:");
        widthEntry = Integer.parseInt(console.nextLine());
        System.out.println("Enter the required height:");
        heightEntry = Integer.parseInt(console.nextLine());
        System.out.println("Enter the required colour of the frame:");
        frameColourEntry = console.nextLine();
        boolean descriptionMatching = false;
        boolean widthMatching = false;
        boolean heightMatching = false;
        boolean frameColourMatching = false;

        for (int i = 0; i < pictureArray.length; i++) {
            if (pictureArray[i] != null) {
                if (!(pictureArray[i].GetWidth() == widthEntry)) {
                    continue;
                }
                if (!(pictureArray[i].GetHeight() == heightEntry)) {
                    continue;
                }
                if (!(pictureArray[i].GetFrameColour().toUpperCase().equals(frameColourEntry.toUpperCase()))) {
                    continue;
                }
                System.out.println(pictureArray[i].GetDescription());
                break;
            }
            break;
        }
    }

    public static int ReadData() throws IOException {
        int counter = 0;
        String description;
        int width;
        int height;
        String frameColour;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/Pictures.txt"))) {
            while (fileReader.hasNextLine()) {
                description = fileReader.next();
                width = Integer.parseInt(fileReader.next());
                height = Integer.parseInt(fileReader.next());
                frameColour = fileReader.nextLine().substring(1);
                pictureArray[counter] = new Picture(description, width, height, frameColour);
                counter++;
            }
        } catch (IOException e) {
            System.out.println("The file had not been found.");
        }

        return counter;
    }

}
