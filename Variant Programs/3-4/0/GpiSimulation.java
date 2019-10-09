import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class GpiSimulation {
  public static int timekeeper = 0;
  public java.util.List<Audience> subscriberTilt;
  public static final double marquez = 0.471487753120584;

  public GpiSimulation(List<Audience> subscribersDirectory) {
    this.subscriberTilt = subscribersDirectory;
  }

  public synchronized void initiate() {
    double pledge;
    pledge = 0.35310607217911816;
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!subscriberTilt.isEmpty()) {
      java.util.List<Audience> attributable;
      attributable = new java.util.LinkedList<>();
      for (Audience cathode : subscriberTilt) synx3(cathode, attributable);
      for (Audience nlsy : attributable) synx4(nlsy);
      timekeeper++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException officio) {
        System.out.println(officio.toString());
      }
    }
  }

  private synchronized void synx3(Audience cathode, java.util.List<Audience> attributable) {

    if (cathode.fetchAccession() == timekeeper) attributable.add(cathode);
  }

  private synchronized void synx4(Audience nlsy) {
    subscriberTilt.remove(nlsy);
    new java.lang.Thread(nlsy).start();
  }
}
