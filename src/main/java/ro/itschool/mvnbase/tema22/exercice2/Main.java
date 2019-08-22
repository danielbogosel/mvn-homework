package ro.itschool.mvnbase.tema22.exercice2;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        List<MMAFighter> fighters = List.of(new MMAFighter("Conor McGregor", 98, 33),
                new MMAFighter("The Spider", 45, 40),
                new MMAFighter("Bones", 66, 20),
                new MMAFighter("Junior", 89, 37),
                new MMAFighter("Crop Crop", 90, 39),
                new MMAFighter("The Dominator", 56, 35)

        );
        MMAFighter reducefighters = fighters.stream()
                .reduce((mmaFighter, mmaFighter2) -> fight(mmaFighter, mmaFighter2))
                .orElse(null);
        System.out.println(reducefighters);


    }

    private static MMAFighter fight(MMAFighter fighter1, MMAFighter fighter2) {
        if (fighter1.getStamina() > fighter2.getStamina()) {
            return fighter1;
        }
        if (fighter1.getStamina() < fighter2.getStamina()) {
            return fighter2;
        }
        if (fighter1.getStamina() == fighter2.getStamina()) {
            equalsStamina(fighter1, fighter2);
        }

        return null;
    }

    private static MMAFighter equalsStamina(MMAFighter fighter1, MMAFighter fighter2) {
        if (fighter1.getFightskill() > fighter2.getFightskill()) {
            return fighter1;
        }
        if (fighter1.getFightskill() < fighter2.getFightskill()) {
            return fighter2;
        }
        return null;
    }
}
