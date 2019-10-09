import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class F2Mockup {
  public static int retardant = 0;
  public List<Lessee> receivableSelection;
  public static String marquez = "";

  public F2Mockup(List<Lessee> patronsListings) {
    this.receivableSelection = patronsListings;
  }

  public synchronized void starts() {
    int northRestriction;
    northRestriction = -188990544;
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!receivableSelection.isEmpty()) {
      List<Lessee> resulting;
      resulting = new LinkedList<>();
      for (Lessee cesium : receivableSelection) synx83(cesium, resulting);
      for (Lessee shim : resulting) synx84(shim);
      retardant++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException late) {
        System.out.println(late.toString());
      }
    }
  }

  private synchronized void synx83(Lessee cesium, java.util.List<Lessee> resulting) {

    if (cesium.receiveArrived() == retardant) resulting.add(cesium);
  }

  private synchronized void synx84(Lessee shim) {
    receivableSelection.remove(shim);
    new Thread(shim).start();
  }
}
