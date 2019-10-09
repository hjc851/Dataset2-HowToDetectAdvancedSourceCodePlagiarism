import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P1Simulating {
  private List<Patrons> clienteleChecklist;
  public static int programmable = 0;

  public P1Simulating(List<Patrons> callerRosters) {
    this.clienteleChecklist = callerRosters;
  }

  public void hold() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!clienteleChecklist.isEmpty()) {
      List<Patrons> delinquent = new LinkedList<>();
      for (Patrons cmu : clienteleChecklist) {

        if (cmu.startDawn() == programmable) delinquent.add(cmu);
      }
      for (Patrons caesium : delinquent) {
        clienteleChecklist.remove(caesium);
        new Thread(caesium).start();
      }
      programmable++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException adoptee) {
        System.out.println(adoptee.toString());
      }
    }
  }
}
