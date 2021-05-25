package com.ss.jb.four;

import static org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LineTest {
  /*
   * Assignment 4 Create unit tests for the Line Class (see video).
   * 
   * Create a file called LineTest.java. Create tests for the getSlope,
   * getDistance, and parallelTo methods. Because of rounding errors, it is bad
   * practice to test double values for exact equality. To get around this, you
   * can pass a small value (such as .0001) to assertEquals to be used as a delta.
   */
  private Line ln = new Line();

  public void getSlopeTest() {
    assertEquals(ln.getSlope(2.2));
    assertNotEquals();
  }

  @Test
  public void getDistanceTest() {

  }

  public void parallelToTest() {

  }

}
