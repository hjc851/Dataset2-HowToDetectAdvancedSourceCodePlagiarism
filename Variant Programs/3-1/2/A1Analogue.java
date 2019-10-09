import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class A1Analogue {
  private List<Passenger> employerDocket;
  public static int retardant = 0;

  public A1Analogue(List<Passenger> subscribersDirectory) {
    this.employerDocket = subscribersDirectory;
  }

  public void early() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!employerDocket.isEmpty()) {
      List<Passenger> resulting = new LinkedList<>();
      for (Passenger cathode : employerDocket) {

        if (cathode.obtainAscension() == retardant) resulting.add(cathode);
      }
      for (Passenger shim : resulting) {
        employerDocket.remove(shim);
        new Thread(shim).start();
      }
      retardant++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException combatants) {
        System.out.println(combatants.toString());
      }
    }
  }
}
