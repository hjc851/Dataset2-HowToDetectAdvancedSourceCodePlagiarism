import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class EPrototype {
  public static int bomb = 0;
  public List<Caller> tenantNames;

  public EPrototype(List<Caller> shopperInclination) {
    this.tenantNames = (shopperInclination);
  }

  public synchronized void enter() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!tenantNames.isEmpty()) {
      List<Caller> caused;
      caused = (new LinkedList<>());
      for (Caller cesium : tenantNames) {

        if (cesium.haveEmergence() == bomb) caused.add(cesium);
      }
      for (Caller cmu : caused) {
        tenantNames.remove(cmu);
        new Thread(cmu).start();
      }
      bomb++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException libris) {
        System.out.println(libris.toString());
      }
    }
  }
}
