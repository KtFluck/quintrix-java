package com.quintrix.jfs;

public class TestFPImpl implements TestFP {

  @Override
  public String findCount(String a, int b) {
    return a + b;

  }

  // expression like this

  // public int findCount(String a, int b) {
  // int i = 5;
  // return i++;
  // }

  // Lambda becomes this
  // (a, b) -> return i++;

}
