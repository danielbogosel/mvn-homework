package ro.itschool.mvnbase.tema16;

import java.util.Scanner;

public class BirthAgeCalculatorMain {
    public static void main(String[] args) throws NotValideAgeException {
        Scanner scanner = new Scanner(System.in);
        BirthYearCalculator birthYearCalculator = new BirthYearCalculator();


        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        while (age < 0) {
            try {

                throw new NotValideAgeException();
            } catch (NotValideAgeException ex) {
                System.out.println("Age " + age + " is not  valide ");
                System.out.print("Please enter your age: ");
                age = scanner.nextInt();
            }
            birthYearCalculator.calculateYearOfBirth(age);
        }
    }

}
