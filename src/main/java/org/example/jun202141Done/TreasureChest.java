package org.example.jun202141Done;

public class TreasureChest {
    private String question;
    private int answer;
    private int points;

    public TreasureChest (String Question,  int Answer, int Points) {
        question = Question;
        answer = Answer;
        points = Points;
    }

    public String getQuestion() {
        return question;
    }

    public boolean checkAnswer(int userAnswer) {
        if (userAnswer == answer) {
            return true;
        }
        return false;
    }

    public int getPoints(int numberOfAttempts) {
        if (numberOfAttempts == 1) {
            return points;
        }
        if (numberOfAttempts == 2) {
            return points / 2;
        }

        if (numberOfAttempts == 3 || numberOfAttempts == 4) {
            return points / 4;
        }
        return 0;
    }


}
