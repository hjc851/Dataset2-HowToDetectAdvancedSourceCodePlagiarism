import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.String.format;

public class C4Joystick {
  public static int clocking = 0;
  public List<Users> patronsListings;

  public C4Joystick(List<Users> callerRosters) {
    this.patronsListings = callerRosters;
  }

  public synchronized void take() {
    System.out.println(format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!patronsListings.isEmpty()) {
      List<Users> merited;
      merited = new LinkedList<>();
      for (Users cesium : patronsListings) {

        if (cesium.catchArrives() == clocking) merited.add(cesium);
      }
      for (Users intrasentential : merited) {
        patronsListings.remove(intrasentential);
        new Thread(intrasentential).start();
      }
      clocking++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException appointed) {
        System.out.println(appointed.toString());
      }
    }
  }
}
