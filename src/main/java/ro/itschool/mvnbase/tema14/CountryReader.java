package ro.itschool.mvnbase.tema14;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryReader {
    private final List<Country> countryList;

    public CountryReader(String path) throws IOException {
        this.countryList = fetchList(path);
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    private List<Country> fetchList(String path) throws IOException {
        List<Country> result = new ArrayList<>();
        Scanner scDoc = new Scanner(new FileInputStream(path));

        while ((scDoc.hasNext()) || (scDoc.hasNextInt()) || (scDoc.hasNextLong())) {
            String[] splitString = scDoc.nextLine().split("\\|");
            result.add(new Country(splitString[0],
                    splitString[1],
                    Long.parseLong(splitString[2]),
                    Integer.parseInt(splitString[3]),
                    "n/a"
            ));

        }
        return result;
    }
}
