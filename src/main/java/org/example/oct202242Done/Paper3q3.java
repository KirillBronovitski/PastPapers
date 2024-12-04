package org.example.oct202242Done;

public class Paper3q3 {
    static int[] Queue = new int[100];
    static int headPointer = -1;
    static int tailPointer = 0;

    public static void main(String[] args) {
        boolean allAdded = true;
        for (int i = 1; i <= 20; i++) {
            if (!Enqueue(i)) {
                allAdded = false;
            }
        }
        if (allAdded) {
            System.out.println("Successful");
        } else {
            System.out.println("Unsuccessful");
        }

        System.out.println("The total of all values stored in the queue:");
        System.out.println(recursiveCalculate(99, 0));
    }

    public static boolean Enqueue(int insertValue) {
        if (tailPointer > 99) {
           return false;
        }
        Queue[tailPointer] = insertValue;
        tailPointer++;
        return true;
    }

    public static int recursiveCalculate(int start, int Total) {
        if (start != -1) {
            return Total + recursiveCalculate(start - 1, Queue[start]);
        }
        return Total;
    }

}
