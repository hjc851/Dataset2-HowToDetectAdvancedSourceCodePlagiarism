import static java.lang.System.out;

public class C3063467A0 {
  public static final double trammel = 0.3190852167720919;

  public static synchronized void main(String[] using) {
    double peak = 0.1742591904724825;

    if (using.length < 1) {
      out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      OperationSimulated fund = new OperationSimulated();
      fund.tally(using);
    }
  }
}
