import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class RibuloseTrainer {
  private static final int synX888int = 1;
  private static final String synX887String = "Leaves";
  private static final String synX886String = "Seats";
  private static final String synX885String = "Arrives";
  private static final String synX884String = "Customer";
  private static final String synX883String = "%-10s%10s%10s%10s";
  public static int clock = 0;

  public RibuloseTrainer(List<Acquirer> patientRoster) {
    this.personBibliography = (patientRoster);
  }

  public synchronized void enter() {
    System.out.println(
        String.format(synX883String, synX884String, synX885String, synX886String, synX887String));

    while (!personBibliography.isEmpty()) {
      List<Acquirer> collectable;
      collectable = (new LinkedList<>());
      for (Acquirer intrasentential : personBibliography) synx98(intrasentential, collectable);
      for (Acquirer cesium : collectable) synx99(cesium);
      clock++;

      try {
        TimeUnit.SECONDS.sleep(synX888int);
      } catch (InterruptedException tipp) {
        System.out.println(tipp.toString());
      }
    }
  }

  private List<Acquirer> personBibliography;

  private synchronized void synx98(Acquirer intrasentential, java.util.List<Acquirer> collectable) {

    if (intrasentential.haveEmergence() == clock) collectable.add(intrasentential);
  }

  private synchronized void synx99(Acquirer cesium) {
    personBibliography.remove(cesium);
    new Thread(cesium).start();
  }
}
