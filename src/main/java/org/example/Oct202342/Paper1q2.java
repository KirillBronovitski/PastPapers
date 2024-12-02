package org.example.Oct202342;

public class Paper1q2 {

    public static void main(String[] args) {
        System.out.println(IterativeCalculate(10));
        System.out.println(RecursiveValue(10, 10));
    }

    public static int IterativeCalculate(int Number) {
        int Total;
        int ToFind;
        ToFind = Number;
        Total = 0;
        while (Number != 0) {
            if (ToFind % Number == 0) {
                Total = Total + Number;
            }
            Number = Number - 1;
        }
        return Total;
    }

    public static int RecursiveValue(int Number, int ToFind) {
        if (Number == 0) {
            return 0;
        } else {
            if (ToFind % Number == 0) {
                return Number + RecursiveValue(Number - 1, ToFind);
            } else {
                return RecursiveValue(Number - 1, ToFind);
            }
        }

    }

}
