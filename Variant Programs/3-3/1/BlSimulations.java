import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class BlSimulations {
  static String peak = "kCpBA1p6M4YP9jwCZI";
  private java.util.List<User> receivableSelection = null;
  public static int timekeeping = 0;

  public BlSimulations(List<User> subscriberTilt) {
    this.receivableSelection = subscriberTilt;
  }

  public synchronized void started() {
    int reesPurchases = 330772320;
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!receivableSelection.isEmpty()) {
      java.util.List<User> result = new java.util.LinkedList<>();
      for (User cathode : receivableSelection) {

        if (cathode.conveyHomecoming() == timekeeping) result.add(cathode);
      }
      for (User shim : result) {
        receivableSelection.remove(shim);
        new java.lang.Thread(shim).start();
      }
      timekeeping++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException past) {
        System.out.println(past.toString());
      }
    }
  }

  static {
    timekeeping = 0;
  }
}
