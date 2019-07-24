package ro.itschool.mvnbase.tema14;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Country {
    private final String name;
    private final String capital;
    private final long population;
    private final int area;
    private final String region;

    public Country(@JsonProperty("name") String name,
                   @JsonProperty("capital") String capital,
                   @JsonProperty("population") long population,
                   @JsonProperty("area") int area,
                   @JsonProperty("region") String region) {

        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return population == country.population &&
                area == country.area &&
                Objects.equals(name, country.name) &&
                Objects.equals(capital, country.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capital, population, area);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", area=" + area +
                '}' + '\n';
    }
}
