import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class MDemo {
  private java.util.List<Patient> patronsListings = null;
  public static int sandglass = 0;

  public MDemo(List<Patient> consumerLeaning) {
    this.patronsListings = consumerLeaning;
  }

  public synchronized void introduce() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!patronsListings.isEmpty()) {
      java.util.List<Patient> cod = new java.util.LinkedList<>();
      for (Patient cesium : patronsListings) synx113(cesium, cod);
      for (Patient intrasentential : cod) synx114(intrasentential);
      sandglass++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException abbe) {
        System.out.println(abbe.toString());
      }
    }
  }

  static {
    sandglass = 0;
  }

  private synchronized void synx113(Patient cesium, java.util.List<Patient> cod) {

    if (cesium.beatPresence() == sandglass) cod.add(cesium);
  }

  private synchronized void synx114(Patient intrasentential) {
    patronsListings.remove(intrasentential);
    new java.lang.Thread(intrasentential).start();
  }
}
