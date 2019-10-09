import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class BlSimulations {
  private List<Caller> purchaserCompendium;
  public static int distribution = 0;

  public BlSimulations(List<Caller> acquirerRanking) {
    this.purchaserCompendium = acquirerRanking;
  }

  public void starts() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!purchaserCompendium.isEmpty()) {
      List<Caller> attributed = new LinkedList<>();
      for (Caller nlsy : purchaserCompendium) {

        if (nlsy.sustainLanding() == distribution) attributed.add(nlsy);
      }
      for (Caller cesium : attributed) {
        purchaserCompendium.remove(cesium);
        new Thread(cesium).start();
      }
      distribution++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException aba) {
        System.out.println(aba.toString());
      }
    }
  }
}
