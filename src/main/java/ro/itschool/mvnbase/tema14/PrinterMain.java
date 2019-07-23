package ro.itschool.mvnbase.tema14;



import java.io.IOException;

public class PrinterMain {
    public static void main(String[] args)throws IOException {
        CountryPrinter cp = new CountryPrinter("src/main/resources/countries.out");
        cp.write(new Country("The country of "+));
    }
}
