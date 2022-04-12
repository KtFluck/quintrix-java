package com.quintrix.jfs;

import java.util.function.Predicate;

public class PredImpl implements Predicate<Integer> {

  @Override
  public boolean test(Integer d) {
    // TODO Auto-generated method stub
    return d > 10;
  }

}
