package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest2 {
  @Test
  public void testSum() {

    int a = 2;
    int b = 3;
    int start = 1;
    int end = 10;

    Calculate2 calc2 = new Calculate2();
    int expected1 = 5;
    double expected2 = 2.5;
    int expected3 = 55;
    double expected4 = 5.5;
    int expected5 = 25;
    int expected6 = 30;

    assertEquals(expected1, calc2.sum(a, b));
    assertEquals(expected2, calc2.average(a, b), 0.0);
    assertEquals(expected3, calc2.factorial(start, end));
    assertEquals(expected4, calc2.fac_ave(start, end), 0.0);
    assertEquals(expected5, calc2.odd(start, end));
    assertEquals(expected6, calc2.even(start, end));
  }
}
