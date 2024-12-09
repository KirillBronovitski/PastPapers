package org.example.jun202241;
import java.util.Scanner;
public class Paper6q3 {
    static String[] QueueArray = new String[10];
    static int HeadPointer = 0;
    static int TailPointer = 0;
    static int NumberItems = 0;
    static final Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
             String dataToAdd = console.nextLine();
             if (Enqueue(dataToAdd)) {
                 System.out.println("The value had been successfully added");
             } else {
                 System.out.println("The queue is full, the value cannot be added");
             }
        }
        for (int i = 0; i < 2; i++) {
            String valueReturned = Dequeue();
            if (!valueReturned.equals("FALSE")) {
                System.out.println("The value that left the queue: " + valueReturned);
            }
        }
    }


    public static boolean Enqueue(String DataToAdd) {
        if (NumberItems == 10) {
            return false;
        }
        QueueArray[TailPointer] = DataToAdd;
        if (TailPointer >= 9) {
            TailPointer = 0;
        } else {
            TailPointer = TailPointer + 1;
        }
        NumberItems = NumberItems + 1;
        return true;
    }

    public static String Dequeue() {
        String returnValue = "FALSE";
        if (NumberItems != 0) {
            returnValue = QueueArray[HeadPointer];
            if (HeadPointer >= 9) {
                HeadPointer = 0;
            } else {
                HeadPointer++;
            }
            NumberItems++;
        }
        return returnValue;
    }

}
