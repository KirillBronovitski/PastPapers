package org.example.oct202242;

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
