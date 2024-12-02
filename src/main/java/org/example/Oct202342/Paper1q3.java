package org.example.Oct202342;
import java.time.LocalDate;

public class Paper1q3 {

    public static void main(String[] args) {
        LocalDate RoyalBirthDay = LocalDate.of(2019, 12, 1);
        Character FirstCharacter = new Character("Royal", RoyalBirthDay, 70, 30);
        FirstCharacter.Learn();
        System.out.println("Royal:");
        System.out.println("Name: " + FirstCharacter.GetName() + "; age: " + FirstCharacter.ReturnAge() + "; intelligence: " + FirstCharacter.GetIntelligence());
        LocalDate LightBirthDay = LocalDate.of(2018, 3, 3);
        MagicCharacter FirstMagic = new MagicCharacter("Light", LightBirthDay, 75, 22, "fire");
        FirstMagic.Learn();
        System.out.println("Light:");
        System.out.println("Name: " + FirstMagic.GetName() + "; age: " + FirstMagic.ReturnAge() + "; intelligence: " + FirstMagic.GetIntelligence());

    }

}
