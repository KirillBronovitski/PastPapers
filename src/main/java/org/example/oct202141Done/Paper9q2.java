package org.example.oct202141Done;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;
public class Paper9q2 {
    static Picture[] arrayPictures = new Picture[100];
    static final Scanner console = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int numberOfPictures = ReadData();
        System.out.println("Enter the colour of the frame of the picture:");
        String colourFrameEntry = console.nextLine().toUpperCase();
        System.out.println("Enter the maximum width of the picture:");
        int maxWidthEntry = Integer.parseInt(console.nextLine());
        System.out.println("Enter the maximum height of the picture:");
        int maxHeightEntry = Integer.parseInt(console.nextLine());


        for (int i = 0; i < numberOfPictures; i++) {
            if (arrayPictures[i].GetHeight() > maxHeightEntry) {
                continue;
            }
            if (arrayPictures[i].GetWidth() > maxWidthEntry) {
                continue;
            }
            if (!arrayPictures[i].GetFrameColour().toUpperCase().equals(colourFrameEntry)) {
                continue;
            }
            System.out.println("The data of the suitable picture:");
            System.out.println("Description: " + arrayPictures[i].GetDescription());
            System.out.println("Width: " + arrayPictures[i].GetWidth());
            System.out.println("Height: " + arrayPictures[i].GetHeight());
        }
    }

    public static int ReadData() throws IOException {
        int counter = 0;
        int index = 0;
        String description;
        int width;
        int height;
        String colourFrame;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/Pictures.txt"))) {
            while (fileReader.hasNextLine()) {
                counter++;
                description = fileReader.next();
                width = Integer.parseInt(fileReader.next());
                height = Integer.parseInt(fileReader.next());
                colourFrame = fileReader.next();
                arrayPictures[index] = new Picture(description, width, height, colourFrame);
                index++;
            }
        } catch (IOException e) {
            System.out.println("The source file had not been found or does not exist");
        }
        return counter;
    }

}