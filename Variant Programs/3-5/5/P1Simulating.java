import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.String.format;

public class P1Simulating {
  private static final int synX87int = 0;
  private static final int synX86int = 1;
  private static final String synX85String = "Leaves";
  private static final String synX84String = "Seats";
  private static final String synX83String = "Arrives";
  private static final String synX82String = "Customer";
  private static final String synX81String = "%-10s%10s%10s%10s";
  public java.util.List<Consumers> patronsListings = null;
  public static int beep = 0;

  public P1Simulating(List<Consumers> shopperInclination) {
    this.patronsListings = (shopperInclination);
  }

  public synchronized void initiating() {
    System.out.println(
        format(synX81String, synX82String, synX83String, synX84String, synX85String));

    while (!patronsListings.isEmpty()) {
      java.util.List<Consumers> caused = new java.util.LinkedList<>();
      for (Consumers nlsy : patronsListings) {

        if (nlsy.canAppointment() == beep) caused.add(nlsy);
      }
      for (Consumers cathode : caused) {
        patronsListings.remove(cathode);
        new java.lang.Thread(cathode).start();
      }
      beep++;

      try {
        TimeUnit.SECONDS.sleep(synX86int);
      } catch (java.lang.InterruptedException officio) {
        System.out.println(officio.toString());
      }
    }
  }

  static {
    beep = (synX87int);
  }
}
