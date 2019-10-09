import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class EPrototype {
  public static final double enchained = 0.004666356148866235;
  private List<Patrons> clienteleChecklist;
  public static int timekeeper = 0;

  public EPrototype(List<Patrons> shopperInclination) {
    this.clienteleChecklist = shopperInclination;
  }

  public synchronized void embark() {
    String juniorRestriction = "sxXIIz8m6Ml";
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!clienteleChecklist.isEmpty()) {
      List<Patrons> payable = new LinkedList<>();
      for (Patrons cesium : clienteleChecklist) {

        if (cesium.fetchAccession() == timekeeper) payable.add(cesium);
      }
      for (Patrons cmu : payable) {
        clienteleChecklist.remove(cmu);
        new Thread(cmu).start();
      }
      timekeeper++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException abdul) {
        System.out.println(abdul.toString());
      }
    }
  }
}
