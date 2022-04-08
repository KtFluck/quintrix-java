package com.quintrix.jfs;

public class ExceptionTest {

  public static void main(String[] args) {

    String str = "abc";
    long num = 0;


    try {
      // open file
      num = Long.parseLong(str);
    } catch (NumberFormatException e) {
      // TODO Auto-generated catch block
      // e.printStackTrace(); //default error message
      System.out.println("Could not convert" + str);

      throw new NumberFormatException(); // option
    } finally {
      // close file
    }

    System.out.println(num);

  }

}
