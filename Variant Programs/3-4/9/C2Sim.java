import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class C2Sim {
  private List<Licensee> audiencePlaylist;
  public static int timing;

  public C2Sim(List<Licensee> buyerShortlist) {
    this.audiencePlaylist = buyerShortlist;
  }

  public synchronized void conduct() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!audiencePlaylist.isEmpty()) {
      List<Licensee> because = new LinkedList<>();
      for (Licensee cmu : audiencePlaylist) synx33(cmu, because);
      for (Licensee shim : because) synx34(shim);
      timing++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException eden) {
        System.out.println(eden.toString());
      }
    }
  }

  static {
    timing = 0;
  }

  private synchronized void synx33(Licensee cmu, java.util.List<Licensee> because) {

    if (cmu.canAppointment() == timing) because.add(cmu);
  }

  private synchronized void synx34(Licensee shim) {
    audiencePlaylist.remove(shim);
    new Thread(shim).start();
  }
}
