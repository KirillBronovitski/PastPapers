package org.example.Oct202342;

import java.time.LocalDate;

public class MagicCharacter extends Character {

    String Element;


    public MagicCharacter(String characterName, LocalDate dateOfBirth, double intelligence, int speed, String element) {
        super(characterName, dateOfBirth, intelligence, speed);
        Element = element;
    }

    public void Learn() {
        if (Element.equals("fire") || Element.equals("water")) {
            Intelligence = Intelligence + Intelligence * 0.2;
        } else if(Element.equals("earth")) {
            Intelligence = Intelligence + Intelligence * 0.3;
        } else {
            Intelligence = Intelligence + Intelligence * 0.1;
        }
    }
}
