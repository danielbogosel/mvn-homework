package ro.itschool.mvnbase.tema14;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CountryReader cr = new CountryReader("src/main/resources/countries.txt");
        System.out.println(cr.getCountryList());

        CountryStatistisc countryStatistisc = new CountryStatistisc(cr.getCountryList());
        System.out.println(countryStatistisc.getAllCountriesName());
        System.out.println(countryStatistisc.getCountriesStartingWithLetter("U"));
        System.out.println(countryStatistisc.getCountryCapital("Romania"));
        System.out.println(countryStatistisc.getPopulation("Holy See"));
        System.out.println(countryStatistisc.getArea("Belgium"));
        System.out.println(countryStatistisc.getLargestCountry());
        System.out.println(countryStatistisc.getMostPeopleCountry());
        System.out.println(countryStatistisc.getMostDenseCountry());

        CountryPrinter printer = new CountryPrinter("src/main/resources/countries.out");
        for (Country country:cr.getCountryList()){
            printer.write(country);
        }


    }

}
