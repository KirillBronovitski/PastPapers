package org.example.oct202141;

public class Paper9q1 {

    public static void main(String[] args) {
        System.out.println("10 15");
        System.out.println(Unknown(10, 15));
        System.out.println("10 10");
        System.out.println(Unknown(10, 10));
        System.out.println("15 10");
        System.out.println(Unknown(15, 10));

        System.out.println();
        System.out.println();

        System.out.println("10 15");
        System.out.println(IterativeUnknown(10, 15));
        System.out.println("10 10");
        System.out.println(IterativeUnknown(10, 10));
        System.out.println("15 10");
        System.out.println(IterativeUnknown(15, 10));
    }

    public static int Unknown(int X, int Y) {
        if (X < Y) {
            System.out.print(X + Y + " ");
            return Unknown((X + 1) * 2, Y * 2);
        } else {
            if (X == Y) {
                return 1;
            } else {
                System.out.print(X + Y + " ");
                return Unknown((X - 1) / 2, Y / 2);
            }
        }
    }

    public static int IterativeUnknown(int X, int Y) {
        while (X != Y) {
            if (X < Y) {
                System.out.print(X + Y + " ");
                X = (X + 1) * 2;
                Y = Y * 2;
            } else {
                System.out.print(X + Y + " ");
                X = (X - 1) / 2;
                Y = Y / 2;
            }
        }
        return 1;
    }
}
