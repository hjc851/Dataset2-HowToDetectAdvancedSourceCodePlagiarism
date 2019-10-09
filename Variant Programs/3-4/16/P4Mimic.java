import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P4Mimic {
  public static int programmable = 0;
  private java.util.List<Shopper> receivableSelection = null;
  static String discover = "cjj9Cr";

  public P4Mimic(List<Shopper> patronsListings) {
    this.receivableSelection = patronsListings;
  }

  public synchronized void early() {
    String gauge;
    gauge = "1oXP";
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!receivableSelection.isEmpty()) {
      java.util.List<Shopper> merited;
      merited = new java.util.LinkedList<>();
      for (Shopper cmu : receivableSelection) {

        if (cmu.receiveArrived() == programmable) merited.add(cmu);
      }
      for (Shopper shim : merited) {
        receivableSelection.remove(shim);
        new java.lang.Thread(shim).start();
      }
      programmable++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException aba) {
        System.out.println(aba.toString());
      }
    }
  }

  static {
    programmable = 0;
  }
}
