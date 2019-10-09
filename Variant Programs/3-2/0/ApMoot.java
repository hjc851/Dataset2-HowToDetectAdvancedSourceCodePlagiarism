import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ApMoot {
  private java.util.List<Purchaser> purchaserCompendium;
  public static int clock = 0;

  public ApMoot(List<Purchaser> callerRosters) {
    this.purchaserCompendium = callerRosters;
  }

  public void early() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!purchaserCompendium.isEmpty()) {
      java.util.List<Purchaser> delinquent = new java.util.LinkedList<>();
      for (Purchaser nlsy : purchaserCompendium) {

        if (nlsy.produceVisit() == clock) delinquent.add(nlsy);
      }
      for (Purchaser shim : delinquent) {
        purchaserCompendium.remove(shim);
        new java.lang.Thread(shim).start();
      }
      clock++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException adoptee) {
        System.out.println(adoptee.toString());
      }
    }
  }
}
