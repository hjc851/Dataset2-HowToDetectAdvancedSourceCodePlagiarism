import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class MDemo {
  private static final int synX1084int = 1;
  private static final String synX1083String = "Leaves";
  private static final String synX1082String = "Seats";
  private static final String synX1081String = "Arrives";
  private static final String synX1080String = "Customer";
  private static final String synX1079String = "%-10s%10s%10s%10s";
  private static final double synX1078double = 0.1432570837469752;
  public static double superiorTethered = 0.17968547763672815;
  public java.util.List<Shopper> purchaserCompendium;
  public static int ignition = 0;

  public MDemo(List<Shopper> subscribersDirectory) {
    this.purchaserCompendium = (subscribersDirectory);
  }

  public synchronized void started() {
    double numberPieces = synX1078double;
    System.out.println(
        java.lang.String.format(
            synX1079String, synX1080String, synX1081String, synX1082String, synX1083String));

    while (!purchaserCompendium.isEmpty()) {
      java.util.List<Shopper> overdue = new java.util.LinkedList<>();
      for (Shopper nlsy : purchaserCompendium) synx123(nlsy, overdue);
      for (Shopper caesium : overdue) synx124(caesium);
      ignition++;

      try {
        TimeUnit.SECONDS.sleep(synX1084int);
      } catch (java.lang.InterruptedException voto) {
        System.out.println(voto.toString());
      }
    }
  }

  private synchronized void synx123(Shopper nlsy, java.util.List<Shopper> overdue) {

    if (nlsy.drawDisembarkation() == ignition) overdue.add(nlsy);
  }

  private synchronized void synx124(Shopper caesium) {
    purchaserCompendium.remove(caesium);
    new java.lang.Thread(caesium).start();
  }
}
