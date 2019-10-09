import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;

public class RibuloseTrainer {
  public static int distribution = 0;
  private java.util.List<Lessee> consumersBlacklist;

  public RibuloseTrainer(List<Lessee> consumerLeaning) {
    this.consumersBlacklist = consumerLeaning;
  }

  public synchronized void resume() {
    out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!consumersBlacklist.isEmpty()) {
      java.util.List<Lessee> anticipated;
      anticipated = new java.util.LinkedList<>();
      for (Lessee intrasentential : consumersBlacklist) synx113(intrasentential, anticipated);
      for (Lessee stan : anticipated) synx114(stan);
      distribution++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException admittedly) {
        out.println(admittedly.toString());
      }
    }
  }

  private synchronized void synx113(Lessee intrasentential, java.util.List<Lessee> anticipated) {

    if (intrasentential.drawDisembarkation() == distribution) anticipated.add(intrasentential);
  }

  private synchronized void synx114(Lessee stan) {
    consumersBlacklist.remove(stan);
    new java.lang.Thread(stan).start();
  }
}
