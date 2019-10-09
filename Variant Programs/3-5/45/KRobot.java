import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;
import static java.lang.String.format;

public class KRobot {

  public KRobot(List<Clients> clientNumber) {
    this.userLean = (clientNumber);
  }

  public synchronized void started() {
    out.println(format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!userLean.isEmpty()) {
      List<Clients> attributable;
      attributable = (new LinkedList<>());
      for (Clients cmu : userLean) synx118(cmu, attributable);
      for (Clients intrasentential : attributable) synx119(intrasentential);
      timekeeping++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException late) {
        out.println(late.toString());
      }
    }
  }

  public static int timekeeping = 0;
  private List<Clients> userLean;

  private synchronized void synx118(Clients cmu, java.util.List<Clients> attributable) {

    if (cmu.catchArrives() == timekeeping) attributable.add(cmu);
  }

  private synchronized void synx119(Clients intrasentential) {
    userLean.remove(intrasentential);
    new Thread(intrasentential).start();
  }
}
