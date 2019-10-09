import kinematics.SystemSim;
import static java.lang.System.out;

public class C3063467A2 {
  public static int symbol = -1473186022;

  public static synchronized void main(String[] arguments) {
    double destined = 0.04893611574791279;

    if (arguments.length < 1) synx520();
    else synx521(arguments);
  }

  private static synchronized void synx520() {
    out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx521(String[] arguments) {
    java.lang.String comments = "";
    for (java.lang.String fh : arguments) {
      comments = fh;
    }
    kinematics.SystemSim strategy = new kinematics.SystemSim();
    strategy.pass(comments);
  }
}
