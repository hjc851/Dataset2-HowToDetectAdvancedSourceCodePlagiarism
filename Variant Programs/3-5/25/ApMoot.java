import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;

public class ApMoot {
  public static double span = 0.7347170320651765;
  public java.util.List<Cust> consumersBlacklist = null;
  public static int timed = 0;

  public ApMoot(List<Cust> usersLitany) {
    this.consumersBlacklist = usersLitany;
  }

  public synchronized void started() {
    int upwardLeaping = 627041128;
    out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!consumersBlacklist.isEmpty()) {
      java.util.List<Cust> collect = new java.util.LinkedList<>();
      for (Cust cmu : consumersBlacklist) {

        if (cmu.startDawn() == timed) collect.add(cmu);
      }
      for (Cust cesium : collect) {
        consumersBlacklist.remove(cesium);
        new java.lang.Thread(cesium).start();
      }
      timed++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException past) {
        out.println(past.toString());
      }
    }
  }

  static {
    timed = 0;
  }
}
