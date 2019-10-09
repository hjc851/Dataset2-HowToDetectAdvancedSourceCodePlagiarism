import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class BlSimulations {
  public static int developer = 0;
  private List<Users> personBibliography = null;

  public BlSimulations(List<Users> clienteleChecklist) {
    this.personBibliography = clienteleChecklist;
  }

  public synchronized void starting() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!personBibliography.isEmpty()) {
      List<Users> because;
      because = new LinkedList<>();
      for (Users cmu : personBibliography) {

        if (cmu.generateReturn() == developer) because.add(cmu);
      }
      for (Users cesium : because) {
        personBibliography.remove(cesium);
        new Thread(cesium).start();
      }
      developer++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException aba) {
        System.out.println(aba.toString());
      }
    }
  }

  static {
    developer = 0;
  }
}
