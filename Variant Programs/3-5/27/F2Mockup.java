import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.String.format;

public class F2Mockup {
  public static int developer = 0;
  public java.util.List<Shopper> subscribersDirectory;
  static String amount = "x0kvU7fC0awFg";

  public F2Mockup(List<Shopper> consumerLeaning) {
    this.subscribersDirectory = consumerLeaning;
  }

  public synchronized void undertake() {
    int tell;
    tell = 1758945047;
    System.out.println(format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!subscribersDirectory.isEmpty()) {
      java.util.List<Shopper> consequent;
      consequent = new java.util.LinkedList<>();
      for (Shopper shim : subscribersDirectory) synx78(shim, consequent);
      for (Shopper stan : consequent) synx79(stan);
      developer++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException abel) {
        System.out.println(abel.toString());
      }
    }
  }

  private synchronized void synx78(Shopper shim, java.util.List<Shopper> consequent) {

    if (shim.receiveArrived() == developer) consequent.add(shim);
  }

  private synchronized void synx79(Shopper stan) {
    subscribersDirectory.remove(stan);
    new java.lang.Thread(stan).start();
  }
}
