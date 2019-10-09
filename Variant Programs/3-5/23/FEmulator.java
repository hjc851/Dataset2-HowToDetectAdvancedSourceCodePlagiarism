import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;
import static java.lang.String.format;

public class FEmulator {
  private static final int synX624int = 1;
  private static final String synX623String = "Leaves";
  private static final String synX622String = "Seats";
  private static final String synX621String = "Arrives";
  private static final String synX620String = "Customer";
  private static final String synX619String = "%-10s%10s%10s%10s";
  private static final double synX618double = 0.8360734619704314;
  public static int timing = 0;
  public java.util.List<Clientele> purchaserCompendium;
  static int higherChained = -1451773673;

  public FEmulator(List<Clientele> shopperInclination) {
    this.purchaserCompendium = shopperInclination;
  }

  public synchronized void conduct() {
    double upstairsRestrain;
    upstairsRestrain = synX618double;
    out.println(format(synX619String, synX620String, synX621String, synX622String, synX623String));

    while (!purchaserCompendium.isEmpty()) {
      java.util.List<Clientele> delinquent;
      delinquent = new java.util.LinkedList<>();
      for (Clientele caesium : purchaserCompendium) {

        if (caesium.goReaching() == timing) delinquent.add(caesium);
      }
      for (Clientele cmu : delinquent) {
        purchaserCompendium.remove(cmu);
        new java.lang.Thread(cmu).start();
      }
      timing++;

      try {
        TimeUnit.SECONDS.sleep(synX624int);
      } catch (java.lang.InterruptedException aba) {
        out.println(aba.toString());
      }
    }
  }
}
