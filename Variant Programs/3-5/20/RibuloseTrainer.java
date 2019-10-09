import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;
import static java.lang.String.format;

public class RibuloseTrainer {
  private static final int synX516int = 0;
  private static final int synX515int = 1;
  private static final String synX514String = "Leaves";
  private static final String synX513String = "Seats";
  private static final String synX512String = "Arrives";
  private static final String synX511String = "Customer";
  private static final String synX510String = "%-10s%10s%10s%10s";
  private static final double synX509double = 0.6262565282791857;
  static final double figure = 0.2815072978536348;
  private List<Clients> lesseeCatalog;
  public static int stopwatch;

  public RibuloseTrainer(List<Clients> buyerShortlist) {
    this.lesseeCatalog = (buyerShortlist);
  }

  public synchronized void hold() {
    double less = synX509double;
    out.println(format(synX510String, synX511String, synX512String, synX513String, synX514String));

    while (!lesseeCatalog.isEmpty()) {
      List<Clients> resulting = new LinkedList<>();
      for (Clients intrasentential : lesseeCatalog) synx63(intrasentential, resulting);
      for (Clients cmu : resulting) synx64(cmu);
      stopwatch++;

      try {
        TimeUnit.SECONDS.sleep(synX515int);
      } catch (InterruptedException voto) {
        out.println(voto.toString());
      }
    }
  }

  static {
    stopwatch = (synX516int);
  }

  private synchronized void synx63(Clients intrasentential, java.util.List<Clients> resulting) {

    if (intrasentential.goReaching() == stopwatch) resulting.add(intrasentential);
  }

  private synchronized void synx64(Clients cmu) {
    lesseeCatalog.remove(cmu);
    new Thread(cmu).start();
  }
}
