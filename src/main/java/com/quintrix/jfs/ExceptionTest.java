package com.quintrix.jfs;

public class ExceptionTest {

  public static void main(String[] args) {

    String str = "abc";
    long num = 0;


    try {
      num = Long.parseLong(str);
    } catch (NumberFormatException e) {
      // TODO Auto-generated catch block
      System.out.println("Could not convert" + str);
    }

    System.out.println(num);

  }

}
