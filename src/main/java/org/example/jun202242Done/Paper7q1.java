package org.example.jun202242Done;

import java.util.Scanner;

public class Paper7q1 {

    static final Scanner console = new Scanner(System.in);
    static int[] StackData = new int[10];
    static int StackPointer = 0;

    public static void main(String[] args) {
        int valueEntry;
        for (int i = 0; i < 11; i++) {
            System.out.println("Enter the value:");
            valueEntry = Integer.parseInt(console.nextLine());
            if (Push(valueEntry)) {
                System.out.println("The value had been added to the stack");
            } else {
                System.out.println("The value had not been added - the stack is full");
                break;
            }
        }
        outputStack();
        Pop();
        Pop();
        System.out.println();
        System.out.println("Updated stack (after the removal of top two elements):");
        outputStack();

    }

    public static void outputStack() {
        System.out.println("Current contents of the stack:");
        for (int i = 0; i < StackPointer; i++) {
            System.out.println(StackData[i]);
        }
        System.out.println("Current value of the stack pointer:");
        System.out.println(StackPointer);
    }

    public static boolean Push(int insertValue) {
        if (StackPointer == StackData.length) {
            return false;
        }
        StackData[StackPointer] = insertValue;
        StackPointer++;
        return true;
    }

    public static int Pop() {
        if (StackPointer == 0) {
            return -1;
        }
        int returnValue = StackData[StackPointer - 1];
        StackPointer--;
        return returnValue;
    }
}