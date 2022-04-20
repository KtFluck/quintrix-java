package com.quintrix.jfs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Examples {

  public static void main(String[] args) {
    List<String> memberNames = new ArrayList<>();
    memberNames.add("Amitabh");
    memberNames.add("Shekhar");
    memberNames.add("Aman");
    memberNames.add("Rahul");
    memberNames.add("Shahrukh");
    memberNames.add("Salman");
    memberNames.add("Yana");
    memberNames.add("Lokesh");

    // Intermediate Operations: stream filters names with a, maps to upper case
    // memberNames.stream().filter((s) ->
    // s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);

    // Intermediate Operations: stream sorts names by alphabet and maps to upper case
    // memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

    // terminal expression prints each name
    // memberNames.forEach(System.out::println);

    // terminal expression checks if any, all or non of the names start with A and returns T/F
    boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));

    System.out.println(matchedResult); // true

    matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));

    System.out.println(matchedResult); // false

    matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));

    System.out.println(matchedResult); // false

    // terminal expression return total of names starting with A
    long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();

    System.out.println(totalMatched);


    // Intermediate Operations: distinct elements are printed with forEach. only first of a
    // duplicate is preserved
    Stream fruitsStream = Stream.of("Apple", "Jack Fruit", "Water Melon", "Apple");
    Stream distinctStream = fruitsStream.distinct();
    distinctStream.forEach(name -> System.out.println(name));

    // Intermediate Operations: peek (as in sneak peek) returns elements filter, mapped to uppercase
    // and collected in a list
    Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
        .peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
        .peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());

    // Intermediate Operations: limit returns elements up to 2 and prints them only
    Stream.of("one", "two", "three", "four").limit(2).forEach(item -> System.out.println(item));

    // terminal expression checks if list has Hill and returns T/F
    List<String> listPersons = new ArrayList<>();
    listPersons.add("Hill");
    listPersons.add("Smith");
    listPersons.add("Jones");
    boolean noHill = listPersons.stream().noneMatch(p -> p.equals("Hill"));
    System.out.println("No one comes from Hill family? " + noHill);


    // terminal expression compares elements in array list and returns min number
    List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
    Optional<Integer> minNumber = list.stream().min((i, j) -> i.compareTo(j));
    System.out.println(minNumber.get());

    // terminal expression reduces int in array to a sum
    int[] numbers = {123, 456, 789, 246, 135, 802, 791};
    int sum = Arrays.stream(numbers).reduce(0, (x, y) -> (x + y));
    System.out.println("sum = " + sum);



    System.out.println(LocalDate.now());

  }

}
