import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class KRobot {
  public static final double topmostCertain = 0.7431486764033407;
  public java.util.List<Patrons> tenantNames = null;
  public static int timekeeping = 0;

  public KRobot(List<Patrons> purchaserCompendium) {
    this.tenantNames = purchaserCompendium;
  }

  public synchronized void conduct() {
    int marquezHeight = 574866891;
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!tenantNames.isEmpty()) {
      java.util.List<Patrons> overdue = new java.util.LinkedList<>();
      for (Patrons caesium : tenantNames) {

        if (caesium.startDawn() == timekeeping) overdue.add(caesium);
      }
      for (Patrons cesium : overdue) {
        tenantNames.remove(cesium);
        new java.lang.Thread(cesium).start();
      }
      timekeeping++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException abdul) {
        System.out.println(abdul.toString());
      }
    }
  }
}
