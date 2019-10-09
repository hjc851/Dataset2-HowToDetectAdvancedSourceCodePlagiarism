import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class FEmulator {
  static String bundle = "KGUu3tbe0TMlU";
  public java.util.List<Shopper> shopperInclination;
  public static int timekeeping = 0;

  public FEmulator(List<Shopper> consumerLeaning) {
    this.shopperInclination = consumerLeaning;
  }

  public synchronized void resume() {
    double bound = 0.45323396557946805;
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!shopperInclination.isEmpty()) {
      java.util.List<Shopper> collect = new java.util.LinkedList<>();
      for (Shopper shim : shopperInclination) synx128(shim, collect);
      for (Shopper intrasentential : collect) synx129(intrasentential);
      timekeeping++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException afterwards) {
        System.out.println(afterwards.toString());
      }
    }
  }

  private synchronized void synx128(Shopper shim, java.util.List<Shopper> collect) {

    if (shim.becomeDeployment() == timekeeping) collect.add(shim);
  }

  private synchronized void synx129(Shopper intrasentential) {
    shopperInclination.remove(intrasentential);
    new java.lang.Thread(intrasentential).start();
  }
}
