package com.github.danielcraignicholson.collections.streams_lambas;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    List<Person> people =
        List.of(
            new Person("Zara", 32, "London"),
            new Person("Bob", 28, "Manchester"),
            new Person("Charlie", 22, "London"),
            new Person("Diana", 19, "Bristol"),
            new Person("Eve", 40, "Leeds"));

    // 1. People older than 30
    people.stream().filter(person -> person.getAge() > 30).forEach(System.out::println);

    // 2. People in London
    List<Person> londonPeople =
        people.stream()
            .filter(person -> person.getCity().equals("London"))
            .collect(Collectors.toList());
    System.out.println(londonPeople);

    // 3. Uppercase names sorted alphabetically
    List<String> names =
        people.stream()
            .map(person -> person.getName().toUpperCase())
            .sorted()
            .collect(Collectors.toList());
    System.out.println(names);

    // 4. Count under 25
    System.out.println(
        "People younger than 25: "
            + people.stream().filter(person -> person.getAge() < 25).count());

    // 5. Group people by city
    Map<String, List<Person>> peopleByCity =
        people.stream().collect(Collectors.groupingBy(Person::getCity));
    System.out.println(peopleByCity);

    // 6. Average age per city
    Map<String, Double> agePerCity =
        people.stream()
            .collect(
                Collectors.groupingBy(Person::getCity, Collectors.averagingInt(Person::getAge)));
    System.out.println(agePerCity);

    // 7. Names per city sorted alphabetically
    Map<String, List<String>> namesPerCity =
        people.stream()
            .collect(
                Collectors.groupingBy(
                    Person::getCity,
                    Collectors.mapping(
                        name -> name.getName().toUpperCase(),
                        Collectors.collectingAndThen(
                            Collectors.toList(),
                            list -> list.stream().sorted().collect(Collectors.toList())))));

    System.out.println(namesPerCity);

    // 8. Names of residents older than average age in their city
    List<String> olderThanAverage =
        people.stream()
            .filter(person -> person.getAge() > agePerCity.get(person.getCity()))
            .map(Person::getName)
            .collect(Collectors.toList());
    System.out.println("Residents older than average in their city: " + olderThanAverage);

    System.out.println(findNameStartingWith(names, 'D'));
    System.out.println(findNameStartingWith_Stream(names, 'C'));
  }

  public static Optional<String> findNameStartingWith(List<String> names, char letter) {

    for (String name : names) {
      if (name.startsWith(String.valueOf(letter))) {
        return Optional.of(name);
      }
    }
    return Optional.empty();
  }

  public static Optional<String> findNameStartingWith_Stream(List<String> names, char letter) {
    return names.stream().filter(name -> name.startsWith(String.valueOf(letter))).findFirst();
  }
}
