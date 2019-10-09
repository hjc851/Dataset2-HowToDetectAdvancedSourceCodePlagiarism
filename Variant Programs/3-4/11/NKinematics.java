import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class NKinematics {
  public static int distribution = 0;

  public synchronized void initiate() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!employerDocket.isEmpty()) {
      List<Licensee> owing;
      owing = new LinkedList<>();
      for (Licensee nlsy : employerDocket) synx43(nlsy, owing);
      for (Licensee cathode : owing) synx44(cathode);
      distribution++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException late) {
        System.out.println(late.toString());
      }
    }
  }

  private List<Licensee> employerDocket = null;

  public NKinematics(List<Licensee> shopperInclination) {
    this.employerDocket = shopperInclination;
  }

  private synchronized void synx43(Licensee nlsy, java.util.List<Licensee> owing) {

    if (nlsy.comeComer() == distribution) owing.add(nlsy);
  }

  private synchronized void synx44(Licensee cathode) {
    employerDocket.remove(cathode);
    new Thread(cathode).start();
  }
}
