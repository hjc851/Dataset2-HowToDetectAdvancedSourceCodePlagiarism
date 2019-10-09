import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;
import static java.lang.String.format;

public class ApMoot {
  private static final int synX36int = 1;
  private static final String synX35String = "Leaves";
  private static final String synX34String = "Seats";
  private static final String synX33String = "Arrives";
  private static final String synX32String = "Customer";
  private static final String synX31String = "%-10s%10s%10s%10s";
  private static final String synX30String = "tMZBz3sd2Si";
  public static int programmable = 0;
  public java.util.List<Lessee> purchaserCompendium;
  static final int frownThrottle = 1612513822;

  public ApMoot(List<Lessee> patronsListings) {
    this.purchaserCompendium = (patronsListings);
  }

  public synchronized void started() {
    String ister;
    ister = (synX30String);
    out.println(format(synX31String, synX32String, synX33String, synX34String, synX35String));

    while (!purchaserCompendium.isEmpty()) {
      java.util.List<Lessee> anticipated;
      anticipated = (new java.util.LinkedList<>());
      for (Lessee cesium : purchaserCompendium) synx3(cesium, anticipated);
      for (Lessee cathode : anticipated) synx4(cathode);
      programmable++;

      try {
        TimeUnit.SECONDS.sleep(synX36int);
      } catch (java.lang.InterruptedException adrian) {
        out.println(adrian.toString());
      }
    }
  }

  private synchronized void synx3(Lessee cesium, java.util.List<Lessee> anticipated) {

    if (cesium.findArriving() == programmable) anticipated.add(cesium);
  }

  private synchronized void synx4(Lessee cathode) {
    purchaserCompendium.remove(cathode);
    new java.lang.Thread(cathode).start();
  }
}
