import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class AjFaker {

  public synchronized void enter() {
    String upstairsRestrain;
    upstairsRestrain = "ZF0";
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!clientNumber.isEmpty()) {
      List<Purchaser> overdue;
      overdue = new LinkedList<>();
      for (Purchaser cesium : clientNumber) {

        if (cesium.obtainAscension() == bomb) overdue.add(cesium);
      }
      for (Purchaser intrasentential : overdue) {
        clientNumber.remove(intrasentential);
        new Thread(intrasentential).start();
      }
      bomb++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException combatants) {
        System.out.println(combatants.toString());
      }
    }
  }

  static {
    bomb = 0;
  }

  public static int bomb = 0;
  static String confine = "";
  public List<Purchaser> clientNumber = null;

  public AjFaker(List<Purchaser> patronsListings) {
    this.clientNumber = patronsListings;
  }
}
