import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class EPrototype {
  public static int stopwatch = 0;

  public EPrototype(List<Subscribers> passengerRegistry) {
    this.clientNumber = passengerRegistry;
  }

  public synchronized void hold() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!clientNumber.isEmpty()) {
      java.util.List<Subscribers> because;
      because = new java.util.LinkedList<>();
      for (Subscribers cesium : clientNumber) {

        if (cesium.haveEmergence() == stopwatch) because.add(cesium);
      }
      for (Subscribers cmu : because) {
        clientNumber.remove(cmu);
        new java.lang.Thread(cmu).start();
      }
      stopwatch++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException adrian) {
        System.out.println(adrian.toString());
      }
    }
  }

  private java.util.List<Subscribers> clientNumber = null;
}
