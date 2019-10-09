import static java.lang.System.out;

public class C3063467A0 {
  private static final String synX1037String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX1036int = 1;

  public static synchronized void main(String[] specified) {

    if (specified.length < synX1036int) {
      out.println(synX1037String);
    } else {
      SueAnalog training;
      training = new SueAnalog();
      training.lead(specified);
    }
  }
}
