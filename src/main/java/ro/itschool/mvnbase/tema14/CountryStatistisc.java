package ro.itschool.mvnbase.tema14;

import java.util.ArrayList;
import java.util.List;

public class CountryStatistisc {
    private final List<Country> statisticsList;

    public CountryStatistisc(List<Country> statisticsList) {
        this.statisticsList = new ArrayList(statisticsList);
    }

    public List<Country> getStatisticsList() {
        return statisticsList;
    }

    public String getAllCountries() {
        for (Country country : statisticsList) {

            return country.getName();
        }

        return null;
    }
}
