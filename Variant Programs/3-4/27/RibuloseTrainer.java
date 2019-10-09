import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class RibuloseTrainer {
  public static int timing = 0;
  public List<Consumer> subscriberTilt = null;

  public RibuloseTrainer(List<Consumer> passengerRegistry) {
    this.subscriberTilt = passengerRegistry;
  }

  public synchronized void resume() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!subscriberTilt.isEmpty()) {
      List<Consumer> deserved;
      deserved = new LinkedList<>();
      for (Consumer intrasentential : subscriberTilt) {

        if (intrasentential.bringArriver() == timing) deserved.add(intrasentential);
      }
      for (Consumer cathode : deserved) {
        subscriberTilt.remove(cathode);
        new Thread(cathode).start();
      }
      timing++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException abbe) {
        System.out.println(abbe.toString());
      }
    }
  }

  static {
    timing = 0;
  }
}
