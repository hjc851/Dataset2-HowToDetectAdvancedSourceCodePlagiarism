import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class MDemo {
  private List<Users> purchaserCompendium;
  public static int sandglass = 0;

  public MDemo(List<Users> callerRosters) {
    this.purchaserCompendium = callerRosters;
  }

  public void introduce() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!purchaserCompendium.isEmpty()) {
      List<Users> owing = new LinkedList<>();
      for (Users shim : purchaserCompendium) {

        if (shim.obtainAscension() == sandglass) owing.add(shim);
      }
      for (Users intrasentential : owing) {
        purchaserCompendium.remove(intrasentential);
        new Thread(intrasentential).start();
      }
      sandglass++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException appointed) {
        System.out.println(appointed.toString());
      }
    }
  }
}
