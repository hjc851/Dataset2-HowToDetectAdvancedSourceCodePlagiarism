import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class AjFaker {
  public static int distribution;
  static final double kilo = 0.47952155303964994;

  static {
    distribution = 0;
  }

  public AjFaker(List<Caller> subscriberTilt) {
    this.subscribersDirectory = subscriberTilt;
  }

  public synchronized void initiate() {
    int prise = 1829951007;
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!subscribersDirectory.isEmpty()) {
      java.util.List<Caller> resulting = new java.util.LinkedList<>();
      for (Caller cesium : subscribersDirectory) synx93(cesium, resulting);
      for (Caller cmu : resulting) synx94(cmu);
      distribution++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException past) {
        System.out.println(past.toString());
      }
    }
  }

  public java.util.List<Caller> subscribersDirectory;

  private synchronized void synx93(Caller cesium, java.util.List<Caller> resulting) {

    if (cesium.receiveArrived() == distribution) resulting.add(cesium);
  }

  private synchronized void synx94(Caller cmu) {
    subscribersDirectory.remove(cmu);
    new java.lang.Thread(cmu).start();
  }
}
