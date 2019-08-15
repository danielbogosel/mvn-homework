package ro.itschool.mvnbase.tema21;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("Ana", 24, "Oradea", true),
                new Person("Mihai", 17, "Cluj", false),
                new Person("Diana", 33, "Timisoara", true),
                new Person("Andrei", 15, "Oradea", false),
                new Person("Bucurel", 13, "Cluj", false));

        System.out.println(getPersonsName(persons,value -> value.getAge()>17));
        System.out.println(modifyList(persons, value -> value.getName().startsWith("A")));
        System.out.println(modifyList(persons,value -> value.isHasCar()));

    }

    private static List<Person> modifyList(List<Person> persons, PersonFunction function) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (function.apply(person)) {
                result.add(person);
            }
        }
        return result;
    }

    private static List<String> getPersonsName(List<Person> persons, PersonFunction function) {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            if (function.apply(person)) {
                result.add(person.getName());
            }
        }
        return result;
    }


    @FunctionalInterface
    private interface PersonFunction {
        boolean apply(Person value);

    }
}

