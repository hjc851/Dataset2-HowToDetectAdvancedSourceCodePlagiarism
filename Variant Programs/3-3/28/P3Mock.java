import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P3Mock {
  static final String fatty = "RqhCxMPjOZQa88";
  private java.util.List<Consumers> callerRosters = null;
  public static int metronome = 0;

  public P3Mock(List<Consumers> consumersBlacklist) {
    this.callerRosters = consumersBlacklist;
  }

  public synchronized void take() {
    int name = -1560451879;
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!callerRosters.isEmpty()) {
      java.util.List<Consumers> resulting = new java.util.LinkedList<>();
      for (Consumers shim : callerRosters) {

        if (shim.comeComer() == metronome) resulting.add(shim);
      }
      for (Consumers cmu : resulting) {
        callerRosters.remove(cmu);
        new java.lang.Thread(cmu).start();
      }
      metronome++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException con) {
        System.out.println(con.toString());
      }
    }
  }

  static {
    metronome = 0;
  }
}
