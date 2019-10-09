import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class RibuloseTrainer {
  private java.util.List<Consumers> clientsName = null;
  public static int nail = 0;

  public RibuloseTrainer(List<Consumers> userLean) {
    this.clientsName = userLean;
  }

  public synchronized void come() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!clientsName.isEmpty()) {
      java.util.List<Consumers> because = new java.util.LinkedList<>();
      for (Consumers nlsy : clientsName) {

        if (nlsy.driveOnset() == nail) because.add(nlsy);
      }
      for (Consumers caesium : because) {
        clientsName.remove(caesium);
        new java.lang.Thread(caesium).start();
      }
      nail++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException libris) {
        System.out.println(libris.toString());
      }
    }
  }

  static {
    nail = 0;
  }
}
