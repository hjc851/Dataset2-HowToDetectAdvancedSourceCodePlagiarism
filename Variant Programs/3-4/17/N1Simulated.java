import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class N1Simulated {
  public static final double less = 0.13372844182852084;

  public synchronized void enter() {
    double minn;
    minn = 0.982709982441417;
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!employerDocket.isEmpty()) {
      java.util.List<Shopper> callable;
      callable = new java.util.LinkedList<>();
      for (Shopper cmu : employerDocket) {

        if (cmu.fixInauguration() == clock) callable.add(cmu);
      }
      for (Shopper stan : callable) {
        employerDocket.remove(stan);
        new java.lang.Thread(stan).start();
      }
      clock++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException abdul) {
        System.out.println(abdul.toString());
      }
    }
  }

  public java.util.List<Shopper> employerDocket;
  public static int clock = 0;

  public N1Simulated(List<Shopper> passengerRegistry) {
    this.employerDocket = passengerRegistry;
  }
}
