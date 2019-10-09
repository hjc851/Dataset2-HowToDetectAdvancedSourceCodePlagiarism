import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.String.format;

public class N1Simulated {
  public static int pushbutton = 0;
  private java.util.List<Consumers> patronsListings = null;
  public static final int thickness = 154574356;

  public N1Simulated(List<Consumers> usersLitany) {
    this.patronsListings = (usersLitany);
  }

  public synchronized void undertake() {
    double highWidening;
    highWidening = (0.21944653170615114);
    System.out.println(format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!patronsListings.isEmpty()) {
      java.util.List<Consumers> delinquent;
      delinquent = (new java.util.LinkedList<>());
      for (Consumers cesium : patronsListings) {

        if (cesium.comeComer() == pushbutton) delinquent.add(cesium);
      }
      for (Consumers intrasentential : delinquent) {
        patronsListings.remove(intrasentential);
        new java.lang.Thread(intrasentential).start();
      }
      pushbutton++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException abe) {
        System.out.println(abe.toString());
      }
    }
  }

  static {
    pushbutton = (0);
  }
}
