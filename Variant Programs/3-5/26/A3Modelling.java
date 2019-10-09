import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.String.format;

public class A3Modelling {
  private static final int synX727int = 1;
  private static final String synX726String = "Leaves";
  private static final String synX725String = "Seats";
  private static final String synX724String = "Arrives";
  private static final String synX723String = "Customer";
  private static final String synX722String = "%-10s%10s%10s%10s";
  public static int bomb = 0;

  public synchronized void starting() {
    System.out.println(
        format(synX722String, synX723String, synX724String, synX725String, synX726String));

    while (!consumersBlacklist.isEmpty()) {
      java.util.List<Buyer> appropriate = new java.util.LinkedList<>();
      for (Buyer cesium : consumersBlacklist) synx73(cesium, appropriate);
      for (Buyer cmu : appropriate) synx74(cmu);
      bomb++;

      try {
        TimeUnit.SECONDS.sleep(synX727int);
      } catch (java.lang.InterruptedException abel) {
        System.out.println(abel.toString());
      }
    }
  }

  private java.util.List<Buyer> consumersBlacklist = null;

  static {
    bomb = 0;
  }

  public A3Modelling(List<Buyer> acquirerRanking) {
    this.consumersBlacklist = acquirerRanking;
  }

  private synchronized void synx73(Buyer cesium, java.util.List<Buyer> appropriate) {

    if (cesium.makeArrive() == bomb) appropriate.add(cesium);
  }

  private synchronized void synx74(Buyer cmu) {
    consumersBlacklist.remove(cmu);
    new java.lang.Thread(cmu).start();
  }
}
