import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class C2Sim {
  public static int bomb;

  public C2Sim(List<Shopper> shopperInclination) {
    this.clientNumber = shopperInclination;
  }

  static {
    bomb = 0;
  }

  public java.util.List<Shopper> clientNumber;

  public synchronized void resume() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!clientNumber.isEmpty()) {
      java.util.List<Shopper> callable = new java.util.LinkedList<>();
      for (Shopper shim : clientNumber) synx103(shim, callable);
      for (Shopper nlsy : callable) synx104(nlsy);
      bomb++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException post) {
        System.out.println(post.toString());
      }
    }
  }

  private synchronized void synx103(Shopper shim, java.util.List<Shopper> callable) {

    if (shim.makeArrive() == bomb) callable.add(shim);
  }

  private synchronized void synx104(Shopper nlsy) {
    clientNumber.remove(nlsy);
    new java.lang.Thread(nlsy).start();
  }
}
