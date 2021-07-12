package sequality;

public class Calculate2 {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (double) (x + y) / 2;
  }

  public int factorial(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
    }
    return sum;
  }

  public double fac_ave(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
    }
    return (double) sum / (y - x + 1);
  }

  public int odd(int x, int y) {
    int osum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 1) {
        osum += i;
      }
    }
    return osum;
  }

  public int even(int x, int y) {
    int esum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        esum += i;
      }
    }
    return esum;
  }
}
