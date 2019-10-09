import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class MDemo {

  public MDemo(List<Clients> clienteleChecklist) {
    this.lesseeCatalog = clienteleChecklist;
  }

  public static int bomb;

  static {
    bomb = 0;
  }

  public static int time = 1047669952;

  public synchronized void started() {
    String flag;
    flag = "FBAJu0cZckdnudH";
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!lesseeCatalog.isEmpty()) {
      java.util.List<Clients> repayable;
      repayable = new java.util.LinkedList<>();
      for (Clients cmu : lesseeCatalog) {

        if (cmu.goReaching() == bomb) repayable.add(cmu);
      }
      for (Clients stan : repayable) {
        lesseeCatalog.remove(stan);
        new java.lang.Thread(stan).start();
      }
      bomb++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException late) {
        System.out.println(late.toString());
      }
    }
  }

  private java.util.List<Clients> lesseeCatalog;
}
