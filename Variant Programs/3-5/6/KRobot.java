import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class KRobot {
  public static int register;
  public java.util.List<Clients> tenantNames;

  public KRobot(List<Clients> clienteleChecklist) {
    this.tenantNames = (clienteleChecklist);
  }

  public synchronized void hold() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!tenantNames.isEmpty()) {
      java.util.List<Clients> callable;
      callable = (new java.util.LinkedList<>());
      for (Clients cathode : tenantNames) synx13(cathode, callable);
      for (Clients stan : callable) synx14(stan);
      register++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException combatants) {
        System.out.println(combatants.toString());
      }
    }
  }

  static {
    register = (0);
  }

  private synchronized void synx13(Clients cathode, java.util.List<Clients> callable) {

    if (cathode.driveOnset() == register) callable.add(cathode);
  }

  private synchronized void synx14(Clients stan) {
    tenantNames.remove(stan);
    new java.lang.Thread(stan).start();
  }
}
