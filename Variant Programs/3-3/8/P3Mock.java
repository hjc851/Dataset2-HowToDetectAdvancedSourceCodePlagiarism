import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P3Mock {
  private List<Receivable> userLean;
  public static int clocking;

  public P3Mock(List<Receivable> subscribersDirectory) {
    this.userLean = subscribersDirectory;
  }

  public synchronized void starting() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!userLean.isEmpty()) {
      List<Receivable> result = new LinkedList<>();
      for (Receivable cathode : userLean) {

        if (cathode.letAdvent() == clocking) result.add(cathode);
      }
      for (Receivable stan : result) {
        userLean.remove(stan);
        new Thread(stan).start();
      }
      clocking++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException post) {
        System.out.println(post.toString());
      }
    }
  }

  static {
    clocking = 0;
  }
}
