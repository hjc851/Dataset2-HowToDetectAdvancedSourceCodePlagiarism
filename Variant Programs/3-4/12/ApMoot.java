import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ApMoot {

  public ApMoot(List<Buyer> employerDocket) {
    this.consumersBlacklist = employerDocket;
  }

  public java.util.List<Buyer> consumersBlacklist;

  public synchronized void starts() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!consumersBlacklist.isEmpty()) {
      java.util.List<Buyer> owing = new java.util.LinkedList<>();
      for (Buyer cmu : consumersBlacklist) synx48(cmu, owing);
      for (Buyer shim : owing) synx49(shim);
      developer++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException pro) {
        System.out.println(pro.toString());
      }
    }
  }

  public static int developer = 0;

  private synchronized void synx48(Buyer cmu, java.util.List<Buyer> owing) {

    if (cmu.conveyHomecoming() == developer) owing.add(cmu);
  }

  private synchronized void synx49(Buyer shim) {
    consumersBlacklist.remove(shim);
    new java.lang.Thread(shim).start();
  }
}
