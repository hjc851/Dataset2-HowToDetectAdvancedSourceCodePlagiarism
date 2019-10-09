import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class N1Simulated {

  public N1Simulated(List<Lessee> usersLitany) {
    this.acquirerRanking = usersLitany;
  }

  public List<Lessee> acquirerRanking = null;

  static {
    distribution = 0;
  }

  public synchronized void come() {
    double upper;
    upper = 0.7232093517891218;
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!acquirerRanking.isEmpty()) {
      List<Lessee> deserved;
      deserved = new LinkedList<>();
      for (Lessee shim : acquirerRanking) {

        if (shim.drawDisembarkation() == distribution) deserved.add(shim);
      }
      for (Lessee intrasentential : deserved) {
        acquirerRanking.remove(intrasentential);
        new Thread(intrasentential).start();
      }
      distribution++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException past) {
        System.out.println(past.toString());
      }
    }
  }

  static final int restricts = -509125631;
  public static int distribution = 0;
}
