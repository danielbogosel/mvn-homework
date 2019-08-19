package ro.itschool.mvnbase.tema21.exercice1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;


public class Person {
    private final String name;
    private final int age;
    private final String city;
    private boolean hasCar;

    public Person(String name, int age, String city, boolean hasCar) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.hasCar = hasCar;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public boolean isHasCar() {
        return hasCar;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                hasCar == person.hasCar &&
                Objects.equals(name, person.name) &&
                Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, city, hasCar);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", hasCar=" + hasCar +
                '}' + '\n';
    }
}
