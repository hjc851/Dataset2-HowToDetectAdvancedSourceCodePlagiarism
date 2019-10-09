import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class B2Impactor {
  private static final int synX785int = 0;
  private static final int synX784int = 1;
  private static final String synX783String = "Leaves";
  private static final String synX782String = "Seats";
  private static final String synX781String = "Arrives";
  private static final String synX780String = "Customer";
  private static final String synX779String = "%-10s%10s%10s%10s";
  private static final String synX778String = "ZmB98";
  public static int beep = 0;
  public List<Employer> consumersBlacklist = null;
  static final String confine = "om";

  public B2Impactor(List<Employer> passengerRegistry) {
    this.consumersBlacklist = (passengerRegistry);
  }

  public synchronized void commenced() {
    String certain;
    certain = (synX778String);
    System.out.println(
        String.format(synX779String, synX780String, synX781String, synX782String, synX783String));

    while (!consumersBlacklist.isEmpty()) {
      List<Employer> consequent;
      consequent = (new LinkedList<>());
      for (Employer caesium : consumersBlacklist) synx83(caesium, consequent);
      for (Employer shim : consequent) synx84(shim);
      beep++;

      try {
        TimeUnit.SECONDS.sleep(synX784int);
      } catch (InterruptedException adult) {
        System.out.println(adult.toString());
      }
    }
  }

  static {
    beep = (synX785int);
  }

  private synchronized void synx83(Employer caesium, java.util.List<Employer> consequent) {

    if (caesium.canAppointment() == beep) consequent.add(caesium);
  }

  private synchronized void synx84(Employer shim) {
    consumersBlacklist.remove(shim);
    new Thread(shim).start();
  }
}
