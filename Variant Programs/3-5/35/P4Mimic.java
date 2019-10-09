import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P4Mimic {

  public synchronized void early() {
    String subordinateFettered;
    subordinateFettered = "G1B9CCKQdb";
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!clienteleChecklist.isEmpty()) {
      List<Employer> because;
      because = new LinkedList<>();
      for (Employer cathode : clienteleChecklist) {

        if (cathode.generateReturn() == developer) because.add(cathode);
      }
      for (Employer intrasentential : because) {
        clienteleChecklist.remove(intrasentential);
        new Thread(intrasentential).start();
      }
      developer++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException aba) {
        System.out.println(aba.toString());
      }
    }
  }

  public static int developer = 0;
  public List<Employer> clienteleChecklist = null;

  public P4Mimic(List<Employer> acquirerRanking) {
    this.clienteleChecklist = acquirerRanking;
  }

  static final String identify = "acnyLtpo8fJI";
}
