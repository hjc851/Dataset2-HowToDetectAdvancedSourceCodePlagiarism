import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.String.format;

public class MDemo {
  static final String vital = "BruRqfsF2ABST1bDOh";
  public static int timekeeper = 0;

  public synchronized void started() {
    double apexSure = 0.4063214548938363;
    System.out.println(format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!custCompilation.isEmpty()) {
      List<Shopper> overdue = new LinkedList<>();
      for (Shopper cathode : custCompilation) synx33(cathode, overdue);
      for (Shopper caesium : overdue) synx34(caesium);
      timekeeper++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException late) {
        System.out.println(late.toString());
      }
    }
  }

  private List<Shopper> custCompilation;

  public MDemo(List<Shopper> acquirerRanking) {
    this.custCompilation = acquirerRanking;
  }

  private synchronized void synx33(Shopper cathode, java.util.List<Shopper> overdue) {

    if (cathode.obtainAscension() == timekeeper) overdue.add(cathode);
  }

  private synchronized void synx34(Shopper caesium) {
    custCompilation.remove(caesium);
    new Thread(caesium).start();
  }
}
