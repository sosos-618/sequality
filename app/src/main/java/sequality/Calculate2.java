package sequality;

public class Calculate2 {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (double) (x + y / 2);
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
    return (double) (sum / (y - x + 1));
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

  public static void main(String[] args) {
    int a = 2;
    int b = 3;
    int start = 1;
    int end = 10;
    Calculate2 calc2 = new Calculate2();

    System.out.println(new App().getGreeting());
    System.out.println(a + " + " + b + " = " + calc2.sum(a, b) + ". average = " + calc2.average(a, b) + ".");
    System.out.println("(" + start + "-" + end + ")! = " + calc2.factorial(start, end) + ". " + "average = "
        + calc2.fac_ave(start, end) + ".");
    System.out.println("odd total from " + start + " to " + end + " = " + calc2.odd(start, end) + ". " + "even total = "
        + calc2.even(start, end) + ".");
  }
}
