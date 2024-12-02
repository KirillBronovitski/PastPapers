package org.example.oct202141;

import java.util.Scanner;

public class Paper9q3 {
    int[][] ArrayNodes = new int[20][3];
    int RootPointer = -1;
    int FreeNode = 0;

    public static void main(String[] args) {

    }

    public static void AddNode(int[][] ArrayNodes, int RootPointer, int FreeNode) {
        System.out.println("Enter the data");
        Scanner console = new Scanner(System.in);
        int NodeData = Integer.parseInt(console.nextLine());
        int CurrentNode;
        boolean Placed;
        if (FreeNode <= 19) {
            ArrayNodes[FreeNode][0] = -1;
            ArrayNodes[FreeNode][1] = NodeData;
            ArrayNodes[FreeNode][2] = -1;
            if (RootPointer == -1) {
                RootPointer = 0;
            } else {
                Placed = false;
                CurrentNode = RootPointer;
                while (Placed == false)  {
                    if (NodeData < ArrayNodes[CurrentNode][1]) {
                        if (ArrayNodes[CurrentNode][0] == -1) {

                        }
                    }
                }
            }
        }
    }

}
