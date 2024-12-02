package org.example.jun202141Done;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;


public class Paper8q3 {
    private static TreasureChest[] arrayTreasure = new TreasureChest[5];
    public static void main(String[] args) throws IOException {

        readData();
        Scanner console = new Scanner(System.in);
        int questionNumber = 0;
        while (!(questionNumber > 0 && questionNumber < 6)) {
            System.out.println("Enter the number of question (between 1 and 5):");
            questionNumber = Integer.parseInt(console.nextLine());
        }
        System.out.println(arrayTreasure[questionNumber - 1].getQuestion());
        int userAnswer = Integer.parseInt(console.nextLine());
        int AttemptsNumber = 1;
        while (!arrayTreasure[questionNumber - 1].checkAnswer(userAnswer)) {
            AttemptsNumber++;
            userAnswer = Integer.parseInt(console.nextLine());
        }
        System.out.println(arrayTreasure[questionNumber - 1].getPoints(AttemptsNumber));
    }


    public static void readData() {
        String question;
        int answer;
        int points;

        int index = 0;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/TreasureChestData.txt"))) {
            while (fileReader.hasNextLine()) {
                question = fileReader.nextLine();
                answer = Integer.parseInt(fileReader.nextLine());
                points = Integer.parseInt(fileReader.nextLine());
                arrayTreasure[index] = new TreasureChest(question, answer, points);
                index++;
            }
        } catch  (IOException e) {
            System.out.println("The file had not been found.");
        }

    }
}
