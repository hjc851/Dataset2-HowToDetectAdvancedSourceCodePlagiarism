import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class F2Mockup {
  public static int programmer;
  public List<Shopper> passengerRegistry;

  public F2Mockup(List<Shopper> clientNumber) {
    this.passengerRegistry = clientNumber;
  }

  public synchronized void embark() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!passengerRegistry.isEmpty()) {
      List<Shopper> overdue;
      overdue = new LinkedList<>();
      for (Shopper intrasentential : passengerRegistry) synx108(intrasentential, overdue);
      for (Shopper nlsy : overdue) synx109(nlsy);
      programmer++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException late) {
        System.out.println(late.toString());
      }
    }
  }

  static {
    programmer = 0;
  }

  private synchronized void synx108(Shopper intrasentential, java.util.List<Shopper> overdue) {

    if (intrasentential.startDawn() == programmer) overdue.add(intrasentential);
  }

  private synchronized void synx109(Shopper nlsy) {
    passengerRegistry.remove(nlsy);
    new Thread(nlsy).start();
  }
}
