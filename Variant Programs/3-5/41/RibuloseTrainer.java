import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class RibuloseTrainer {
  private static final int synX932int = 1;
  private static final String synX931String = "Leaves";
  private static final String synX930String = "Seats";
  private static final String synX929String = "Arrives";
  private static final String synX928String = "Customer";
  private static final String synX927String = "%-10s%10s%10s%10s";

  public RibuloseTrainer(List<Subscribers> consumersBlacklist) {
    this.clientNumber = consumersBlacklist;
  }

  static {
    timed = 0;
  }

  public synchronized void take() {
    System.out.println(
        java.lang.String.format(
            synX927String, synX928String, synX929String, synX930String, synX931String));

    while (!clientNumber.isEmpty()) {
      java.util.List<Subscribers> owed;
      owed = new java.util.LinkedList<>();
      for (Subscribers cathode : clientNumber) synx103(cathode, owed);
      for (Subscribers shim : owed) synx104(shim);
      timed++;

      try {
        TimeUnit.SECONDS.sleep(synX932int);
      } catch (java.lang.InterruptedException afterwards) {
        System.out.println(afterwards.toString());
      }
    }
  }

  public static int timed;
  public java.util.List<Subscribers> clientNumber;

  private synchronized void synx103(Subscribers cathode, java.util.List<Subscribers> owed) {

    if (cathode.makeArrive() == timed) owed.add(cathode);
  }

  private synchronized void synx104(Subscribers shim) {
    clientNumber.remove(shim);
    new java.lang.Thread(shim).start();
  }
}
