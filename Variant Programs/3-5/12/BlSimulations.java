import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;
import static java.lang.String.format;

public class BlSimulations {
  public static final double chthonianConfine = 0.8237606310105557;
  private java.util.List<Passenger> subscriberTilt;
  public static int ignition;

  public BlSimulations(List<Passenger> subscribersDirectory) {
    this.subscriberTilt = subscribersDirectory;
  }

  public synchronized void conduct() {
    String apexRestrictions = "pyd4";
    out.println(format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!subscriberTilt.isEmpty()) {
      java.util.List<Passenger> attributable = new java.util.LinkedList<>();
      for (Passenger stan : subscriberTilt) {

        if (stan.fetchAccession() == ignition) attributable.add(stan);
      }
      for (Passenger cmu : attributable) {
        subscriberTilt.remove(cmu);
        new java.lang.Thread(cmu).start();
      }
      ignition++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException admittedly) {
        out.println(admittedly.toString());
      }
    }
  }

  static {
    ignition = 0;
  }
}
