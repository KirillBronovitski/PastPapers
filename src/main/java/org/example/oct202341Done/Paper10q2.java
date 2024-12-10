package org.example.oct202341Done;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;
public class Paper10q2 {
    static RecordData[] Records  = new RecordData[50];
    static Integer NumberRecords = 0;
    static String[] Queue = new String[50];
    static Integer HeadPointer = -1;
    static Integer TailPointer = 0;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < Records.length; i++) {
            Records[i] = new RecordData();
        }
        ReadData();
        for (int i = 0; i < Queue.length; i++) {
            if (Queue[i] != null) {
                TotalData();
            }
        }
        OutputRecords();
    }

    public static void Enqueue(String value) {
        if (TailPointer == Queue.length) {
            System.out.println("The queue is full, the value cannot be added");
        } else {
            Queue[TailPointer] = value;
            TailPointer++;
            if (HeadPointer == -1) {
                HeadPointer = 0;
            }
        }
    }

    public static String Dequeue() {
        String returnValue = "Empty";
        if (TailPointer == 0) {
            return returnValue;
        } else {
            returnValue = Queue[HeadPointer];
            HeadPointer++;
        }
        return returnValue;
    }

    public static void ReadData() throws IOException {
        String value;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/QueueData.txt"))) {
            while (fileReader.hasNextLine()) {
                value = fileReader.next();
                Enqueue(value);
            }
        }
    }

    public static void TotalData() {
        String DataAccessed;
        boolean Flag;
        DataAccessed = Dequeue();
        Flag = false;
        if (NumberRecords == 0) {
            Records[NumberRecords].ID = DataAccessed;
            Records[NumberRecords].Total = 1;
            Flag = true;
            NumberRecords = NumberRecords + 1;
        } else {
            for (int X = 0; X <= NumberRecords - 1; X++) {
                if (Records[X].ID.equals(DataAccessed)) {
                    Records[X].Total = Records[X].Total + 1;
                    Flag = true;
                }
            }
        }
        if (Flag == false) {
            Records[NumberRecords].ID = DataAccessed;
            Records[NumberRecords].Total = 1;
            NumberRecords = NumberRecords + 1;
        }
    }

    public static void OutputRecords() {
        for (int i = 0; i < Records.length; i++) {
            if (Records[i].ID == null) {
                break;
            }
            System.out.println("ID " + Records[i].ID + " Total " + Records[i].Total);
        }
    }

}















































/*
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;

public class Paper10q2 {
    static String[] Queue = new String[50];
    static int HeadPointer = -1;
    static int TailPointer = 0;

    static RecordData[] Records = new RecordData[50];

    static int NumberRecords = 0;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < Records.length; i++) {
            Records[i] = new RecordData();
            Records[i].ID = "";
            Records[i].Total = -1;
        }
        for (int i = 0; i < Queue.length; i++) {
            Queue[i] = "";
        }
        ReadData();
        int counter = 0;
        for (int i = 0; i < Queue.length; i++) {
            if (!Queue[i].equals("\0")) {
                counter++;
            }
        }
        for (int i = 0; i < counter; i++) {
            TotalData();
        }
        OutputRecords();
    }

    public static void Enqueue(String insertValue) {
        if (HeadPointer != 0) {
            for (int i = 1; i < Queue.length - 1; i++) {
                if (!Queue[HeadPointer + i].equals("")) {
                    Queue[HeadPointer + i] = Queue[i];
                } else {
                    break;
                }
            }
            HeadPointer = 0;
        }

        if (TailPointer == Queue.length - 1 && !Queue[TailPointer].equals("")) {
            System.out.println("The queue is full, the value cannot be added.");
        } else {
            Queue[TailPointer] = insertValue;
            TailPointer++;
        }
    }

    public static String Dequeue() {
        String popString;
        if (TailPointer == 0) {
            System.out.println("The queue is empty");
            return "Empty";
        } else {
            popString = Queue[HeadPointer];
            Queue[HeadPointer] = "\0";
            HeadPointer++;
        }
        return popString;
    }

    public static void ReadData() throws IOException {
        String gameID;
        int queueIndex = 0;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/QueueData.txt"))) {
            while (fileReader.hasNextLine()) {
                gameID = fileReader.nextLine();
                Enqueue(gameID);
                queueIndex++;
            }
        } catch (IOException e) {
            System.out.println("The file had not been found.");
        }
    }

    public static void TotalData() {
        String DataAccessed;
        boolean Flag;
        DataAccessed = Dequeue();
        Flag = false;
        if (NumberRecords == 0) {
            Records[NumberRecords].ID = DataAccessed;
            Records[NumberRecords].Total = 1;
            Flag = true;
            NumberRecords = NumberRecords + 1;
        } else {
            for (int X = 0; X <= NumberRecords - 1; X++) {
                if(Records[X].ID.equals(DataAccessed)) {
                    Records[X].Total = Records[X].Total + 1;
                            Flag = true;
                }
            }
        }
        if (Flag == false) {
            Records[NumberRecords].ID = DataAccessed;
            Records[NumberRecords].Total = 1;
            NumberRecords = NumberRecords + 1;
        }
    }

    public static void OutputRecords() {
        for (int i = 0; i < Records.length; i++) {
            if (Records[i].ID.equals("")) {
                break;
            }
            System.out.print("ID " + Records[i].ID + " ");
            System.out.println("Total " + Records[i].Total + " ");
        }
    }

}
*/