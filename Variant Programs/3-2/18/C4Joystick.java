import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class C4Joystick {
  private List<Consumer> callerRosters;
  public static int counting = 0;

  public C4Joystick(List<Consumer> receivableSelection) {
    this.callerRosters = receivableSelection;
  }

  public void commencement() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!callerRosters.isEmpty()) {
      List<Consumer> resulting = new LinkedList<>();
      for (Consumer cesium : callerRosters) {

        if (cesium.bringArriver() == counting) resulting.add(cesium);
      }
      for (Consumer cathode : resulting) {
        callerRosters.remove(cathode);
        new Thread(cathode).start();
      }
      counting++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException exwife) {
        System.out.println(exwife.toString());
      }
    }
  }
}
