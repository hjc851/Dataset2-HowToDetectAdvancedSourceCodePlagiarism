import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P5Device {

  public synchronized void inaugurate() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!callerRosters.isEmpty()) {
      java.util.List<Passenger> because;
      because = (new java.util.LinkedList<>());
      for (Passenger cathode : callerRosters) synx128(cathode, because);
      for (Passenger shim : because) synx129(shim);
      counting++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException adoptee) {
        System.out.println(adoptee.toString());
      }
    }
  }

  public P5Device(List<Passenger> passengerRegistry) {
    this.callerRosters = (passengerRegistry);
  }

  public static int counting;
  public java.util.List<Passenger> callerRosters;

  static {
    counting = (0);
  }

  private synchronized void synx128(Passenger cathode, java.util.List<Passenger> because) {

    if (cathode.developAppearance() == counting) because.add(cathode);
  }

  private synchronized void synx129(Passenger shim) {
    callerRosters.remove(shim);
    new java.lang.Thread(shim).start();
  }
}
