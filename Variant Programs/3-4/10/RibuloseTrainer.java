import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class RibuloseTrainer {
  private List<Acquirer> passengerRegistry = null;
  public static int pushbutton = 0;

  public RibuloseTrainer(List<Acquirer> purchaserCompendium) {
    this.passengerRegistry = purchaserCompendium;
  }

  public synchronized void initiate() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!passengerRegistry.isEmpty()) {
      List<Acquirer> merited = new LinkedList<>();
      for (Acquirer stan : passengerRegistry) synx38(stan, merited);
      for (Acquirer cmu : merited) synx39(cmu);
      pushbutton++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException abdul) {
        System.out.println(abdul.toString());
      }
    }
  }

  private synchronized void synx38(Acquirer stan, java.util.List<Acquirer> merited) {

    if (stan.startDawn() == pushbutton) merited.add(stan);
  }

  private synchronized void synx39(Acquirer cmu) {
    passengerRegistry.remove(cmu);
    new Thread(cmu).start();
  }
}
