package org.example.oct202241Done;

public class Paper2q3 {

    static int[][] ArrayNodes = new int[20][3];

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 20; j++) {
                ArrayNodes[j][i] = -1;
            }
        }
        int FreeNode = 6;
        int RootPointer = 0;

        ArrayNodes[0][0] = 1;
        ArrayNodes[0][1] = 20;
        ArrayNodes[0][2] = 5;

        ArrayNodes[1][0] = 2;
        ArrayNodes[1][1] = 15;
        ArrayNodes[1][2] = -1;

        ArrayNodes[2][0] = -1;
        ArrayNodes[2][1] = 3;
        ArrayNodes[2][2] = 3;

        ArrayNodes[3][0] = -1;
        ArrayNodes[3][1] = 9;
        ArrayNodes[3][2] = 4;

        ArrayNodes[4][0] = -1;
        ArrayNodes[4][1] = 10;
        ArrayNodes[4][2] = -1;

        ArrayNodes[5][0] = -1;
        ArrayNodes[5][1] = 58;
        ArrayNodes[5][2] = -1;

        ArrayNodes[6][0] = -1;
        ArrayNodes[6][1] = -1;
        ArrayNodes[6][2] = -1;

        int result = SearchValue(RootPointer, 15);
        if(result == -1) {
            System.out.println("The value had not been found");
        } else {
            System.out.println("Index of the searched value:");
            System.out.println(result);
            System.out.println();
        }
        PostOrder(result);

    }

    public static int SearchValue(int Root, int ValueToFind) {
        if(Root == -1) {
            return -1;
        }
        if (ArrayNodes[Root][1] == -1) {
            return -1;
        }
        if (ArrayNodes[Root][1] > ValueToFind) {
            return SearchValue(ArrayNodes[Root][0], ValueToFind);
        }
        if (ArrayNodes[Root][1] < ValueToFind) {
            return SearchValue(ArrayNodes[Root][2], ValueToFind);
        }
        return Root;
    }

    public static void PostOrder(int root) {
        if (root != -1) {
            if (ArrayNodes[root][0] != -1) {
                if (ArrayNodes[ArrayNodes[root][0]][1] != -1) {
                    PostOrder(ArrayNodes[root][0]);
                }
            }
            if (ArrayNodes[root][2] != -1) {
                if (ArrayNodes[ArrayNodes[root][2]][1] != -1) {
                    PostOrder(ArrayNodes[root][2]);
                }
            }
        }
        System.out.println(ArrayNodes[root][1]);
    }

}
