package ro.itschool.mvnbase.tema21.exercice1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class PersonService {
    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("Ana", 24, "Oradea", true),
                new Person("Mihai", 17, "Cluj", false),
                new Person("Diana", 33, "Timisoara", true),
                new Person("Andrei", 15, "Oradea", false),
                new Person("Bucurel", 13, "Cluj", false));

        System.out.println(getPersonsName(persons, value -> value.getAge() > 17));
        System.out.println("");

        System.out.println(modifyList(persons, value -> value.getName().startsWith("A")));
        System.out.println(modifyList(persons, value -> value.isHasCar()));

        List<String> allPerson = persons.stream()
                .map(person -> "<" + person.getName() + ">:<" + person.getCity() + ">:<" + person.getAge() + ">")
                .collect(Collectors.toList());
        allPerson.forEach(person -> System.out.println(person));

    }

    private static List<String> getPersonsName(List<Person> persons, PersonPredicate predicate) {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            if (predicate.apply(person)) {
                result.add(person.getName());
            }
        }

        return result;
    }


    private static List<Person> modifyList(List<Person> persons, PersonPredicate predicate) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (predicate.apply(person)) {
                result.add(person);
            }
        }
        return result;
    }


    @FunctionalInterface
    private interface PersonPredicate {
        boolean apply(Person value);
    }

}

