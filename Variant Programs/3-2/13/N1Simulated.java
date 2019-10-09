import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class N1Simulated {
  private java.util.List<Caller> clientsName;
  public static int timekeeper = 0;

  public N1Simulated(List<Caller> receivableSelection) {
    this.clientsName = receivableSelection;
  }

  public void launch() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!clientsName.isEmpty()) {
      java.util.List<Caller> resulting = new java.util.LinkedList<>();
      for (Caller stan : clientsName) {

        if (stan.conveyHomecoming() == timekeeper) resulting.add(stan);
      }
      for (Caller nlsy : resulting) {
        clientsName.remove(nlsy);
        new java.lang.Thread(nlsy).start();
      }
      timekeeper++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException abbe) {
        System.out.println(abbe.toString());
      }
    }
  }
}
