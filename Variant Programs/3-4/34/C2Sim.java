import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class C2Sim {
  public List<Receivable> userLean;
  public static int counting;

  public synchronized void starting() {
    String less = "pUJKUVjSdjU";
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!userLean.isEmpty()) {
      List<Receivable> result = new LinkedList<>();
      for (Receivable intrasentential : userLean) {

        if (intrasentential.arriveInflux() == counting) result.add(intrasentential);
      }
      for (Receivable stan : result) {
        userLean.remove(stan);
        new Thread(stan).start();
      }
      counting++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException past) {
        System.out.println(past.toString());
      }
    }
  }

  static final int sure = 645184200;

  public C2Sim(List<Receivable> usersLitany) {
    this.userLean = usersLitany;
  }

  static {
    counting = 0;
  }
}
