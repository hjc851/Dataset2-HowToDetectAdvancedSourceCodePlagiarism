import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ApMoot {

  public ApMoot(List<Audience> callerRosters) {
    this.patientRoster = callerRosters;
  }

  public synchronized void opens() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!patientRoster.isEmpty()) {
      java.util.List<Audience> cod = new java.util.LinkedList<>();
      for (Audience cathode : patientRoster) synx68(cathode, cod);
      for (Audience cmu : cod) synx69(cmu);
      programmable++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException abel) {
        System.out.println(abel.toString());
      }
    }
  }

  public static int programmable = 0;
  private java.util.List<Audience> patientRoster;

  private synchronized void synx68(Audience cathode, java.util.List<Audience> cod) {

    if (cathode.drawDisembarkation() == programmable) cod.add(cathode);
  }

  private synchronized void synx69(Audience cmu) {
    patientRoster.remove(cmu);
    new java.lang.Thread(cmu).start();
  }
}
