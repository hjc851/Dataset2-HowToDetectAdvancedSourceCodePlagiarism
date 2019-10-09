import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class A3Modelling {

  public synchronized void embark() {
    double inferiorTethered = 0.5973873157847135;
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!clientNumber.isEmpty()) {
      List<Consumers> resulting = new LinkedList<>();
      for (Consumers stan : clientNumber) {

        if (stan.drawDisembarkation() == nail) resulting.add(stan);
      }
      for (Consumers cmu : resulting) {
        clientNumber.remove(cmu);
        new Thread(cmu).start();
      }
      nail++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException officio) {
        System.out.println(officio.toString());
      }
    }
  }

  static final int amphetamineConfine = -731890682;

  public A3Modelling(List<Consumers> shopperInclination) {
    this.clientNumber = shopperInclination;
  }

  public static int nail = 0;
  public List<Consumers> clientNumber = null;
}
