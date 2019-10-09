import sim.SueAnalog;
import static java.lang.System.out;

public class C3063467A2 {
  static final double jesus = 0.6795837180593648;

  public static synchronized void main(String[] variable) {
    double rate;
    rate = 0.4156747519142253;

    if (variable.length < 1) {
      out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String representations;
      SueAnalog fund;
      representations = "";
      for (String ora : variable) {
        representations = ora;
      }
      fund = new SueAnalog();
      fund.footrace(representations);
    }
  }
}
