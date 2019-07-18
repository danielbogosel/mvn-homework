package ro.itschool.mvnbase.tema13.ex1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadOneLine readOneLine = new ReadOneLine("src/main/resources/readline.in");
        System.out.println(readOneLine.toString());
    }
}
