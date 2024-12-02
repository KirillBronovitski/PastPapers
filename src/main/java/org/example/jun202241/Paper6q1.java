package org.example.jun202241;

import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;

public class Paper6q1 {

    Player[] playersArray = new Player[11];

    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        String nameEntry = "";
        int scoreEntry = -1;
        Paper6q1 program = new Paper6q1();
        program.ReadHighScores();
        program.OutputHighScores();
        while (true) {
            System.out.println("Please enter the three-characters long player's name:");
            nameEntry = console.nextLine();
            if (nameEntry.length() == 3) {
                break;
            } else {
                System.out.println("The name entered is not three-characters long.");
            }
        }
        while (true) {
            System.out.println("Please enter the score of the player that is in the range 1 and 10000 inclusive:");
            scoreEntry = console.nextInt();
            if (!(scoreEntry < 1) && !(scoreEntry > 10000)) {
                break;
            } else {
                System.out.println("The score entered is not in the given range.");
            }
        }
        program.createNewTop(nameEntry, scoreEntry);

        /*String playerLine;
        Scanner console = new Scanner(System.in);
        String newPlayerName;
        int newPlayerScore;
        while (true) {
            System.out.println("Enter the three-characters long player name if new player is required to be added to the top:");
            newPlayerName = console.nextLine();
            if (newPlayerName.length() == 3) {
                System.out.println("Enter the player's score:");
                newPlayerScore = console.nextInt();
                break;
            } else {
                System.out.println("The name entered is not three-characters long.");
            }
        }
        boolean newPlayerEntered = false;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/HighScore.txt"))) {
            String content = Files.readString(Path.of("C:/dev/NewHighScore.txt"));
            while (fileReader.hasNextLine()) {
                playerLine = fileReader.nextLine();
                content += playerLine;
                try {
                    if (Integer.parseInt(playerLine.substring(4)) < newPlayerScore && !newPlayerEntered) {
                        Files.writeString(Paths.get("C:/dev/NewHighScore.txt"), newPlayerName + " " + newPlayerScore);
                        newPlayerEntered = true;
                    } else {
                        Files.writeString(Paths.get("C:/dev/NewHighScore.txt"), playerLine);
                    }
                } catch (NumberFormatException ignored) {
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
         */
    }

    public void ReadHighScores() throws IOException {
        int arrayIndex = 0;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/HighScore.txt"))) {
            while (fileReader.hasNextLine()) {
                String playerLine = fileReader.nextLine();
                String playerName = playerLine.substring(0, 3);
                try {
                    int playerScore = Integer.parseInt(playerLine.substring(4));
                    Player currentPlayer = new Player(playerName, playerScore);
                    playersArray[arrayIndex] = currentPlayer;
                    arrayIndex++;
                } catch (NumberFormatException ignored) {
                }

            }
            Player lastPlayer = new Player("", -1);
            playersArray[arrayIndex] = lastPlayer;

        }
    }

    public void OutputHighScores() {
        for (int i = 0; i < playersArray.length; i++) {
            if (playersArray[i].score != -1) {
                System.out.println(playersArray[i].name + " " + playersArray[i].score);
            }
        }
    }

    public void createNewTop(String playerName, int playerScore) {
        Player insertedPlayer = new Player(playerName, playerScore);
        Player temporaryStorage = new Player("", -1);
        for (int i = 0; i < playersArray.length; i++) {
            if (playersArray[i].score < playerScore) {
                temporaryStorage = playersArray[i];
                playersArray[i] = insertedPlayer;
                if (i != playersArray.length - 1) {
                    insertedPlayer = playersArray[i + 1];
                }
            }
        }
    }
}

/* for (int j = playersArray.length - 1; j > i; j--) {
                        temporaryStorage = playersArray[j];
                        playersArray[j] = playersArray[j - 1];
                    }


 */