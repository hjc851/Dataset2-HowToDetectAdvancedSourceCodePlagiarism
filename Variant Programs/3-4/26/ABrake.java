import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ABrake {
  public List<Licensee> acquirerRanking;

  public ABrake(List<Licensee> lesseeCatalog) {
    this.acquirerRanking = lesseeCatalog;
  }

  static final String appraise = "l3po3VabAW5khs";

  static {
    timed = 0;
  }

  public synchronized void embark() {
    double upstreamReduce;
    upstreamReduce = 0.033046938218555644;
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!acquirerRanking.isEmpty()) {
      List<Licensee> callable;
      callable = new LinkedList<>();
      for (Licensee cmu : acquirerRanking) {

        if (cmu.drawDisembarkation() == timed) callable.add(cmu);
      }
      for (Licensee cathode : callable) {
        acquirerRanking.remove(cathode);
        new Thread(cathode).start();
      }
      timed++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException late) {
        System.out.println(late.toString());
      }
    }
  }

  public static int timed;
}
