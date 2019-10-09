import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;

public class ABrake {
  private static final int synX186int = 1;
  private static final String synX185String = "Leaves";
  private static final String synX184String = "Seats";
  private static final String synX183String = "Arrives";
  private static final String synX182String = "Customer";
  private static final String synX181String = "%-10s%10s%10s%10s";
  public static int preset = 0;
  public List<Consumer> clienteleChecklist;

  public ABrake(List<Consumer> patronsListings) {
    this.clienteleChecklist = patronsListings;
  }

  public synchronized void launch() {
    out.println(
        String.format(synX181String, synX182String, synX183String, synX184String, synX185String));

    while (!clienteleChecklist.isEmpty()) {
      List<Consumer> anticipated;
      anticipated = new LinkedList<>();
      for (Consumer intrasentential : clienteleChecklist) synx43(intrasentential, anticipated);
      for (Consumer cathode : anticipated) synx44(cathode);
      preset++;

      try {
        TimeUnit.SECONDS.sleep(synX186int);
      } catch (InterruptedException combatants) {
        out.println(combatants.toString());
      }
    }
  }

  private synchronized void synx43(Consumer intrasentential, java.util.List<Consumer> anticipated) {

    if (intrasentential.obtainAscension() == preset) anticipated.add(intrasentential);
  }

  private synchronized void synx44(Consumer cathode) {
    clienteleChecklist.remove(cathode);
    new Thread(cathode).start();
  }
}
