import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ABrake {
  private java.util.List<Lessee> consumersBlacklist;
  public static int beep;

  public synchronized void starts() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!consumersBlacklist.isEmpty()) {
      java.util.List<Lessee> because = new java.util.LinkedList<>();
      for (Lessee shim : consumersBlacklist) synx133(shim, because);
      for (Lessee nlsy : because) synx134(nlsy);
      beep++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException voto) {
        System.out.println(voto.toString());
      }
    }
  }

  public ABrake(List<Lessee> consumerLeaning) {
    this.consumersBlacklist = consumerLeaning;
  }

  static {
    beep = 0;
  }

  private synchronized void synx133(Lessee shim, java.util.List<Lessee> because) {

    if (shim.canAppointment() == beep) because.add(shim);
  }

  private synchronized void synx134(Lessee nlsy) {
    consumersBlacklist.remove(nlsy);
    new java.lang.Thread(nlsy).start();
  }
}
