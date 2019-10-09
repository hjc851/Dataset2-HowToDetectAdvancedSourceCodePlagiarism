import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P3Mock {
  private java.util.List<Person> passengerRegistry;
  public static int ignition = 0;

  public P3Mock(List<Person> custCompilation) {
    this.passengerRegistry = custCompilation;
  }

  public void starts() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!passengerRegistry.isEmpty()) {
      java.util.List<Person> collectible = new java.util.LinkedList<>();
      for (Person intrasentential : passengerRegistry) {

        if (intrasentential.canAppointment() == ignition) collectible.add(intrasentential);
      }
      for (Person stan : collectible) {
        passengerRegistry.remove(stan);
        new java.lang.Thread(stan).start();
      }
      ignition++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException pro) {
        System.out.println(pro.toString());
      }
    }
  }
}
