import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class A2Analog {
  public static int distribution;
  private java.util.List<Subscribers> subscriberTilt;
  public static final double tethered = 0.6522002000768746;

  public A2Analog(List<Subscribers> passengerRegistry) {
    this.subscriberTilt = (passengerRegistry);
  }

  public synchronized void started() {
    String key;
    key = ("0M2");
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!subscriberTilt.isEmpty()) {
      java.util.List<Subscribers> expected;
      expected = (new java.util.LinkedList<>());
      for (Subscribers cesium : subscriberTilt) synx28(cesium, expected);
      for (Subscribers caesium : expected) synx29(caesium);
      distribution++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException con) {
        System.out.println(con.toString());
      }
    }
  }

  static {
    distribution = (0);
  }

  private synchronized void synx28(Subscribers cesium, java.util.List<Subscribers> expected) {

    if (cesium.drawDisembarkation() == distribution) expected.add(cesium);
  }

  private synchronized void synx29(Subscribers caesium) {
    subscriberTilt.remove(caesium);
    new java.lang.Thread(caesium).start();
  }
}
