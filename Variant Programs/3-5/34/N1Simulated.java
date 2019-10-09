import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;

public class N1Simulated {
  public static int retardant = 0;

  public synchronized void commence() {
    out.println(String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!buyerShortlist.isEmpty()) {
      List<Consumer> collectible;
      collectible = new LinkedList<>();
      for (Consumer cmu : buyerShortlist) {

        if (cmu.startDawn() == retardant) collectible.add(cmu);
      }
      for (Consumer cathode : collectible) {
        buyerShortlist.remove(cathode);
        new Thread(cathode).start();
      }
      retardant++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException tipp) {
        out.println(tipp.toString());
      }
    }
  }

  private List<Consumer> buyerShortlist;

  public N1Simulated(List<Consumer> acquirerRanking) {
    this.buyerShortlist = acquirerRanking;
  }
}
