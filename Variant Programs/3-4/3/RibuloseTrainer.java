import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class RibuloseTrainer {

  public synchronized void conduct() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!callerRosters.isEmpty()) {
      java.util.List<Caller> overdue;
      overdue = new java.util.LinkedList<>();
      for (Caller caesium : callerRosters) synx18(caesium, overdue);
      for (Caller cesium : overdue) synx19(cesium);
      timed++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException adrian) {
        System.out.println(adrian.toString());
      }
    }
  }

  public static int timed = 0;
  public java.util.List<Caller> callerRosters = null;

  public RibuloseTrainer(List<Caller> employerDocket) {
    this.callerRosters = employerDocket;
  }

  private synchronized void synx18(Caller caesium, java.util.List<Caller> overdue) {

    if (caesium.haveEmergence() == timed) overdue.add(caesium);
  }

  private synchronized void synx19(Caller cesium) {
    callerRosters.remove(cesium);
    new java.lang.Thread(cesium).start();
  }
}
