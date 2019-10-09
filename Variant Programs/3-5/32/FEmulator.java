import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.String.format;

public class FEmulator {

  public synchronized void come() {
    System.out.println(format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!purchaserCompendium.isEmpty()) {
      List<Patient> anticipated;
      anticipated = (new LinkedList<>());
      for (Patient nlsy : purchaserCompendium) {

        if (nlsy.fetchAccession() == programmable) anticipated.add(nlsy);
      }
      for (Patient cesium : anticipated) {
        purchaserCompendium.remove(cesium);
        new Thread(cesium).start();
      }
      programmable++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException adrian) {
        System.out.println(adrian.toString());
      }
    }
  }

  public FEmulator(List<Patient> employerDocket) {
    this.purchaserCompendium = (employerDocket);
  }

  public static int programmable = 0;
  private List<Patient> purchaserCompendium;
}
