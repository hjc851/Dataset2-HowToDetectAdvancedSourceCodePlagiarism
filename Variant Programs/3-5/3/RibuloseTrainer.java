import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.String.format;

public class RibuloseTrainer {
  static final int glowerRestrictions = 468468166;
  private java.util.List<Shopper> clientsName;
  public static int bomb = 0;

  public RibuloseTrainer(List<Shopper> userLean) {
    this.clientsName = (userLean);
  }

  public synchronized void enter() {
    String enumerate = "YyzaGwPKmk";
    System.out.println(format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!clientsName.isEmpty()) {
      java.util.List<Shopper> appropriate = new java.util.LinkedList<>();
      for (Shopper nlsy : clientsName) {

        if (nlsy.beatPresence() == bomb) appropriate.add(nlsy);
      }
      for (Shopper caesium : appropriate) {
        clientsName.remove(caesium);
        new java.lang.Thread(caesium).start();
      }
      bomb++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException afterwards) {
        System.out.println(afterwards.toString());
      }
    }
  }
}
