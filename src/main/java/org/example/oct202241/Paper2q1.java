package org.example.oct202241;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;

public class Paper2q1 {

    static int[] DataArray = new int[100];

    public static void main(String[] args) throws IOException {
        ReadFile();
        System.out.println("The number of times the entered number matched with the numbers from the data array: " + FindValues());
        BubbleSort();

    }

    public static void ReadFile() throws IOException {
        int number;
        int index = 0;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/IntegerData.txt"))) {
            while (fileReader.hasNextLine()) {
                number = Integer.parseInt(fileReader.nextLine());
                DataArray[index] = number;
                index++;
                if (index > DataArray.length - 1) {
                    System.out.println("The array is fully filled!");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("The source file had not been found or does not exist.");
        }
    }

    public static int FindValues() {
        Scanner console = new Scanner(System.in);
        int numberEntry = -1;
        int counter = 0;
        while (numberEntry < 0 || numberEntry > 100) {
            System.out.println("Enter the number in range 1-100 inclusive:");
            numberEntry = Integer.parseInt(console.nextLine());
        }
        for (int i = 0; i < DataArray.length; i++) {
            if (DataArray[i] == numberEntry) {
                counter++;
            }
        }
        return counter;
    }

    public static void BubbleSort() {
        int temporaryStorage;
        for (int i = 1; i <= DataArray.length; i++) {
            for (int j = 0; j < DataArray.length - i; j++) {
                if (DataArray[j] > DataArray[j + 1]) {
                    temporaryStorage = DataArray[j];
                    DataArray[j] = DataArray[j + 1];
                    DataArray[j + 1] = temporaryStorage;
                }
            }
        }
        for (int i = 0; i < DataArray.length; i++) {
            System.out.print(DataArray[i]);
            if (i != DataArray.length - 1) {
                System.out.print(" ");
            }
        }
    }

}