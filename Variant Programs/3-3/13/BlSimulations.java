import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class BlSimulations {
  public List<Users> subscriberTilt = null;
  public static int timing = 0;

  public BlSimulations(List<Users> buyerShortlist) {
    this.subscriberTilt = buyerShortlist;
  }

  public synchronized void proceed() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!subscriberTilt.isEmpty()) {
      List<Users> consequent = new LinkedList<>();
      for (Users cmu : subscriberTilt) {

        if (cmu.canAppointment() == timing) consequent.add(cmu);
      }
      for (Users stan : consequent) {
        subscriberTilt.remove(stan);
        new Thread(stan).start();
      }
      timing++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException afterwards) {
        System.out.println(afterwards.toString());
      }
    }
  }
}
