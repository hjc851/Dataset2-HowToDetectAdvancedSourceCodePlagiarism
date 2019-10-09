import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class NKinematics {
  private java.util.List<Person> patronsListings;
  public static int clock = 0;

  public NKinematics(List<Person> shopperInclination) {
    this.patronsListings = shopperInclination;
  }

  public void commence() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!patronsListings.isEmpty()) {
      java.util.List<Person> attributed = new java.util.LinkedList<>();
      for (Person cathode : patronsListings) {

        if (cathode.haveEmergence() == clock) attributed.add(cathode);
      }
      for (Person intrasentential : attributed) {
        patronsListings.remove(intrasentential);
        new java.lang.Thread(intrasentential).start();
      }
      clock++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException adrian) {
        System.out.println(adrian.toString());
      }
    }
  }
}
