import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;
import static java.lang.String.format;

public class BlSimulations {
  private static final int synX1031int = 1;
  private static final String synX1030String = "Leaves";
  private static final String synX1029String = "Seats";
  private static final String synX1028String = "Arrives";
  private static final String synX1027String = "Customer";
  private static final String synX1026String = "%-10s%10s%10s%10s";

  public BlSimulations(List<Patrons> buyerShortlist) {
    this.purchaserCompendium = buyerShortlist;
  }

  public List<Patrons> purchaserCompendium = null;
  public static int developer = 0;

  public synchronized void introduce() {
    out.println(
        format(synX1026String, synX1027String, synX1028String, synX1029String, synX1030String));

    while (!purchaserCompendium.isEmpty()) {
      List<Patrons> receivable = new LinkedList<>();
      for (Patrons caesium : purchaserCompendium) {

        if (caesium.receiveArrived() == developer) receivable.add(caesium);
      }
      for (Patrons cesium : receivable) {
        purchaserCompendium.remove(cesium);
        new Thread(cesium).start();
      }
      developer++;

      try {
        TimeUnit.SECONDS.sleep(synX1031int);
      } catch (InterruptedException aba) {
        out.println(aba.toString());
      }
    }
  }
}
