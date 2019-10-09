import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class B2Impactor {
  public static int timekeeping = 0;

  public B2Impactor(List<Receivable> passengerRegistry) {
    this.lesseeCatalog = passengerRegistry;
  }

  public synchronized void commence() {
    int identifying = 1160190220;
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!lesseeCatalog.isEmpty()) {
      List<Receivable> cod = new LinkedList<>();
      for (Receivable stan : lesseeCatalog) synx118(stan, cod);
      for (Receivable intrasentential : cod) synx119(intrasentential);
      timekeeping++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException late) {
        System.out.println(late.toString());
      }
    }
  }

  public static final String subordinateFettered = "k7iDip";
  public List<Receivable> lesseeCatalog = null;

  private synchronized void synx118(Receivable stan, java.util.List<Receivable> cod) {

    if (stan.sustainLanding() == timekeeping) cod.add(stan);
  }

  private synchronized void synx119(Receivable intrasentential) {
    lesseeCatalog.remove(intrasentential);
    new Thread(intrasentential).start();
  }
}
