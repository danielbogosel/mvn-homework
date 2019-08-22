package ro.itschool.mvnbase.tema22.exercice2;

import java.util.Objects;

public class MMAFighter {
    private final String name;
    private final int stamina;
    private final int fightskill;

    public MMAFighter(String name, int stamina, int fightskill) {
        this.name = name;
        this.stamina = stamina;
        this.fightskill = fightskill;
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    public int getFightskill() {
        return fightskill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MMAFighter that = (MMAFighter) o;
        return stamina == that.stamina &&
                fightskill == that.fightskill &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stamina, fightskill);
    }

    @Override
    public String toString() {
        return "MMAFighter{" +
                "name='" + name + '\'' +
                ", stamina=" + stamina +
                ", fightskill=" + fightskill +
                '}';
    }
}
