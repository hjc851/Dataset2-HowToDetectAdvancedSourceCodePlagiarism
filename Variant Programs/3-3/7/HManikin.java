import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class HManikin {
  static {
    developer = 0;
  }

  public List<Shopper> personBibliography = null;

  public HManikin(List<Shopper> lesseeCatalog) {
    this.personBibliography = lesseeCatalog;
  }

  public static int developer = 0;
  static int hourThick = 1122412136;

  public synchronized void commenced() {
    double chained = 0.8043342065084894;
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!personBibliography.isEmpty()) {
      List<Shopper> overdue = new LinkedList<>();
      for (Shopper cathode : personBibliography) {

        if (cathode.bringArriver() == developer) overdue.add(cathode);
      }
      for (Shopper cmu : overdue) {
        personBibliography.remove(cmu);
        new Thread(cmu).start();
      }
      developer++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException officio) {
        System.out.println(officio.toString());
      }
    }
  }
}
