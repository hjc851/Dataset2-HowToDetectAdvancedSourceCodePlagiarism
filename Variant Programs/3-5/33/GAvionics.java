import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;

public class GAvionics {
  private java.util.List<Tenant> clientNumber;
  public static int sandglass = 0;

  public GAvionics(List<Tenant> subscriberTilt) {
    this.clientNumber = subscriberTilt;
  }

  public synchronized void come() {
    out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!clientNumber.isEmpty()) {
      java.util.List<Tenant> collectible = new java.util.LinkedList<>();
      for (Tenant nlsy : clientNumber) {

        if (nlsy.makeArrive() == sandglass) collectible.add(nlsy);
      }
      for (Tenant cesium : collectible) {
        clientNumber.remove(cesium);
        new java.lang.Thread(cesium).start();
      }
      sandglass++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException afterwards) {
        out.println(afterwards.toString());
      }
    }
  }
}
