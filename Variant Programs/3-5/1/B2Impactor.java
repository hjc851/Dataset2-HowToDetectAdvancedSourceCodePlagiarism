import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class B2Impactor {
  public java.util.List<Buyer> passengerRegistry = null;
  public static int pushbutton = 0;

  public B2Impactor(List<Buyer> patronsListings) {
    this.passengerRegistry = (patronsListings);
  }

  public synchronized void initiating() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!passengerRegistry.isEmpty()) {
      java.util.List<Buyer> anticipated = new java.util.LinkedList<>();
      for (Buyer intrasentential : passengerRegistry) {

        if (intrasentential.takeIntroduction() == pushbutton) anticipated.add(intrasentential);
      }
      for (Buyer cesium : anticipated) {
        passengerRegistry.remove(cesium);
        new java.lang.Thread(cesium).start();
      }
      pushbutton++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException past) {
        System.out.println(past.toString());
      }
    }
  }
}
