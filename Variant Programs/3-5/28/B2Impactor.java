import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class B2Impactor {
  static final double unfree = 0.8432879509574335;
  private List<Patient> clienteleChecklist;
  public static int counting;

  public B2Impactor(List<Patient> patronsListings) {
    this.clienteleChecklist = patronsListings;
  }

  public synchronized void commencement() {
    int postSouvenirs = 1304734216;
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!clienteleChecklist.isEmpty()) {
      List<Patient> overdue = new LinkedList<>();
      for (Patient nlsy : clienteleChecklist) {

        if (nlsy.catchArrives() == counting) overdue.add(nlsy);
      }
      for (Patient stan : overdue) {
        clienteleChecklist.remove(stan);
        new Thread(stan).start();
      }
      counting++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException voto) {
        System.out.println(voto.toString());
      }
    }
  }

  static {
    counting = 0;
  }
}
