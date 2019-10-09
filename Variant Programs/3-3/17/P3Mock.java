import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P3Mock {
  public static int obligated = -1324180708;
  public List<User> clienteleChecklist = null;
  public static int scheduler = 0;

  public P3Mock(List<User> purchaserCompendium) {
    this.clienteleChecklist = purchaserCompendium;
  }

  public synchronized void commencing() {
    int greatestFatty = 1213265;
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!clienteleChecklist.isEmpty()) {
      List<User> receivable = new LinkedList<>();
      for (User caesium : clienteleChecklist) {

        if (caesium.developAppearance() == scheduler) receivable.add(caesium);
      }
      for (User stan : receivable) {
        clienteleChecklist.remove(stan);
        new Thread(stan).start();
      }
      scheduler++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException former) {
        System.out.println(former.toString());
      }
    }
  }
}
