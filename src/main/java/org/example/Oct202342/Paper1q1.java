package org.example.Oct202342;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;
/*  The commented imports are required for the previous solution (see commented code below)
import java.nio.file.Files;
*/
public class Paper1q1 {
    static char[] StackVowel = new char[100];
    static char[] StackConsonant = new char[100];
    static int VowelTop = 0;
    static int ConsonantTop = 0;

    public static void main(String[] args) throws IOException {
        ReadData();
        Scanner console = new Scanner(System.in);
        String userChoice;
        String letters = "";
        String consonantPop;
        String vowelPop;
        for (int i = 0; i < 5; i++) {
            System.out.println("Which letter, vowel or consonant, is required to be popped (write consonant or vowel)");
            userChoice = console.nextLine();
            if (userChoice.equals("consonant")) {
                consonantPop = PopConsonant();
                if (!consonantPop.equals("No data")) {
                    letters = letters + consonantPop;
                }
            } else if (userChoice.equals("vowel")) {
                vowelPop = PopVowel();
                if (!vowelPop.equals("No data")) {
                    letters = letters + vowelPop;
                }
            } else {
                i--;
            }
        }
        System.out.println(letters);
    }

    public static void PushData(char letter) {
        boolean isVowel = letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u' || letter == 'a';
        if (isVowel) {
            if (VowelTop < StackVowel.length) {
                StackVowel[VowelTop] = letter;
                VowelTop++;
            } else {
                System.out.println("The stack is full, the letter cannot be added.");
            }

        } else {
            if (ConsonantTop < StackConsonant.length) {
                StackConsonant[ConsonantTop] = letter;
                ConsonantTop++;
            } else {
                System.out.println("The stack is full, the letter cannot be added.");
            }
        }
    }

    public static void ReadData() throws IOException {
        String fileLine;
        char letter;
        int index = 0;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/StackData.txt"))) {
            while (fileReader.hasNextLine()) {
                fileLine = fileReader.nextLine();
                while (index < fileLine.length()) {
                    letter = fileLine.charAt(index);
                    PushData(letter);
                    index++;
                }
            }
        } catch (IOException e) {
            System.out.println("The source file had not been found or does not exist.");
        }
    }

    public static String PopVowel() {
        String returnValue = "No data";
            if (StackVowel[0] == '\0') {
                System.out.println("No item - the stack is empty.");
                return returnValue;
            }
            if (VowelTop > 0) {
                returnValue = String.valueOf(StackVowel[VowelTop - 1]);
                StackVowel[VowelTop - 1] = '\0';
                VowelTop--;
            }
        return returnValue;
    }

    public static String PopConsonant() {
        String returnValue = "No data" ;
        if (StackConsonant[0] == '\0') {
            System.out.println("No item - the stack is empty.");
            return returnValue;
        }
        if (ConsonantTop > 0) {
            returnValue = String.valueOf(StackConsonant[ConsonantTop - 1]);
            StackConsonant[ConsonantTop - 1] = '\0';
            ConsonantTop--;
        }
        return returnValue;
    }

}
/*                                  Previous solution (all the commented code below this text)
public class Paper1q1 {

    char[] StackVowel = new char[100];
    char[] StackConsonant = new char[100];
    int VowelTop;
    int ConsonantTop;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Paper1q1 program = new Paper1q1();
        program.setVowelTop(0);
        program.setConsonantTop(0);
        program.ReadData();
        String[] StackReturns = new String[5];
        String choice;
        String message1 = "";
        String message2 = "";
        for (int i = 0; i < 5; i++) {
            System.out.println("Input 'consonant' to attempt to pop an item from the stack of consonants");
            System.out.println("OR");
            System.out.println("Input 'vowel' to attempt to pop an item from the stack of vowels:");
            choice = scanner.next();
            switch (choice) {
                case "consonant" -> {
                    StackReturns[i] = program.PopConsonant();
                    if (StackReturns[i].equals("No data")) {
                        message1 = StackReturns[i];
                        System.out.println(StackReturns[i] + "; the stack for consonants is empty.");
                        StackReturns[i] = "\0";
                        i = i - 1;
                    }
                }
                case "vowel" -> {
                    StackReturns[i] = program.PopVowel();
                    if (StackReturns[i].equals("No data")) {
                        message2 = StackReturns[i];
                        System.out.println(StackReturns[i] + "; the stack for vowels is empty.");
                        StackReturns[i] = "\0";
                        i = i - 1;
                    }
                }
                default -> i = i - 1;
            }
            if (message1.equals("No data") && message2.equals("No data")) {
                System.out.println("Both stacks are identified to be empty. Halting the program..");
                break;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(StackReturns[i]);
        }
    }

    public void setVowelTop(int v) {
        VowelTop = v;
    }

    public void setConsonantTop(int c) {
        ConsonantTop = c;
    }

    public void PushData(char letter) {

        boolean isVowel = false;
        char[] vowels = {'a', 'e', 'o', 'i', 'u'};
        for (char vowel : vowels) {
            if (letter == vowel) {
                isVowel = true;
                break;
            }
        }
        if (isVowel && VowelTop <= StackVowel.length - 1) {
            VowelTop = VowelTop + 1;
            StackVowel[VowelTop] = letter;
        } else if (!isVowel && ConsonantTop <= StackConsonant.length - 1) {
            ConsonantTop = ConsonantTop + 1;
            StackConsonant[ConsonantTop] = letter;
        } else {
            System.out.println("The stack is full, the letter cannot be pushed");
        }
    }

    public void ReadData() throws IOException {
        String fileLetters = Files.readString(Paths.get("c:/dev/stackData.txt"));
        for (int i = 0; i < fileLetters.length(); i++) {
            PushData(fileLetters.charAt(i));
        }
    }

    public String PopVowel() {
        String stackElement = String.valueOf(StackVowel[VowelTop]);
        if (StackVowel[VowelTop] != '\0') {
            StackVowel[VowelTop] = '\0';
            if (VowelTop > 0) {
                VowelTop--;
            }
            return stackElement;
        } else {
            return "No data";
        }
    }

    public String PopConsonant() {
        String stackElement = String.valueOf(StackConsonant[ConsonantTop]);
        if (StackConsonant[ConsonantTop] != '\0') {
            StackConsonant[ConsonantTop] = '\0';
            if (ConsonantTop > 0) {
                ConsonantTop--;
            }
            return stackElement;
        } else {
            return "No data";
        }

    }
}
*/

