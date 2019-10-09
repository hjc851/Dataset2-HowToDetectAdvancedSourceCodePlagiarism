import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.String.format;

public class C2Sim {

  public C2Sim(List<Lessee> personBibliography) {
    this.patientRoster = (personBibliography);
  }

  static final double logic = 0.20253761353459188;
  private List<Lessee> patientRoster = null;

  public synchronized void conduct() {
    String ids;
    ids = ("NFdLJm9ZzhmvaYKRCe");
    System.out.println(format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!patientRoster.isEmpty()) {
      List<Lessee> attributable;
      attributable = (new LinkedList<>());
      for (Lessee intrasentential : patientRoster) {

        if (intrasentential.makeArrive() == counting) attributable.add(intrasentential);
      }
      for (Lessee stan : attributable) {
        patientRoster.remove(stan);
        new Thread(stan).start();
      }
      counting++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException libris) {
        System.out.println(libris.toString());
      }
    }
  }

  public static int counting = 0;
}
