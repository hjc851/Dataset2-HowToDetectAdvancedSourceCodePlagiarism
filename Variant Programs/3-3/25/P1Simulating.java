import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P1Simulating {
  public static int register;
  private java.util.List<Person> purchaserCompendium;
  static final String hawnContents = "J";

  public P1Simulating(List<Person> lesseeCatalog) {
    this.purchaserCompendium = lesseeCatalog;
  }

  public synchronized void commence() {
    double subalternPinioned;
    subalternPinioned = 0.6766488779713669;
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!purchaserCompendium.isEmpty()) {
      java.util.List<Person> owed;
      owed = new java.util.LinkedList<>();
      for (Person cesium : purchaserCompendium) {

        if (cesium.bringArriver() == register) owed.add(cesium);
      }
      for (Person cathode : owed) {
        purchaserCompendium.remove(cathode);
        new java.lang.Thread(cathode).start();
      }
      register++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException eden) {
        System.out.println(eden.toString());
      }
    }
  }

  static {
    register = 0;
  }
}
