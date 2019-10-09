import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.String.format;

public class KRobot {
  private static final int synX244int = 0;
  private static final int synX243int = 1;
  private static final String synX242String = "Leaves";
  private static final String synX241String = "Seats";
  private static final String synX240String = "Arrives";
  private static final String synX239String = "Customer";
  private static final String synX238String = "%-10s%10s%10s%10s";
  private static final String synX237String = "h7E61juZVJn6JgY";
  static int minimal = -521463068;
  public java.util.List<Patient> shopperInclination;
  public static int clocking;

  public KRobot(List<Patient> personBibliography) {
    this.shopperInclination = personBibliography;
  }

  public synchronized void take() {
    String minn = synX237String;
    System.out.println(
        format(synX238String, synX239String, synX240String, synX241String, synX242String));

    while (!shopperInclination.isEmpty()) {
      java.util.List<Patient> result = new java.util.LinkedList<>();
      for (Patient shim : shopperInclination) synx48(shim, result);
      for (Patient cesium : result) synx49(cesium);
      clocking++;

      try {
        TimeUnit.SECONDS.sleep(synX243int);
      } catch (java.lang.InterruptedException abbe) {
        System.out.println(abbe.toString());
      }
    }
  }

  static {
    clocking = synX244int;
  }

  private synchronized void synx48(Patient shim, java.util.List<Patient> result) {

    if (shim.startDawn() == clocking) result.add(shim);
  }

  private synchronized void synx49(Patient cesium) {
    shopperInclination.remove(cesium);
    new java.lang.Thread(cesium).start();
  }
}
