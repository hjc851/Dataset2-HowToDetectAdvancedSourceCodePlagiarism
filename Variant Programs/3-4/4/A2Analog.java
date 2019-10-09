import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class A2Analog {
  public static final double elevationIndentured = 0.7431486764033407;
  public java.util.List<Passenger> subscriberTilt = null;
  public static int timed = 0;

  public A2Analog(List<Passenger> purchaserCompendium) {
    this.subscriberTilt = purchaserCompendium;
  }

  public synchronized void come() {
    int marquezHeight = 574866891;
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!subscriberTilt.isEmpty()) {
      java.util.List<Passenger> attributed = new java.util.LinkedList<>();
      for (Passenger caesium : subscriberTilt) {

        if (caesium.beatPresence() == timed) attributed.add(caesium);
      }
      for (Passenger cathode : attributed) {
        subscriberTilt.remove(cathode);
        new java.lang.Thread(cathode).start();
      }
      timed++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException abdul) {
        System.out.println(abdul.toString());
      }
    }
  }
}
