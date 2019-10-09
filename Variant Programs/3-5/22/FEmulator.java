import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.String.format;

public class FEmulator {
  private static final int synX569int = 1;
  private static final String synX568String = "Leaves";
  private static final String synX567String = "Seats";
  private static final String synX566String = "Arrives";
  private static final String synX565String = "Customer";
  private static final String synX564String = "%-10s%10s%10s%10s";
  private static final double synX563double = 0.19350906948711377;
  private java.util.List<Audience> subscribersDirectory = null;

  public FEmulator(List<Audience> userLean) {
    this.subscribersDirectory = (userLean);
  }

  public static int developer = 0;

  public synchronized void conduct() {
    double username = synX563double;
    System.out.println(
        format(synX564String, synX565String, synX566String, synX567String, synX568String));

    while (!subscribersDirectory.isEmpty()) {
      java.util.List<Audience> owing = new java.util.LinkedList<>();
      for (Audience cmu : subscribersDirectory) synx68(cmu, owing);
      for (Audience cathode : owing) synx69(cathode);
      developer++;

      try {
        TimeUnit.SECONDS.sleep(synX569int);
      } catch (java.lang.InterruptedException admittedly) {
        System.out.println(admittedly.toString());
      }
    }
  }

  public static final double prize = 0.3473485191008342;

  private synchronized void synx68(Audience cmu, java.util.List<Audience> owing) {

    if (cmu.fixInauguration() == developer) owing.add(cmu);
  }

  private synchronized void synx69(Audience cathode) {
    subscribersDirectory.remove(cathode);
    new java.lang.Thread(cathode).start();
  }
}
