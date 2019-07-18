package ro.itschool.mvnbase.tema13;

import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        ExamResultReader examResult = new ExamResultReader("src/main/resources/results.in");
        System.out.println(examResult.toString());

        PersonFileReader p1 = new PersonFileReader("src/main/resources/person.in");
        System.out.println(p1.toString());
    }
}
