package ro.itschool.mvnbase.tema22.excercice1;

import java.util.List;

public class MainLambda {
    public static void main(String[] args) {
        List<Vacation> vacations = List.of(new Vacation("Hawaii", 2000, 4),
                new Vacation("Hawaii", 1000, 2),
                new Vacation("Malta", 1500, 5),
                new Vacation("Israel", 3000, 8),
                new Vacation("Israel", 1700, 3),
                new Vacation("Malta", 800, 2),
                new Vacation("Hawaii", 1500, 3)
        );
        VacationService vacationService = new VacationService(vacations);
        System.out.println(vacationService.countVacations());
        System.out.println(vacationService.countVacationsLocation("Hawaii"));
        System.out.println(vacationService.getLocationOffert("Malta"));
        System.out.println();
        System.out.println(vacationService.getChippestVacation());
        System.out.println();
        System.out.println(vacationService.getChippestLocation("Israel"));
        System.out.println(vacationService.getSecondChippestOffert());
    }
}
