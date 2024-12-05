package org.example.jun202341;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;
public class Paper4q1 {

    public static void main(String[] args) throws IOException {
        int[] DataArray = new int[25];
        int index = 0;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/Data.txt"))) {
            while (fileReader.hasNextLine()) {
                DataArray[index] = Integer.parseInt(fileReader.nextLine());
                index++;
            }
        } catch (IOException e) {
            System.out.println("The source file had not been found");
        }
        PrintArray(DataArray);
        Scanner console = new Scanner(System.in);
        System.out.println();
        int numberEntry = -1;
        while (numberEntry < 0 || numberEntry > 100) {
            System.out.println("Enter the number in range 1-100 inclusive:");
            numberEntry = Integer.parseInt(console.nextLine());
        }
        System.out.println("The number " + numberEntry + " is found " + LinearSearch(DataArray, numberEntry) + " times.");
    }

    public static void PrintArray(int[] arrayInteger) {
        for (int i = 0; i < arrayInteger.length; i++) {
            if (i != arrayInteger.length - 1) {
                System.out.print(arrayInteger[i] + " ");
            } else {
                System.out.print(arrayInteger[i]);
            }
        }
    }

    public static int LinearSearch(int[] arrayInteger, int searchValue) {
       int counter = 0;

       for (int i = 0; i < arrayInteger.length; i++) {
           if (arrayInteger[i] == searchValue) {
               counter++;
           }
       }
       return counter;
    }

}

/*
public class Paper4q1 {

    public static void main(String[] args) throws IOException {
        int[] DataArray = new int[25];
        int index = 0;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/Data.txt"))) {
            while (fileReader.hasNextLine()) {
                String stringOfTheNumber = fileReader.nextLine();
                try {
                    int number = Integer.parseInt(stringOfTheNumber);
                    DataArray[index] = number;
                } catch (NumberFormatException ignored) {
                }
                index = index + 1;
                if (index >= DataArray.length) {
                    break;
                }
            }

        } catch (IOException ignored) {
        }
        Paper4q1 program = new Paper4q1();
        program.PrintArray(DataArray);

        Scanner console = new Scanner(System.in);
        int numberInput = -1;
        System.out.println();
        System.out.println("Enter the integer number in range 1-100 inclusive:");

        while (numberInput > 100 || numberInput < 1) {
            try {
                String input = console.nextLine();
                numberInput = Integer.parseInt(input);
                if (numberInput <= 100 && numberInput >= 1) {
                    break;
                }
                System.out.println("The number entered is not in the range 1-100 inclusive, please enter other number:");
            } catch (NumberFormatException e) {
                System.out.println("The value entered is not an integer number, please enter the integer value:");


            }
        }

        System.out.println("The number " + numberInput + " is found " + program.LinearSearch(DataArray, numberInput) + " times.");


    }

    public void PrintArray(int[] integerArray) {
        for (int i = 0; i < integerArray.length; i++) {
            if (i != integerArray.length - 1) {
                System.out.print(integerArray[i] + " ");
            } else {
                System.out.print(integerArray[i]);
            }
        }
    }

    public int LinearSearch(int[] numbers, int searchValue) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchValue) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
*/

