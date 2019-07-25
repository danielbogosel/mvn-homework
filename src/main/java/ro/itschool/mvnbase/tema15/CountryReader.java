package ro.itschool.mvnbase.tema15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryReader {
    private final List<Country> countries;
    private final List<String> border = new ArrayList<>();


    public List<Country> getCountries() {
        return countries;
    }

    public CountryReader(String path) throws IOException {
        this.countries = fetchCountry(path);

    }

    private List<Country> fetchCountry(String path) throws IOException {
        List<Country> result = new ArrayList<>();
        String line;
        String splitString[] = null;
        String splitBorder[];
        BufferedReader breader = new BufferedReader(new FileReader(new File(path)));
        while ((line = breader.readLine()) != null) {
            splitString = line.split("\\|");

            if (splitString[5].length() != 0) {
                splitBorder = splitString[5].split("~");
                border.add(String.valueOf(splitBorder));
            } else
                border.isEmpty();
        }
        result.add(new Country(splitString[0],
                splitString[1],
                Long.parseLong(splitString[2]),
                Integer.parseInt(splitString[3]),
                splitString[4],
                List.of(splitString[5]))
        );


        return result;
    }
}


