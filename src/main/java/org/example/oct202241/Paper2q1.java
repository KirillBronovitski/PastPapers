package org.example.oct202241;

import java.nio.file.Paths;
import java.io.IOException;
import java.util.Scanner;
//import java.util.ArrayList;
//import java.nio.file.Files;

public class Paper2q1 {

    //    ArrayList<java.lang.Integer> DataArrayMine = new ArrayList<>();
    int[] DataArray = new int[100];
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Paper2q1 program = new Paper2q1();
        program.ReadFile();
        System.out.println("This number is repeated the following number of times: " + program.FindValues());
        program.BubbleSort();
        // program.MyReadFile();
        // System.out.print(program.MyFindValues());
    }

    /*
        public void MyReadFile() throws IOException {
            String readNumList = Files.readString(Paths.get("C:/dev/IntegerData.txt"));
            String numChars = "";
            int num;
            int indexNum = 0;
            int lineIndex = 0;
            System.out.println(readNumList);     //////////////////////////////////////////////////////////////////////
            while (indexNum < readNumList.length()) {
                while (readNumList.charAt(indexNum) != '\r' && readNumList.charAt(indexNum) != '\n') {
                    numChars = numChars + readNumList.charAt(indexNum);
                    if (indexNum < readNumList.length() - 1) {
                        indexNum = indexNum + 1;
                    } else {
                        break;
                    }
                }
                try {
                    num = Integer.parseInt(numChars);
                    DataArrayMine.add(lineIndex, num);
                    numChars = "";
                    indexNum = indexNum + 2;
                } catch (NumberFormatException e) {
                }
                lineIndex = lineIndex + 1;
            }
        }

        public int MyFindValues() {
            int counter = 0;
            System.out.println("Enter the number:");
            int numInput = 0;
            while(numInput <= 0 || numInput > 100) {
                numInput = scanner.nextInt();
                if (numInput <= 0 || numInput > 100){
                    System.out.println("The number is outside range 1-100, please enter other number:");
                }
            }
            for (int j : DataArrayMine) {
                if (numInput == j) {
                    counter = counter + 1;
                }
            }
            return counter;
        }
    */
    public void ReadFile() {
        String readNumLine;
        int num;
        int numIndex = 0;

        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/IntegerData.txt"))) {
            while (fileReader.hasNextLine()) {
                readNumLine = fileReader.nextLine();

                num = Integer.parseInt(readNumLine);
                DataArray[numIndex] = num;

                numIndex = numIndex + 1;
            }
        } catch (NumberFormatException ignored) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int FindValues() {
        int counter = 0;
        System.out.println("Enter the number:");
        int numInput = 0;
        while (numInput <= 0 || numInput > 100) {
            numInput = scanner.nextInt();
            if (numInput <= 0 || numInput > 100) {
                System.out.println("The number is outside range 1-100, please enter other number:");
            }
        }
        for (int j : DataArray) {
            if (numInput == j) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    public void BubbleSort() {
        int borderCounter = DataArray.length - 1;
        int temporaryStorage;
        for (int i = 0; i < DataArray.length; i++) {
            for (int j = 0; j < borderCounter; j++) {
                if (DataArray[j] > DataArray[j + 1]) {
                    temporaryStorage = DataArray[j + 1];
                    DataArray[j + 1] = DataArray[j];
                    DataArray[j] = temporaryStorage;
                }
            }
            borderCounter = borderCounter - 1;
        }
        for (int j : DataArray) {
            System.out.println(j);
        }
    }
}
