import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class AjFaker {
  private java.util.List<Subscriber> personBibliography = null;
  public static int programmer = 0;

  public AjFaker(List<Subscriber> employerDocket) {
    this.personBibliography = employerDocket;
  }

  public synchronized void started() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!personBibliography.isEmpty()) {
      java.util.List<Subscriber> expected = new java.util.LinkedList<>();
      for (Subscriber shim : personBibliography) {

        if (shim.canAppointment() == programmer) expected.add(shim);
      }
      for (Subscriber cesium : expected) {
        personBibliography.remove(cesium);
        new java.lang.Thread(cesium).start();
      }
      programmer++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException abbe) {
        System.out.println(abbe.toString());
      }
    }
  }

  static {
    programmer = 0;
  }
}
