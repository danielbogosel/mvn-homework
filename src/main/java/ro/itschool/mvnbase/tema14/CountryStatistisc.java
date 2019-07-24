package ro.itschool.mvnbase.tema14;

import java.util.ArrayList;
import java.util.List;


public class CountryStatistisc {
    private final List<Country> countries;

    public CountryStatistisc(List<Country> statisticsList) {
        this.countries = new ArrayList(statisticsList);
    }

    public List<Country> getCountries() {
        return countries;
    }


    public List<String> getAllCountriesName() {
        List<String> countryList = new ArrayList<>();
        for (Country country : countries) {
            countryList.add(country.getName());
        }
        return countryList;
    }

    public Country getCountriesStartingWithLetter(String letter) {
        for (Country country : getCountries()) {
            if (country.getName().startsWith(letter)) {
                return country;
            }

        }
        return null;
    }

    public String getCountryCapital(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return country.getCapital();
            }
        }

        return countryName;
    }

    public long getPopulation(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return country.getPopulation();
            }
        }
        return 0;
    }

    public long getArea(String countryName) {
        for (Country country : countries)
            if (country.getName().equals(countryName)) {
                return country.getArea();
            }
        return 0;
    }

    public Country getLargestCountry() {
        int largestCountryArea = 0;
        Country largestConntry = null;

        for (Country country : countries) {
            if (largestCountryArea < country.getArea()) {
                largestCountryArea = country.getArea();
                largestConntry = country;
            }
        }
        return largestConntry;
    }

    public Country getMostPeopleCountry() {
        long biggestPopulationCountry=0;
        Country mostPopulatedCountry = null;
        for (Country country : countries) {
            if (biggestPopulationCountry < country.getPopulation()) {
                biggestPopulationCountry = country.getPopulation();
                mostPopulatedCountry=country;
            }
        }
        return mostPopulatedCountry;
    }

    public Country getMostDenseCountry(){

        double currentDensity;
        double density=-1;

        Country mostDenseCountry=null;
        for (Country country:countries){
            currentDensity=country.getArea()/country.getPopulation();
            if(density<currentDensity){
                density=currentDensity;
                mostDenseCountry=country;

            }

        }
        return mostDenseCountry;
    }


}
