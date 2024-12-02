package org.example.jun202342;

public class Paper5q2 {

    private SaleData[] CircularQueue = new SaleData[5];
    private int Head;
    private int Tail;
    private int NumberOfItems;


    public static void main(String[] args) {
        Paper5q2 program = new Paper5q2();
        program.initialiseProperties();
        program.EnterRecord("ADF", 10);
        program.EnterRecord("OOP", 1);
        program.EnterRecord("BXW", 5);
        program.EnterRecord("XXZ", 22);
        program.EnterRecord("HQR", 6);
        program.EnterRecord("LLP", 3);

        SaleData saleOutput = program.Dequeue();
        if (saleOutput == null) {
            System.out.println("Error: the queue is empty.");
        } else {
            System.out.println(saleOutput.ID + " " + saleOutput.quantity);
        }
        program.EnterRecord("LLP", 3);

        for (int i = 0; i < program.getCircularQueue().length; i++) {
            System.out.println(program.getCircularQueue()[i].ID + " " + program.getCircularQueue()[i].quantity);
        }
    }

    public void initialiseProperties() {
        for (int i = 0; i < CircularQueue.length; i++) {
            SaleData saleData = new SaleData("", -1);
            CircularQueue[i] = saleData;
        }
        Head = 0;
        Tail = 0;
        NumberOfItems = 0;
    }

    public int Enqueue(SaleData record) {
        int returnValue = 1;
        boolean queueNotFull = false;
        if (NumberOfItems < CircularQueue.length) {
            queueNotFull = true;
        }
        if (!queueNotFull) {                                                     //Head <= 0 && Tail >= CircularQueue.length - 1
            returnValue = -1;
        } else {
            while (Head != 0) {
                for (int i = 0; i < CircularQueue.length - Head; i++) {
                    CircularQueue[Head + i - 1] = CircularQueue[Head + i];
                }
                Head = Head - 1;
                Tail = Tail - 1;

            }
            CircularQueue[Tail] = record;
            Tail = Tail + 1;
            NumberOfItems = NumberOfItems + 1;
        }

        return returnValue;
    }

    public SaleData Dequeue() {
        SaleData returnValue = new SaleData("", -1);
        boolean queueEmpty = false;
        if (NumberOfItems == 0) {                                                             //CircularQueue[i].ID.equals("")
            queueEmpty = true;
        }
        if (queueEmpty) {                                                     //Head <= 0 && Tail >= CircularQueue.length - 1
            returnValue = null;
        } else {
            returnValue.ID = CircularQueue[Head].ID;
            returnValue.quantity = CircularQueue[Head].quantity;
            CircularQueue[Head].ID = "";
            CircularQueue[Head].quantity = -1;

            Head = Head + 1;
            NumberOfItems = NumberOfItems - 1;
        }
        return returnValue;
    }

    public void EnterRecord(String id, int quantity) {
        SaleData record = new SaleData(id, quantity);
        if (Enqueue(record) == -1) {
            System.out.println("Full");
        } else {
            System.out.println("Stored");
        }

    }

    public SaleData[] getCircularQueue() {
        return CircularQueue;
    }
}
