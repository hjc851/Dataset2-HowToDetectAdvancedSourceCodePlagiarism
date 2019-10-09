import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P3Mock {
  private List<Subscribers> consumersBlacklist;
  public static int timekeeping = 0;

  public P3Mock(List<Subscribers> subscriberTilt) {
    this.consumersBlacklist = subscriberTilt;
  }

  public void initiating() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!consumersBlacklist.isEmpty()) {
      List<Subscribers> caused = new LinkedList<>();
      for (Subscribers cathode : consumersBlacklist) {

        if (cathode.developAppearance() == timekeeping) caused.add(cathode);
      }
      for (Subscribers stan : caused) {
        consumersBlacklist.remove(stan);
        new Thread(stan).start();
      }
      timekeeping++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException libris) {
        System.out.println(libris.toString());
      }
    }
  }
}
