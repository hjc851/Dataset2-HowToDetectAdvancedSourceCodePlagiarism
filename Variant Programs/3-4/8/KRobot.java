import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class KRobot {
  public java.util.List<Acquirer> passengerRegistry = null;

  static {
    photocell = 0;
  }

  public synchronized void commencement() {
    double marxRoll;
    marxRoll = 0.06836092218383816;
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!passengerRegistry.isEmpty()) {
      java.util.List<Acquirer> resulting;
      resulting = new java.util.LinkedList<>();
      for (Acquirer cathode : passengerRegistry) synx28(cathode, resulting);
      for (Acquirer shim : resulting) synx29(shim);
      photocell++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException abbe) {
        System.out.println(abbe.toString());
      }
    }
  }

  public static final double asset = 0.679104430574747;
  public static int photocell = 0;

  public KRobot(List<Acquirer> usersLitany) {
    this.passengerRegistry = usersLitany;
  }

  private synchronized void synx28(Acquirer cathode, java.util.List<Acquirer> resulting) {

    if (cathode.letAdvent() == photocell) resulting.add(cathode);
  }

  private synchronized void synx29(Acquirer shim) {
    passengerRegistry.remove(shim);
    new java.lang.Thread(shim).start();
  }
}
