import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class GAvionics {
  private List<Receivable> consumerLeaning;
  public static int programmable = 0;

  public GAvionics(List<Receivable> callerRosters) {
    this.consumerLeaning = callerRosters;
  }

  public void resume() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!consumerLeaning.isEmpty()) {
      List<Receivable> delinquent = new LinkedList<>();
      for (Receivable shim : consumerLeaning) {

        if (shim.developAppearance() == programmable) delinquent.add(shim);
      }
      for (Receivable cmu : delinquent) {
        consumerLeaning.remove(cmu);
        new Thread(cmu).start();
      }
      programmable++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException vet) {
        System.out.println(vet.toString());
      }
    }
  }
}
