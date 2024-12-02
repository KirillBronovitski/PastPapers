package org.example.jun202141Done;

import java.util.Scanner;

public class Paper8q2 {
    static int[] arrayData = new int[10];

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        arrayData[0] = 10;
        arrayData[1] = 5;
        arrayData[2] = 6;
        arrayData[3] = 7;
        arrayData[4] = 1;
        arrayData[5] = 12;
        arrayData[6] = 13;
        arrayData[7] = 15;
        arrayData[8] = 21;
        arrayData[9] = 8;

        System.out.println("Please enter the value you would like to search for:");
        int searchValue = Integer.parseInt(console.nextLine());
        if (linearSearch(searchValue)) {
                System.out.println("The value has been found in the array.");
            } else {
                System.out.println("The value has not been found in the array.");
        }
        bubbleSort();
    }

    public static boolean linearSearch(int searchValue) {
        boolean valueFound = false;
        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] == searchValue) {
                valueFound = true;
            }
        }
        return valueFound;
    }

    public static void bubbleSort() {
        int temp;
        for(int x = 0; x <= arrayData.length - 1; x++) {
            for (int y = 0; y <= arrayData.length - 2 - x; y++) {
                if (arrayData[y] < arrayData[y + 1]) {
                    temp = arrayData[y];
                    arrayData[y] = arrayData[y + 1];
                    arrayData[y + 1] = temp;
                }
            }
        }
    }

}
