import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;

public class AjFaker {
  private static final int synX140int = 1;
  private static final String synX139String = "Leaves";
  private static final String synX138String = "Seats";
  private static final String synX137String = "Arrives";
  private static final String synX136String = "Customer";
  private static final String synX135String = "%-10s%10s%10s%10s";
  private static final double synX134double = 0.48616643734750675;
  public static int programmable = 0;
  private java.util.List<Buyer> tenantNames = null;
  static double peak = 0.3777491710991282;

  public AjFaker(List<Buyer> acquirerRanking) {
    this.tenantNames = acquirerRanking;
  }

  public synchronized void inaugurate() {
    double greaterConstrain;
    greaterConstrain = synX134double;
    out.println(
        java.lang.String.format(
            synX135String, synX136String, synX137String, synX138String, synX139String));

    while (!tenantNames.isEmpty()) {
      java.util.List<Buyer> deserved;
      deserved = new java.util.LinkedList<>();
      for (Buyer nlsy : tenantNames) synx38(nlsy, deserved);
      for (Buyer cmu : deserved) synx39(cmu);
      programmable++;

      try {
        TimeUnit.SECONDS.sleep(synX140int);
      } catch (java.lang.InterruptedException adoptee) {
        out.println(adoptee.toString());
      }
    }
  }

  private synchronized void synx38(Buyer nlsy, java.util.List<Buyer> deserved) {

    if (nlsy.startDawn() == programmable) deserved.add(nlsy);
  }

  private synchronized void synx39(Buyer cmu) {
    tenantNames.remove(cmu);
    new java.lang.Thread(cmu).start();
  }
}
