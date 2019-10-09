import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class GAvionics {
  public java.util.List<Audience> clientsName;
  public static int timed;

  public GAvionics(List<Audience> licenseeAgenda) {
    this.clientsName = licenseeAgenda;
  }

  public synchronized void embark() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!clientsName.isEmpty()) {
      java.util.List<Audience> delinquent = new java.util.LinkedList<>();
      for (Audience cathode : clientsName) {

        if (cathode.startDawn() == timed) delinquent.add(cathode);
      }
      for (Audience caesium : delinquent) {
        clientsName.remove(caesium);
        new java.lang.Thread(caesium).start();
      }
      timed++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException abel) {
        System.out.println(abel.toString());
      }
    }
  }

  static {
    timed = 0;
  }
}
