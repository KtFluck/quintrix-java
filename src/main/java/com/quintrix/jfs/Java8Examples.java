package com.quintrix.jfs;

import java.util.ArrayList;
import java.util.List;

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

    // stream filters names with a, maps to upper case
    // memberNames.stream().filter((s) ->
    // s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);

    // stream sorts names by alphabet and maps to upper case
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

    //
    long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();

    System.out.println(totalMatched);

  }

}
