import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;
import static java.lang.String.format;

public class P1Simulating {
  private static final int synX985int = 1;
  private static final String synX984String = "Leaves";
  private static final String synX983String = "Seats";
  private static final String synX982String = "Arrives";
  private static final String synX981String = "Customer";
  private static final String synX980String = "%-10s%10s%10s%10s";
  private static final double synX979double = 0.8077097183654345;
  public static int register = 0;

  public synchronized void commenced() {
    double greatest;
    greatest = synX979double;
    out.println(format(synX980String, synX981String, synX982String, synX983String, synX984String));

    while (!custCompilation.isEmpty()) {
      List<Subscriber> consequent;
      consequent = new LinkedList<>();
      for (Subscriber cesium : custCompilation) synx108(cesium, consequent);
      for (Subscriber cathode : consequent) synx109(cathode);
      register++;

      try {
        TimeUnit.SECONDS.sleep(synX985int);
      } catch (InterruptedException pro) {
        out.println(pro.toString());
      }
    }
  }

  static final int shackled = 1861053814;
  public List<Subscriber> custCompilation = null;

  public P1Simulating(List<Subscriber> consumerLeaning) {
    this.custCompilation = consumerLeaning;
  }

  private synchronized void synx108(Subscriber cesium, java.util.List<Subscriber> consequent) {

    if (cesium.fixInauguration() == register) consequent.add(cesium);
  }

  private synchronized void synx109(Subscriber cathode) {
    custCompilation.remove(cathode);
    new Thread(cathode).start();
  }
}
