package org.example.oct202141Done;

import java.util.Scanner;
public class Paper9q3 {
    static Integer[][] ArrayNodes = new Integer[20][3];
    static int RootPointer = -1;
    static int FreeNode = 0;

    static final Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            AddNode();
        }
        PrintAll();
        InOrder(RootPointer);
    }

    public static void AddNode() {
        boolean Placed;
        int CurrentNode;
        System.out.println("Enter the data");
        int NodeData = Integer.parseInt(console.nextLine());
        if (FreeNode <= 19) {
            ArrayNodes[FreeNode][0] = -1;
            ArrayNodes[FreeNode][1] = NodeData;
            ArrayNodes[FreeNode][2] = -1;
            if (RootPointer == -1) {
                RootPointer = 0;
            } else {
                Placed = false;
                CurrentNode = RootPointer;
                while (!Placed) {
                    if (NodeData < ArrayNodes[CurrentNode][1]) {
                        if (ArrayNodes[CurrentNode][0] == -1) {
                            ArrayNodes[CurrentNode][0] = FreeNode;
                            Placed = true;
                        } else {
                            CurrentNode = ArrayNodes[CurrentNode][0];
                        }
                    } else {
                        if (ArrayNodes[CurrentNode][2] == -1) {
                            ArrayNodes[CurrentNode][2] = FreeNode;
                            Placed = true;
                        } else {
                            CurrentNode = ArrayNodes[CurrentNode][2];
                        }
                    }
                }
            }
            FreeNode = FreeNode + 1;
        } else {
            System.out.println("Tree is full");
        }
    }

    public static void PrintAll() {
        for (int i = 0; i < ArrayNodes.length; i++) {
            if (ArrayNodes[i][0] == null) {
                break;
            }
            System.out.print(ArrayNodes[i][0] + " " + ArrayNodes[i][1] + " " + ArrayNodes[i][2]);
            System.out.println();
        }
    }

    public static void InOrder(int currentNode) {
        if (ArrayNodes[currentNode][1] != -1) {
            if (ArrayNodes[currentNode][0] != -1) {
                InOrder(ArrayNodes[currentNode][0]);
            }
            System.out.println(ArrayNodes[currentNode][1]);
            if (ArrayNodes[currentNode][2] != -1) {
                InOrder(ArrayNodes[currentNode][2]);
            }
        }
    }
}