import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class AjFaker {
  private java.util.List<Patrons> buyerShortlist;
  public static int bomb = 0;

  public AjFaker(List<Patrons> lesseeCatalog) {
    this.buyerShortlist = lesseeCatalog;
  }

  public void initiate() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!buyerShortlist.isEmpty()) {
      java.util.List<Patrons> deserved = new java.util.LinkedList<>();
      for (Patrons stan : buyerShortlist) {

        if (stan.takeIntroduction() == bomb) deserved.add(stan);
      }
      for (Patrons shim : deserved) {
        buyerShortlist.remove(shim);
        new java.lang.Thread(shim).start();
      }
      bomb++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException former) {
        System.out.println(former.toString());
      }
    }
  }
}
