package ro.itschool.mvnbase.tema21.exercice1;

import java.util.stream.Collectors;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("Matt", 23, "NY", true),
                new Person("Deborah", 19, "Los Angeles", false),
                new Person("Joseph", 15, "Boston", false),
                new Person("Alex", 33, "Detroit", true),
                new Person("Arron", 14, "NY", false)
        );

        final List<String> collectMajourPersonsName = persons.stream()
                .filter((person -> person.getAge() > 17))
                .map(person -> person.getName())
                .collect(Collectors.toList());
        collectMajourPersonsName.forEach(name -> System.out.print(name + " "));
        System.out.println("\n");

        final List<String> collectFormatedData = persons.stream()
                .map(person -> "<" + person.getName() + ">:<" + person.getCity() + ">:<" + person.getAge() + ">")
                .collect(Collectors.toList());
        collectFormatedData.forEach(person -> System.out.println(person));
        System.out.println("");

        final List<Person> personsNameWithA = persons.stream()
                .filter(person -> person.getName().startsWith("A"))
                .map(person -> new Person(person.getName(), person.getAge(), person.getCity(), person.isHasCar()))
                .collect(Collectors.toList());
        personsNameWithA.forEach(name -> System.out.println(name));

        final List<String> collectPersonsWithCar = persons.stream()
                .filter(person -> person.isHasCar())
                .map(person -> person.getName())
                .collect(Collectors.toList());
        collectPersonsWithCar.forEach(person -> System.out.println(person));


    }
}