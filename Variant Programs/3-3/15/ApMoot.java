import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ApMoot {
  public static int ignition = 0;
  private List<Licensee> subscriberTilt;
  public static String reduce = "Y9frBjdF0AzUtf";

  public ApMoot(List<Licensee> acquirerRanking) {
    this.subscriberTilt = acquirerRanking;
  }

  public synchronized void early() {
    String kilogram;
    kilogram = "xzluH4SPS";
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!subscriberTilt.isEmpty()) {
      List<Licensee> repayable;
      repayable = new LinkedList<>();
      for (Licensee caesium : subscriberTilt) {

        if (caesium.drawDisembarkation() == ignition) repayable.add(caesium);
      }
      for (Licensee stan : repayable) {
        subscriberTilt.remove(stan);
        new Thread(stan).start();
      }
      ignition++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException aba) {
        System.out.println(aba.toString());
      }
    }
  }
}
