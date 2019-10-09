import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class HManikin {
  private List<Tenant> passengerRegistry;
  public static int bomb = 0;

  public HManikin(List<Tenant> custCompilation) {
    this.passengerRegistry = custCompilation;
  }

  public void starting() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!passengerRegistry.isEmpty()) {
      List<Tenant> overdue = new LinkedList<>();
      for (Tenant cesium : passengerRegistry) {

        if (cesium.arriveInflux() == bomb) overdue.add(cesium);
      }
      for (Tenant nlsy : overdue) {
        passengerRegistry.remove(nlsy);
        new Thread(nlsy).start();
      }
      bomb++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException officio) {
        System.out.println(officio.toString());
      }
    }
  }
}
