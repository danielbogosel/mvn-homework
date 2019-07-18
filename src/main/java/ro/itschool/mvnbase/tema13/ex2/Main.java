package ro.itschool.mvnbase.tema13.ex2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    ReadAndPrint readAndPrint =new ReadAndPrint("src/main/resources/readline.in");
        System.out.println(readAndPrint.toString());
    }
}
