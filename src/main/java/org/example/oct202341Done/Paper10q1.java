package org.example.oct202341Done;

public class Paper10q1 {

    public static void main(String[] args) {
        System.out.println("Number of vowels in word \"house\": " + IterativeVowels("house"));
        System.out.println("Number of vowels in word \"imagine\": " + RecursiveVowels("imagine"));
    }

    public static int IterativeVowels(String Value) {
        Integer Total;
        Integer LengthString;
        char FirstCharacter;
        Total = 0;
        LengthString = Value.length();
        for (int X = 0; X <= LengthString - 1; X++) {
            FirstCharacter = Value.substring(0, 1).charAt(0);
            if (FirstCharacter == 'a' || FirstCharacter == 'e' || FirstCharacter == 'i' || FirstCharacter == 'o' || FirstCharacter == 'u') {
                Total = Total + 1;
            }
            Value = Value.substring(1);
        }
        return Total;
    }

    public static int RecursiveVowels(String Value) {
        Integer Total;
        Integer LengthString;
        char FirstCharacter;
        LengthString = Value.length();
        FirstCharacter = Value.substring(0, 1).charAt(0);
        if (FirstCharacter == 'a' || FirstCharacter == 'e' || FirstCharacter == 'i' || FirstCharacter == 'o' || FirstCharacter == 'u') {
            if (LengthString == 1) {
                Total = 1;
            } else {
                Total = 1 + RecursiveVowels(Value.substring(1));
            }
        }  else {
            if (LengthString == 1) {
                Total = 0;
            } else {
                Total = RecursiveVowels(Value.substring(1));;
            }
        }
        return Total;
    }

}