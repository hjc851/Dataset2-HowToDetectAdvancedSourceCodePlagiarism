import analogue.OperationSimulated;
import static java.lang.System.out;

public class C3063467A2 {

  public static synchronized void main(String[] arguments) {

    if (arguments.length < 1) synx340();
    else synx341(arguments);
  }

  private static synchronized void synx340() {
    out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx341(String[] arguments) {
    java.lang.String contributions = "";
    for (java.lang.String fh : arguments) {
      contributions = fh;
    }
    analogue.OperationSimulated platform = new analogue.OperationSimulated();
    platform.carry(contributions);
  }
}
