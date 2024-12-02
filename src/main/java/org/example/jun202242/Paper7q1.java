package org.example.jun202242;

import java.util.Scanner;

public class Paper7q1 {

    static int[] StackData = new int[10];
    static int StackPointer = 0;

    public static void main(String[] args) {
        int pushValue;
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < 11; i++) {
            System.out.println("Enter the value:");
            pushValue = Integer.parseInt(console.nextLine());
            if (Push(pushValue)) {
                System.out.println("The value is added to the stack!");
            } else {
                System.out.println("The value is not added - the stack is full.");
            }
        }
        outputStack();
        Pop();
        Pop();
        System.out.println("Updated stack:");
        outputStack();
    }

    public static void outputStack() {
        for (int i = 0; i < StackData.length; i++) {
            if (StackData[i] == 0) {
                break;
            }
            System.out.println(StackData[i]);
        }
        System.out.println(StackPointer);
    }

    public static boolean Push(int pushValue) {
        if (StackPointer > StackData.length - 1) {
            return false;
        }
        StackData[StackPointer] = pushValue;
        StackPointer++;

        return true;
    }

    public static int Pop() {
        int popValue = -1;
        if (StackPointer == 0) {
            return popValue;
        }
        popValue = StackData[StackPointer - 1];
        StackData[StackPointer - 1] = 0;
        StackPointer--;
        return popValue;
    }

}