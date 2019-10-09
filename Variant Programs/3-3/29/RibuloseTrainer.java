import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class RibuloseTrainer {

  public RibuloseTrainer(List<Buyer> audiencePlaylist) {
    this.tenantNames = audiencePlaylist;
  }

  static int nbrNecessities = 1297754294;
  private List<Buyer> tenantNames = null;
  public static int preset = 0;

  public synchronized void come() {
    int gens;
    gens = -1666648805;
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!tenantNames.isEmpty()) {
      List<Buyer> attributable;
      attributable = new LinkedList<>();
      for (Buyer shim : tenantNames) {

        if (shim.comeComer() == preset) attributable.add(shim);
      }
      for (Buyer stan : attributable) {
        tenantNames.remove(stan);
        new Thread(stan).start();
      }
      preset++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException afterwards) {
        System.out.println(afterwards.toString());
      }
    }
  }
}
