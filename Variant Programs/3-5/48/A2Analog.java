import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;

public class A2Analog {
  public static int distribution = 0;
  private java.util.List<Clients> tenantNames = null;

  public A2Analog(List<Clients> audiencePlaylist) {
    this.tenantNames = (audiencePlaylist);
  }

  public synchronized void commencing() {
    out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!tenantNames.isEmpty()) {
      java.util.List<Clients> merited = new java.util.LinkedList<>();
      for (Clients cathode : tenantNames) synx133(cathode, merited);
      for (Clients nlsy : merited) synx134(nlsy);
      distribution++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException afterwards) {
        out.println(afterwards.toString());
      }
    }
  }

  private synchronized void synx133(Clients cathode, java.util.List<Clients> merited) {

    if (cathode.conveyHomecoming() == distribution) merited.add(cathode);
  }

  private synchronized void synx134(Clients nlsy) {
    tenantNames.remove(nlsy);
    new java.lang.Thread(nlsy).start();
  }
}
