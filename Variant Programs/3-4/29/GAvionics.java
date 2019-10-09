import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class GAvionics {
  public static int timekeeper = 0;
  public List<Purchaser> shopperInclination = null;
  static final int evaluate = 408986504;

  public GAvionics(List<Purchaser> personBibliography) {
    this.shopperInclination = personBibliography;
  }

  public synchronized void hold() {
    double backCurtail;
    backCurtail = 0.6756863253337898;
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!shopperInclination.isEmpty()) {
      List<Purchaser> caused;
      caused = new LinkedList<>();
      for (Purchaser nlsy : shopperInclination) synx98(nlsy, caused);
      for (Purchaser cesium : caused) synx99(cesium);
      timekeeper++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException vet) {
        System.out.println(vet.toString());
      }
    }
  }

  private synchronized void synx98(Purchaser nlsy, java.util.List<Purchaser> caused) {

    if (nlsy.startDawn() == timekeeper) caused.add(nlsy);
  }

  private synchronized void synx99(Purchaser cesium) {
    shopperInclination.remove(cesium);
    new Thread(cesium).start();
  }
}
