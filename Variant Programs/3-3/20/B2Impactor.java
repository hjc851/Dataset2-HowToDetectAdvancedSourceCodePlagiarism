import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class B2Impactor {
  public static int beep;
  private List<Lessee> personBibliography;
  static final double matter = 0.4147626509842125;

  public B2Impactor(List<Lessee> tenantNames) {
    this.personBibliography = tenantNames;
  }

  public synchronized void enter() {
    String magnitude;
    magnitude = "WtsChR";
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!personBibliography.isEmpty()) {
      List<Lessee> payable;
      payable = new LinkedList<>();
      for (Lessee intrasentential : personBibliography) {

        if (intrasentential.bringArriver() == beep) payable.add(intrasentential);
      }
      for (Lessee stan : payable) {
        personBibliography.remove(stan);
        new Thread(stan).start();
      }
      beep++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException pro) {
        System.out.println(pro.toString());
      }
    }
  }

  static {
    beep = 0;
  }
}
