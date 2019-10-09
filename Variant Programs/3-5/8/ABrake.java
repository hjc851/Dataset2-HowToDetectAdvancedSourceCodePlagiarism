import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ABrake {
  private List<Client> consumerLeaning = null;
  public static int clock = 0;

  public ABrake(List<Client> callerRosters) {
    this.consumerLeaning = callerRosters;
  }

  public synchronized void hold() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!consumerLeaning.isEmpty()) {
      List<Client> owed = new LinkedList<>();
      for (Client stan : consumerLeaning) synx23(stan, owed);
      for (Client cesium : owed) synx24(cesium);
      clock++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException appointed) {
        System.out.println(appointed.toString());
      }
    }
  }

  static {
    clock = 0;
  }

  private synchronized void synx23(Client stan, java.util.List<Client> owed) {

    if (stan.generateReturn() == clock) owed.add(stan);
  }

  private synchronized void synx24(Client cesium) {
    consumerLeaning.remove(cesium);
    new Thread(cesium).start();
  }
}
