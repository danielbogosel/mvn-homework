package ro.itschool.mvnbase.tema16;


public class BirthYearCalculator {
    public void calculateYearOfBirth(int age) throws NotValideAgeException {

        if (age <= 0) {
            throw new NotValideAgeException();
        }
        int result = 0;
        result = 2019 - age;
        System.out.println("Your birth year is " + result);
    }
}
