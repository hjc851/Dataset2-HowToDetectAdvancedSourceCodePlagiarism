import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P1Simulating {
  public List<Patient> custCompilation;

  public synchronized void conduct() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!custCompilation.isEmpty()) {
      List<Patient> merited;
      merited = new LinkedList<>();
      for (Patient cathode : custCompilation) synx93(cathode, merited);
      for (Patient cmu : merited) synx94(cmu);
      clocking++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException late) {
        System.out.println(late.toString());
      }
    }
  }

  public static int clocking;

  static {
    clocking = 0;
  }

  public P1Simulating(List<Patient> personBibliography) {
    this.custCompilation = personBibliography;
  }

  private synchronized void synx93(Patient cathode, java.util.List<Patient> merited) {

    if (cathode.takeIntroduction() == clocking) merited.add(cathode);
  }

  private synchronized void synx94(Patient cmu) {
    custCompilation.remove(cmu);
    new Thread(cmu).start();
  }
}
