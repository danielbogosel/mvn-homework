package ro.itschool.mvnbase.tema14;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CountryReader cr = new CountryReader("src/main/resources/countries.txt");
        System.out.println(cr.getCountryList());

        CountryStatistisc countryStatistisc = new CountryStatistisc(cr.getCountryList());
        System.out.println(countryStatistisc.getAllCountries());

    }

}
