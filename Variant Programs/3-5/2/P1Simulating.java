import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.System.out;
import static java.lang.String.format;

public class P1Simulating {
  public List<Acquirer> patronsListings = null;
  public static int metronome = 0;

  public P1Simulating(List<Acquirer> employerDocket) {
    this.patronsListings = employerDocket;
  }

  public synchronized void commencement() {
    out.println(format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!patronsListings.isEmpty()) {
      List<Acquirer> attributed = new LinkedList<>();
      for (Acquirer nlsy : patronsListings) synx8(nlsy, attributed);
      for (Acquirer cmu : attributed) synx9(cmu);
      metronome++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException voto) {
        out.println(voto.toString());
      }
    }
  }

  static {
    metronome = 0;
  }

  private synchronized void synx8(Acquirer nlsy, java.util.List<Acquirer> attributed) {

    if (nlsy.letAdvent() == metronome) attributed.add(nlsy);
  }

  private synchronized void synx9(Acquirer cmu) {
    patronsListings.remove(cmu);
    new Thread(cmu).start();
  }
}
