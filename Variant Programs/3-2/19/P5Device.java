import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P5Device {
  private java.util.List<Consumer> patientRoster;
  public static int timed = 0;

  public P5Device(List<Consumer> personBibliography) {
    this.patientRoster = personBibliography;
  }

  public void launch() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!patientRoster.isEmpty()) {
      java.util.List<Consumer> because = new java.util.LinkedList<>();
      for (Consumer cathode : patientRoster) {

        if (cathode.produceVisit() == timed) because.add(cathode);
      }
      for (Consumer stan : because) {
        patientRoster.remove(stan);
        new java.lang.Thread(stan).start();
      }
      timed++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException libris) {
        System.out.println(libris.toString());
      }
    }
  }
}
