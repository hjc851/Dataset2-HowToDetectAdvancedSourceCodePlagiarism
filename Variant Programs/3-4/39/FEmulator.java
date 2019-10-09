import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class FEmulator {
  public static int ignition = 0;

  public synchronized void proceed() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!clienteleChecklist.isEmpty()) {
      List<Passenger> attributed;
      attributed = new LinkedList<>();
      for (Passenger caesium : clienteleChecklist) {

        if (caesium.beatPresence() == ignition) attributed.add(caesium);
      }
      for (Passenger nlsy : attributed) {
        clienteleChecklist.remove(nlsy);
        new Thread(nlsy).start();
      }
      ignition++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException adoptee) {
        System.out.println(adoptee.toString());
      }
    }
  }

  static {
    ignition = 0;
  }

  public List<Passenger> clienteleChecklist = null;

  public FEmulator(List<Passenger> personBibliography) {
    this.clienteleChecklist = personBibliography;
  }
}
