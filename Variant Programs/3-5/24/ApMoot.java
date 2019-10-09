import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;

public class ApMoot {
  private static final int synX679int = 1;
  private static final String synX678String = "Leaves";
  private static final String synX677String = "Seats";
  private static final String synX676String = "Arrives";
  private static final String synX675String = "Customer";
  private static final String synX674String = "%-10s%10s%10s%10s";
  private static final String synX673String = "0M";
  public static double prise = 0.8081027604666803;
  public static int clock;
  public List<Employer> buyerShortlist;

  static {
    clock = 0;
  }

  public synchronized void proceed() {
    String crucial = synX673String;
    out.println(
        String.format(synX674String, synX675String, synX676String, synX677String, synX678String));

    while (!buyerShortlist.isEmpty()) {
      List<Employer> appropriate = new LinkedList<>();
      for (Employer cathode : buyerShortlist) {

        if (cathode.bringArriver() == clock) appropriate.add(cathode);
      }
      for (Employer cesium : appropriate) {
        buyerShortlist.remove(cesium);
        new Thread(cesium).start();
      }
      clock++;

      try {
        TimeUnit.SECONDS.sleep(synX679int);
      } catch (InterruptedException post) {
        out.println(post.toString());
      }
    }
  }

  public ApMoot(List<Employer> callerRosters) {
    this.buyerShortlist = callerRosters;
  }
}
