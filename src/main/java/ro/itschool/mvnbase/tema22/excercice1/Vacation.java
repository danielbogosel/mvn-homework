package ro.itschool.mvnbase.tema22.excercice1;

import java.util.Objects;

public class Vacation {
    private final String location;
    private final int price;
    private final int duration;

    public Vacation(String location, int price, int duration) {
        this.location = location;
        this.price = price;
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public int getPrice() {
        return price;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vacation vacantion = (Vacation) o;
        return price == vacantion.price &&
                duration == vacantion.duration &&
                Objects.equals(location, vacantion.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, price, duration);
    }

    @Override
    public String toString() {
        return "Vacantion{" +
                "location='" + location + '\'' +
                ", price=" + price +
                ", duration=" + duration + '\n' +
                '}';
    }
}
