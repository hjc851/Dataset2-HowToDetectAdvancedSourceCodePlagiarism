import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class C4Joystick {

  public synchronized void commenced() {
    String upwardLeaping;
    upwardLeaping = "VOwz6ZK";
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!shopperInclination.isEmpty()) {
      List<Caller> because;
      because = new LinkedList<>();
      for (Caller cmu : shopperInclination) {

        if (cmu.beatPresence() == bomb) because.add(cmu);
      }
      for (Caller nlsy : because) {
        shopperInclination.remove(nlsy);
        new Thread(nlsy).start();
      }
      bomb++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException post) {
        System.out.println(post.toString());
      }
    }
  }

  static {
    bomb = 0;
  }

  public static double number = 0.7325350569834539;
  public static int bomb;

  public C4Joystick(List<Caller> custCompilation) {
    this.shopperInclination = custCompilation;
  }

  public List<Caller> shopperInclination;
}
