package org.example.jun202242Done;

import java.util.Random;

public class Paper7q2includesRandom {

    final private static int[][] randomNumbers = new int[10][10];
    private static final Random rnd = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < randomNumbers.length; i++) {
            for (int j = 0; j < randomNumbers.length; j++) {
                randomNumbers[i][j] = rnd.nextInt(1, 100);
            }
        }
        outputNumbers();

        int tempValue;
        int ArrayLength = 10;
        for (int X = 0; X <= ArrayLength - 1; X++) {
            for (int Y = 0; Y <= ArrayLength - 2; Y++) {
                for (int Z = 0; Z <= ArrayLength - Y - 2; Z++) {
                    if (randomNumbers[X][Z] > randomNumbers[X][Z + 1]) {
                        tempValue = randomNumbers[X][Z];
                        randomNumbers[X][Z] = randomNumbers[X][Z + 1];
                        randomNumbers[X][Z + 1] = tempValue;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Updated array after sorting:");
        outputNumbers();

        int searchResult = BinarySearch(randomNumbers, 0, 9, randomNumbers[0][7]);
        if (searchResult == -1) {
            System.out.println("The value had not been found in the given interval");
        } else {
            System.out.println("The value " + randomNumbers[0][7] + " had been found stored at index " + searchResult);
        }

        searchResult = BinarySearch(randomNumbers, 0, 9, randomNumbers[1][4]);
        if (searchResult == -1) {
            System.out.println("The value had not been found in the given interval");
        } else {
            System.out.println("The value " + randomNumbers[0][7] + " had been found stored at index " + searchResult);
        }
    }

    public static void outputNumbers() {
        for (int[] randomNumber : randomNumbers) {
            for (int j = 0; j < randomNumbers.length; j++) {
                System.out.print(randomNumber[j]);
                if (j != randomNumbers.length - 1) {
                    if (String.valueOf(randomNumber[j]).length() == 1) {
                        System.out.print("  ");
                    } else if (String.valueOf(randomNumber[j]).length() == 2) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static int BinarySearch(int[][] SearchArray, int Lower, int Upper, int SearchValue) {
        int Mid;
        if (Upper >= Lower) {
            Mid = (Lower + Upper) / 2;
            if (SearchArray[0][Mid] == SearchValue) {
                return Mid;
            } else {
                if (SearchArray[0][Mid] > SearchValue) {
                    return BinarySearch(SearchArray, Lower, Mid - 1, SearchValue);
                } else {
                    return BinarySearch(SearchArray, Mid + 1, Upper, SearchValue);
                }
            }
        }
        return -1;
    }

}