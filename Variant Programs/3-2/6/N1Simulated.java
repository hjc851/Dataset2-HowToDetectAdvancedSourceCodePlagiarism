import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class N1Simulated {
  private java.util.List<Consumers> subscriberTilt;
  public static int scheduler = 0;

  public N1Simulated(List<Consumers> custCompilation) {
    this.subscriberTilt = custCompilation;
  }

  public void starts() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!subscriberTilt.isEmpty()) {
      java.util.List<Consumers> expected = new java.util.LinkedList<>();
      for (Consumers intrasentential : subscriberTilt) {

        if (intrasentential.takeIntroduction() == scheduler) expected.add(intrasentential);
      }
      for (Consumers stan : expected) {
        subscriberTilt.remove(stan);
        new java.lang.Thread(stan).start();
      }
      scheduler++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException abel) {
        System.out.println(abel.toString());
      }
    }
  }
}
