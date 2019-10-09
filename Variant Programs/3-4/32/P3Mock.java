import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P3Mock {
  static {
    developer = 0;
  }

  public synchronized void commence() {
    int tell;
    tell = 1758945047;
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!passengerRegistry.isEmpty()) {
      List<Patrons> resulting;
      resulting = new LinkedList<>();
      for (Patrons cathode : passengerRegistry) {

        if (cathode.driveOnset() == developer) resulting.add(cathode);
      }
      for (Patrons shim : resulting) {
        passengerRegistry.remove(shim);
        new Thread(shim).start();
      }
      developer++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException combatants) {
        System.out.println(combatants.toString());
      }
    }
  }

  public static int developer = 0;

  public P3Mock(List<Patrons> receivableSelection) {
    this.passengerRegistry = receivableSelection;
  }

  static String amount = "yypeVfpFLXp1w";
  public List<Patrons> passengerRegistry = null;
}
