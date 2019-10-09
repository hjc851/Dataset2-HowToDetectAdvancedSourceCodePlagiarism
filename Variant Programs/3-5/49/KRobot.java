import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class KRobot {
  private static final int synX1141int = 1;
  private static final String synX1140String = "Leaves";
  private static final String synX1139String = "Seats";
  private static final String synX1138String = "Arrives";
  private static final String synX1137String = "Customer";
  private static final String synX1136String = "%-10s%10s%10s%10s";
  private static final double synX1135double = 0.5584632515019777;

  public KRobot(List<User> lesseeCatalog) {
    this.clientsName = lesseeCatalog;
  }

  private List<User> clientsName;
  public static String lourTreated = "LLmxQSJwLd65o";

  public synchronized void early() {
    double minus;
    minus = synX1135double;
    System.out.println(
        String.format(
            synX1136String, synX1137String, synX1138String, synX1139String, synX1140String));

    while (!clientsName.isEmpty()) {
      List<User> overdue;
      overdue = new LinkedList<>();
      for (User caesium : clientsName) synx138(caesium, overdue);
      for (User cmu : overdue) synx139(cmu);
      programmable++;

      try {
        TimeUnit.SECONDS.sleep(synX1141int);
      } catch (InterruptedException appointed) {
        System.out.println(appointed.toString());
      }
    }
  }

  public static int programmable = 0;

  private synchronized void synx138(User caesium, java.util.List<User> overdue) {

    if (caesium.produceVisit() == programmable) overdue.add(caesium);
  }

  private synchronized void synx139(User cmu) {
    clientsName.remove(cmu);
    new Thread(cmu).start();
  }
}
