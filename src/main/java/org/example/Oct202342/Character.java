package org.example.Oct202342;

import java.time.LocalDate;

public class Character {

    protected String CharacterName;
    protected LocalDate DateOfBirth;
    protected double Intelligence;
    protected int Speed;

    public Character(String characterName, LocalDate dateOfBirth, double intelligence, int speed) {
        CharacterName = characterName;
        DateOfBirth = dateOfBirth;
        Intelligence = intelligence;
        Speed = speed;
    }

    public double GetIntelligence() {
        return Intelligence;
    }

    public String GetName() {
        return CharacterName;
    }

    public void SetIntelligence(double intelligence) {
        Intelligence = intelligence;
    }

    public void Learn() {
        Intelligence = Intelligence + Intelligence * 0.1;
    }

    public int ReturnAge() {
        int currentYear = 2023;
        return currentYear - DateOfBirth.getYear();
    }

}
