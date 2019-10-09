import static java.lang.System.out;

public class C3063467A0 {
  private static final String synX1477String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX1476int = 1;

  public static synchronized void main(String[] param) {

    if (param.length < synX1476int) {
      out.println(synX1477String);
    } else {
      PhaseSimulations system = new PhaseSimulations();
      system.extend(param);
    }
  }
}
