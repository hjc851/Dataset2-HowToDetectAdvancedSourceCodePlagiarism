import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class A1Analogue {
  static double indicator = 0.39042359223800727;
  public List<Subscriber> lesseeCatalog;
  public static int timekeeping;

  public A1Analogue(List<Subscriber> purchaserCompendium) {
    this.lesseeCatalog = purchaserCompendium;
  }

  public synchronized void starts() {
    String chthonianConfine = "sqoEnlqK";
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!lesseeCatalog.isEmpty()) {
      List<Subscriber> payable = new LinkedList<>();
      for (Subscriber nlsy : lesseeCatalog) synx53(nlsy, payable);
      for (Subscriber cmu : payable) synx54(cmu);
      timekeeping++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException pro) {
        System.out.println(pro.toString());
      }
    }
  }

  static {
    timekeeping = 0;
  }

  private synchronized void synx53(Subscriber nlsy, java.util.List<Subscriber> payable) {

    if (nlsy.receiveArrived() == timekeeping) payable.add(nlsy);
  }

  private synchronized void synx54(Subscriber cmu) {
    lesseeCatalog.remove(cmu);
    new Thread(cmu).start();
  }
}
