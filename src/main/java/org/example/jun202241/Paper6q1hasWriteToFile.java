package org.example.jun202241;

import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;
public class Paper6q1hasWriteToFile {

    static Player[] arrayPlayers = new Player[11];

    public static void main(String[] args) throws IOException {
        for(int i = 0; i < arrayPlayers.length; i++) {
            arrayPlayers[i] = new Player();
            arrayPlayers[i].name = "";
            arrayPlayers[i].score = -1;

        }

        ReadHighScores();
        OutputHighScores();
        Scanner console = new Scanner(System.in);
        String nameEntry = "";
        int scoreEntry = -1;
        while (nameEntry.length() != 3) {
            System.out.println("Enter the name of the player consisting of 3 characters:");
            nameEntry = console.nextLine();
        }
        while (scoreEntry < 0 || scoreEntry > 100000) {
            System.out.println("Enter the score of the player in range 0-100000 inclusive:");
            scoreEntry = Integer.parseInt(console.nextLine());
        }
        createNewTop(nameEntry, scoreEntry);
        OutputHighScores();
        WriteTopTen();
    }

    public static void ReadHighScores() throws IOException {
        String name;
        int score;
        int index = 0;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/HighScore.txt"))) {
            while (fileReader.hasNextLine()) {
                name = fileReader.next();
                score = Integer.parseInt(fileReader.next());
                Player insertPlayer = new Player();
                insertPlayer.name = name;
                insertPlayer.score = score;
                arrayPlayers[index] = insertPlayer;
                index++;
            }
        } catch (IOException e) {
            System.out.println("The source file had not been found or does not exist");
        }
    }

    public static void OutputHighScores() {
        for (int i = 0; i < arrayPlayers.length - 1; i++) {
            if (arrayPlayers[i] != null) {
                System.out.println(arrayPlayers[i].name + " " + arrayPlayers[i].score);
            }
        }
    }

    public static void createNewTop(String name, int score) {
        int tempScore;
        String tempName;
        int index = 0;
        arrayPlayers[arrayPlayers.length - 1].name = name;
        arrayPlayers[arrayPlayers.length - 1].score = score;
        while (index < arrayPlayers.length - 1) {
            if (arrayPlayers[arrayPlayers.length - 1 - index].score > arrayPlayers[arrayPlayers.length - 2 - index].score) {
                tempScore = arrayPlayers[arrayPlayers.length - 1 - index].score;
                tempName = arrayPlayers[arrayPlayers.length - 1 - index].name;
                arrayPlayers[arrayPlayers.length - 1 - index].score = arrayPlayers[arrayPlayers.length - 2 - index].score;
                arrayPlayers[arrayPlayers.length - 1 - index].name = arrayPlayers[arrayPlayers.length - 2 - index].name;
                arrayPlayers[arrayPlayers.length - 2 - index].score = tempScore;
                arrayPlayers[arrayPlayers.length - 2 - index].name = tempName;
                index++;
            } else {
                break;
            }
        }
    }

    public static void WriteTopTen() throws IOException {
        try {
            Path newFilePath = Paths.get("C:/dev/NewHighScore.txt");
            Files.writeString(newFilePath, "");
            for (int i = 0; i < arrayPlayers.length - 1; i++) {
                Files.writeString(newFilePath, arrayPlayers[i].name + " " + arrayPlayers[i].score + System.lineSeparator(), StandardOpenOption.APPEND);

            }
        } catch (IOException e) {
            System.out.println("The file to be written to had not been found or does not exist");
        }


    }

}