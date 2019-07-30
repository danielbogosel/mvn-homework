package ro.itschool.mvnbase.tema15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryReader {
    private final List<Country> countries;

    public List<Country> getCountries() {
        return countries;
    }

    public CountryReader(String path) throws IOException {
        this.countries = fetchCountry(path);

    }

    private List<Country> fetchCountry(String path) throws IOException {
        List<Country> result = new ArrayList<>();
        List<String> border = new ArrayList<>();
        String line;
        String splitString[];
        String splitBorder[];
        BufferedReader breader = new BufferedReader(new FileReader(new File(path)));
        while ((line = breader.readLine()) != null) {
            splitString = line.split("\\|");

            if (splitString.length > 5) {
                splitBorder = splitString[5].split("~");
                for (String sBorder : splitBorder) {
                    border.add(sBorder);
                }


                result.add(new Country(splitString[0],
                        splitString[1],
                        Long.parseLong(splitString[2]),
                        Integer.parseInt(splitString[3]),
                        splitString[4],
                        border)
                );


            }
        }

        return result;
    }
}



