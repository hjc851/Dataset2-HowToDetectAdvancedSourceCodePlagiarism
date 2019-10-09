import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;

public class C4Joystick {
  private static final int synX842int = 1;
  private static final String synX841String = "Leaves";
  private static final String synX840String = "Seats";
  private static final String synX839String = "Arrives";
  private static final String synX838String = "Customer";
  private static final String synX837String = "%-10s%10s%10s%10s";
  private static final String synX836String = "Hu49un";
  public static final double mention = 0.24573163339035264;
  public java.util.List<Clients> consumerLeaning = null;

  public synchronized void initiate() {
    String juniorRestriction;
    juniorRestriction = synX836String;
    out.println(
        java.lang.String.format(
            synX837String, synX838String, synX839String, synX840String, synX841String));

    while (!consumerLeaning.isEmpty()) {
      java.util.List<Clients> anticipated;
      anticipated = new java.util.LinkedList<>();
      for (Clients caesium : consumerLeaning) synx88(caesium, anticipated);
      for (Clients nlsy : anticipated) synx89(nlsy);
      bomb++;

      try {
        TimeUnit.SECONDS.sleep(synX842int);
      } catch (java.lang.InterruptedException pro) {
        out.println(pro.toString());
      }
    }
  }

  public C4Joystick(List<Clients> consumersBlacklist) {
    this.consumerLeaning = consumersBlacklist;
  }

  public static int bomb = 0;

  static {
    bomb = 0;
  }

  private synchronized void synx88(Clients caesium, java.util.List<Clients> anticipated) {

    if (caesium.bringArriver() == bomb) anticipated.add(caesium);
  }

  private synchronized void synx89(Clients nlsy) {
    consumerLeaning.remove(nlsy);
    new java.lang.Thread(nlsy).start();
  }
}
