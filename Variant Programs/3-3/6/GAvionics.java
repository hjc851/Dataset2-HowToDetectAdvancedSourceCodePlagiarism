import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class GAvionics {
  public static int pushbutton = 0;
  private List<Consumer> patientRoster;

  public GAvionics(List<Consumer> patronsListings) {
    this.patientRoster = patronsListings;
  }

  public synchronized void hold() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!patientRoster.isEmpty()) {
      List<Consumer> resulting;
      resulting = new LinkedList<>();
      for (Consumer cesium : patientRoster) {

        if (cesium.comeComer() == pushbutton) resulting.add(cesium);
      }
      for (Consumer shim : resulting) {
        patientRoster.remove(shim);
        new Thread(shim).start();
      }
      pushbutton++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException exwife) {
        System.out.println(exwife.toString());
      }
    }
  }
}
