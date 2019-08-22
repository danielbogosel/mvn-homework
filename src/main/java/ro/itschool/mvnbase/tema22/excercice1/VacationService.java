package ro.itschool.mvnbase.tema22.excercice1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class VacationService {
    private final List<Vacation> vacations;

    public VacationService(List<Vacation> vacations) {
        this.vacations = vacations;
    }

    public List<Vacation> getVacations() {
        return vacations;
    }

    public long countVacations() {
        return vacations.stream()
                .count();
    }

    public long countVacationsLocation(String location) {
        return vacations.stream()
                .filter(vacation -> vacation.getLocation().equals(location))
                .count();
    }

    public List<Vacation> getLocationOffert(String location) {
        return vacations.stream()
                .filter(vacation -> vacation.getLocation().equals(location))
                .collect(Collectors.toList());
    }

    public Vacation getChippestVacation() {
        return vacations.stream()
                .sorted(Comparator.comparingInt(Vacation::getPrice))
                .findFirst()
                .orElse(null);
    }

    public Vacation getChippestLocation(String location) {
        return vacations.stream()
                .filter(vacation -> vacation.getLocation().equals(location))
                .sorted(Comparator.comparingInt(Vacation::getPrice))
                .findFirst()
                .orElse(null);
    }

    public Vacation getSecondChippestOffert() {
        return vacations.stream()
                .sorted(Comparator.comparingInt(Vacation::getPrice))
                .skip(1)
                .findFirst()
                .orElse(null);

    }
}


