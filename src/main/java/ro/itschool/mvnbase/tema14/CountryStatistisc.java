package ro.itschool.mvnbase.tema14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CountryStatistisc {
    private final List<Country> statisticsList;

    public CountryStatistisc(List<Country> statisticsList) {
        this.statisticsList = new ArrayList(statisticsList);
    }

    public List<Country> getStatisticsList() {
        return statisticsList;
    }


    public List<String> getAllCountriesName() {
        List<String> countryList = new ArrayList<>();
        for (Country country : statisticsList) {
            countryList.add(country.getName());
        }
        return countryList;
    }

    public Country getCountriesStartingWithLetter(String letter) {
        String Countries="";
        for (Country country : getStatisticsList()) {
            if (country.getName().startsWith(letter)) {
                Countries+=country.getName()+" ";
            }

        }
        return Countries;
    }
    public String getCountryCapital(String countryName){

    }


}
