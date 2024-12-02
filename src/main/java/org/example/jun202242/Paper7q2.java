package org.example.jun202242;


import java.util.Random;

public class Paper7q2 {
    private final static Random rnd = new Random();

    public static void main(String[] args) {
        int[][] ArrayData = new int[10][10];
        for (int i = 0; i < ArrayData.length; i++) {
            for (int j = 0; j < ArrayData.length; j++) {
                ArrayData[i][j] = rnd.nextInt(1, 100);
            }
        }

        outputArray(ArrayData);

        int TempValue;
        int ArrayLength = 10;
        for (int X = 0; X <= ArrayLength - 1; X++) {
            for (int Y = 0; Y <= ArrayLength - 2; Y++) {
                for (int Z = 0; Z <= ArrayLength - Y - 2; Z++) {
                    if (ArrayData[X][Z] > ArrayData[X][Z + 1]) {
                        TempValue = ArrayData[X][Z];
                        ArrayData[X][Z] = ArrayData[X][Z + 1];
                        ArrayData[X][Z + 1] = TempValue;
                    }
                }
            }
        }
        System.out.println();
        outputArray(ArrayData);

        System.out.println(BinarySearch(ArrayData, 0, 9, ArrayData[0][3]));
        System.out.println(BinarySearch(ArrayData, 0, 9, ArrayData[1][3]));

    }

    public static void outputArray(int[][] arrayData) {
        for (int[] arrayDatum : arrayData) {
            for (int j = 0; j < arrayData.length; j++) {
                System.out.print(arrayDatum[j]);
                if (j == arrayData.length - 1) {
                    break;
                }
                if (String.valueOf(arrayDatum[j]).length() == 1) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static int BinarySearch(int[][] SearchArray, int Lower, int Upper, int SearchValue) {
        int Mid;
        if (Upper >= Lower) {
            Mid = (Lower + (Upper)) / 2;
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
