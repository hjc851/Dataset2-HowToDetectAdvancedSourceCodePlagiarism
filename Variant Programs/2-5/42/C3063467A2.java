import analog.ActMock;
import static java.lang.System.out;

public class C3063467A2 {
  private static final String synX2882String = "";
  private static final String synX2881String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX2880int = 1;

  public static synchronized void main(String[] arguments) {

    if (arguments.length < synX2880int) synx580();
    else synx581(arguments);
  }

  private static synchronized void synx580() {
    out.println(synX2881String);
  }

  private static synchronized void synx581(String[] arguments) {
    java.lang.String component = synX2882String;
    for (java.lang.String fh : arguments) {
      component = (fh);
    }
    analog.ActMock activities = new analog.ActMock();
    activities.tally(component);
  }
}
