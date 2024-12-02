package org.example.jun202141Done;

import java.util.Scanner;

public class Paper8q1 {

    public static void main(String[] args) {
        node[] LinkedList = new node[10];

        int startPointer = 0;
        int emptyList = 5;
        for (int i = 0; i < LinkedList.length; i++) {
            LinkedList[i] = new node();
            LinkedList[i].data = 0;
            LinkedList[i].nextNode = -2;
        }

        LinkedList[0].data = 1;
        LinkedList[0].nextNode = 1;
        LinkedList[1].data = 5;
        LinkedList[1].nextNode = 4;
        LinkedList[2].data = 6;
        LinkedList[2].nextNode = 7;
        LinkedList[3].data = 7;
        LinkedList[3].nextNode = -1;
        LinkedList[4].data = 2;
        LinkedList[4].nextNode = 2;
        LinkedList[5].data = 0;
        LinkedList[5].nextNode = 6;
        LinkedList[6].data = 0;
        LinkedList[6].nextNode = 8;
        LinkedList[7].data = 56;
        LinkedList[7].nextNode = 3;
        LinkedList[8].data = 0;
        LinkedList[8].nextNode = 9;
        LinkedList[9].data = 0;
        LinkedList[9].nextNode = -1;
        outputNodes(LinkedList, startPointer);
        if (addNode(LinkedList, startPointer, emptyList)) {
            System.out.println("Added");
        } else {
            System.out.println("Not Added - the linked list is full");
        }
        outputNodes(LinkedList, startPointer);
    }

    public static void outputNodes(node[] linkedList, int startPointer) {
        int index = startPointer;
        System.out.println(linkedList[index].data);
        index = linkedList[index].nextNode;
        while (true) {
            if (linkedList[index].nextNode == -1) {
                System.out.println(linkedList[index].data);
                break;
            }
            System.out.println(linkedList[index].data);
            index = linkedList[index].nextNode;

        }
    }

    public static boolean addNode (node[] linkedList, int startPointer, int emptyList) {
        Scanner console = new Scanner(System.in);
        int index = startPointer;
        while (true) {
            if (linkedList[index].nextNode == -1) {
                break;
            } else {
                index = linkedList[index].nextNode;
            }
        }
            while (linkedList[emptyList].data != 0) {
                emptyList = linkedList[emptyList].nextNode;
                if (emptyList == -1) {
                    return false;
                }
            }
            linkedList[emptyList].data = Integer.parseInt(console.nextLine());

            linkedList[index].nextNode = emptyList;

        return true;
    }

}