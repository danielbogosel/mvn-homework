package ro.itschool.mvnbase.tema13;

import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        ExamResultReader examResult = new ExamResultReader("src/main/resources/results.in");
        System.out.println(examResult.getDocList());

       PersonFileReader p = new PersonFileReader("src/main/resources/results.in");
        System.out.println(p.getDocList());

    }
}
