package org.example.oct202242Done;

public class Paper3q1 {

    static int[][] Jobs = new int[100][2];
    static int NumberOfJobs;

    public static void main(String[] args) {
        Initialise();
        AddJob(12, 10);
        AddJob(526, 9);
        AddJob(33, 8);
        AddJob(12, 9);
        AddJob(78, 1);

        InsertionSort();
        PrintArray();
    }

    public static void Initialise() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 100; j++) {
                Jobs[j][i] = -1;
            }
        }
        NumberOfJobs = 0;
    }

    public static void AddJob(int jobNumber, int priority) {
        boolean isAdded = false;
        for (int i = 0; i < 100; i++) {
            if (Jobs[i][0] == -1) {
                Jobs[i][0] = jobNumber;
                Jobs[i][1] = priority;
                isAdded = true;
                break;
            }
        }
        if (isAdded) {
            System.out.println("Added");
        } else {
            System.out.println("Not added");
        }
    }

    public static void InsertionSort() {
        int tempJobNumber;
        int tempPriority;
        int counter;
        for (int i = 1; i < 100; i++) {
            counter = i;
                while (Jobs[counter - 1][1] > Jobs[counter][1]) {
                    tempJobNumber = Jobs[counter][0];
                    tempPriority = Jobs[counter][1];
                    Jobs[counter][0] = Jobs[counter - 1][0];
                    Jobs[counter][1] = Jobs[counter - 1][1];
                    Jobs[counter - 1][0] = tempJobNumber;
                    Jobs[counter - 1][1] = tempPriority;
                    counter--;
                    if (counter == 100 || counter == 0) {
                        break;
                    }
                }
        }
    }

    public static void PrintArray() {
        for (int i = 0; i < 100; i++) {
            if (Jobs[i][0] != -1 && Jobs[i][1] != -1) {
                System.out.println(Jobs[i][0] + " priority " + Jobs[i][1]);
            }
        }
    }
}

/*
public class Paper3q1 {
    int[][] Jobs = new int[100][2];
    int NumberOfJobs;

    public static void main(String[] args) {
        Paper3q1 program = new Paper3q1();
        program.Initialise();
        program.AddJob(10, 12);
        program.AddJob(13, 526);
        program.AddJob(5, 33);
        program.AddJob(9, 12);
        program.AddJob(93, 78);
        program.AddJob(4, 78);
        program.AddJob(4, 78);
        program.AddJob(4, 78);
        program.AddJob(100, 78);
        program.AddJob(8, 78);
        program.AddJob(5, 78);
        program.AddJob(98, 78);
        program.AddJob(45, 78);



        program.InsertionSort();
        program.PrintArray();
    }

    public void Initialise() {
        for (int i = 0; i < Jobs.length; i++) {
            Jobs[i][0] = -1;
        }
        for (int i = 0; i < Jobs.length; i++) {
            Jobs[i][1] = -1;
        }
        NumberOfJobs = 0;
    }

    public void AddJob(int priority, int jobNumber) {
        String message = "Not added";
        for (int i = 0; i < Jobs.length; i++) {
            if (Jobs[i][0] == -1 && Jobs[i][1] == -1) {
                Jobs[i][0] = jobNumber;
                Jobs[i][1] = priority;
                message = "Added";
                break;
            }
        }
        System.out.println(message);
    }

    public void InsertionSort() {
        int temporaryStorage1;
        int temporaryStorage0;
        int index = 1;
        int counter = 0;
        while (true) {

                while (Jobs[index][1] < Jobs[index - 1][1] && Jobs[index][1] != -1 && Jobs[index][0] != -1) {
                    temporaryStorage1 = Jobs[index - 1][1];
                    temporaryStorage0 = Jobs[index - 1][0];
                    Jobs[index - 1][1] = Jobs[index][1];
                    Jobs[index - 1][0] = Jobs[index][0];
                    Jobs[index][1] = temporaryStorage1;
                    Jobs[index][0] = temporaryStorage0;
                    index = index - 1;
                    if (index > Jobs.length - 1 || index <= 0) {
                        break;
                    }
                }

            index = 1;
            //if (Jobs[index][1] >= Jobs[index - 1][1]) {
                counter = counter + 1;
                index = 1 + counter;
            //}
            if (index > Jobs.length - 1 || index <= 0) {
                break;
            }
        }
    }

    public void PrintArray() {

        for (int i = 0; i < Jobs.length; i++) {
            if (Jobs[i][0] == -1 || Jobs[i][1] == -1) {
                break;
            }
            System.out.println(Jobs[i][0] + " priority "  + Jobs[i][1]);
        }
    }
}
*/