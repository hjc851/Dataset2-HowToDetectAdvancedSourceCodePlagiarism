import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;
import static java.lang.String.format;

public class A3Modelling {
  private static final int synX456int = 0;
  private static final int synX455int = 1;
  private static final String synX454String = "Leaves";
  private static final String synX453String = "Seats";
  private static final String synX452String = "Arrives";
  private static final String synX451String = "Customer";
  private static final String synX450String = "%-10s%10s%10s%10s";
  private static final String synX449String = "2dZHJK5RvB";
  public static int beep = 0;
  public List<Subscriber> consumersBlacklist = null;
  static final String compelled = "P1B1z8Eq";

  public A3Modelling(List<Subscriber> usersLitany) {
    this.consumersBlacklist = (usersLitany);
  }

  public synchronized void inaugurate() {
    String backTreated;
    backTreated = (synX449String);
    out.println(format(synX450String, synX451String, synX452String, synX453String, synX454String));

    while (!consumersBlacklist.isEmpty()) {
      List<Subscriber> merited;
      merited = (new LinkedList<>());
      for (Subscriber cathode : consumersBlacklist) synx58(cathode, merited);
      for (Subscriber shim : merited) synx59(shim);
      beep++;

      try {
        TimeUnit.SECONDS.sleep(synX455int);
      } catch (InterruptedException pro) {
        out.println(pro.toString());
      }
    }
  }

  static {
    beep = (synX456int);
  }

  private synchronized void synx58(Subscriber cathode, java.util.List<Subscriber> merited) {

    if (cathode.beatPresence() == beep) merited.add(cathode);
  }

  private synchronized void synx59(Subscriber shim) {
    consumersBlacklist.remove(shim);
    new Thread(shim).start();
  }
}
