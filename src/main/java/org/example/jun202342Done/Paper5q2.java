package org.example.jun202342Done;

public class Paper5q2 {

    static SaleData[] CircularQueue = new SaleData[5];
    static int Head = 0;
    static int Tail = 0;
    static int NumberOfItems = 0;

    public static void main(String[] args) {

        for (int i = 0; i < CircularQueue.length; i++) {
            CircularQueue[i] = new SaleData("", -1);
        }
        EnterRecord("ADF", 10);
        EnterRecord("OOP", 1);
        EnterRecord("BXW", 5);
        EnterRecord("XXZ", 22);
        EnterRecord("HQR", 6);
        EnterRecord("LLP", 3);
        for (int i = 0; i < 4; i++) {
            SaleData saleRecordReturned = Dequeue();
            if(saleRecordReturned == null) {
                System.out.println("Error: the queue is empty");
            } else {
                System.out.println("ID: " + saleRecordReturned.ID + "; quantity: " + saleRecordReturned.quantity);
            }
        }
        EnterRecord("LLP", 3);
        EnterRecord("RPX", 36);
        EnterRecord("ABV", 16);


        System.out.println();
        System.out.println("Current contents of the queue:");
        for (int i = 0; i < CircularQueue.length; i++) {
            if (CircularQueue[i] == null) {
                System.out.print("Null");
            } else {
                System.out.print("ID: " + CircularQueue[i].ID + "; quantity: " + CircularQueue[i].quantity);
            }
            if (i == Head) {
                System.out.println("                                 < Head of queue");
            } else if (i == Tail) {
                System.out.println("                                 < Tail of queue");
            } else {
                System.out.println();
            }
        }
    }

    public static int Enqueue(SaleData saleRecord) {
        if (NumberOfItems == CircularQueue.length) {
            return -1;
        }
        if (Tail != CircularQueue.length) {
            CircularQueue[Tail] = saleRecord;
            NumberOfItems++;
            Tail++;
            return 1;
        } else {
            Tail = 0;
            CircularQueue[Tail] = saleRecord;
            Tail++;
            NumberOfItems++;
        }
        return 1;
    }

    public static SaleData Dequeue() {
        SaleData returnValue = null;
        if (CircularQueue[Head] != null) {
            returnValue = CircularQueue[Head];
            CircularQueue[Head] = null;
            NumberOfItems--;
            Head++;
            if (Head == CircularQueue.length && NumberOfItems != 0) {
                Head = 0;
            }
        }
        return returnValue;
    }

    public static void EnterRecord(String ID, int quantity) {
        SaleData saleRecord = new SaleData(ID, quantity);
        if (Enqueue(saleRecord) == -1) {
           System.out.println("Full");
        } else {
            System.out.println("Stored");
        }
    }
}