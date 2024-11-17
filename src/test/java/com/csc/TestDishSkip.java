package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDishSkip {

  DishSkip skip;

  @BeforeEach
  void setUp() {
    skip = new DishSkip();
  }

  // Put your tests here!

  @Test
  void itWorks() {
    assertEquals(true, true);
  }

}
