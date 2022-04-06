package com.quintrix.jfs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class HelloWorld {

  public static void main(String[] args) throws Exception {

    String str = "Hello World!";
    BufferedWriter writer = new BufferedWriter(new FileWriter(
        "/Users/katiefluck/Desktop/Quintrix Training - Full stack java/Hello World"));
    writer.write(str);
    writer.close();

    File file =
        new File("/Users/katiefluck/Desktop/Quintrix Training - Full stack java/Hello World");
    Scanner sc = new Scanner(file);

    while (sc.hasNextLine()) {
      System.out.println(sc.nextLine());
    }

  }
}
