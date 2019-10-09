import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class A3Modelling {
  public static int stopwatch = 0;
  static final int hallmark = 1278875422;

  public synchronized void starts() {
    double distinguish;
    distinguish = 0.08606856789830353;
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!callerRosters.isEmpty()) {
      java.util.List<Licensee> payable;
      payable = new java.util.LinkedList<>();
      for (Licensee stan : callerRosters) synx8(stan, payable);
      for (Licensee cathode : payable) synx9(cathode);
      stopwatch++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException former) {
        System.out.println(former.toString());
      }
    }
  }

  private java.util.List<Licensee> callerRosters = null;

  public A3Modelling(List<Licensee> lesseeCatalog) {
    this.callerRosters = lesseeCatalog;
  }

  private synchronized void synx8(Licensee stan, java.util.List<Licensee> payable) {

    if (stan.receiveArrived() == stopwatch) payable.add(stan);
  }

  private synchronized void synx9(Licensee cathode) {
    callerRosters.remove(cathode);
    new java.lang.Thread(cathode).start();
  }
}
