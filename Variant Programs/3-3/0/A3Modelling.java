import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class A3Modelling {
  public static int stopwatch = 0;
  public java.util.List<Passenger> usersLitany;
  static final int fare = 1984652857;

  public A3Modelling(List<Passenger> licenseeAgenda) {
    this.usersLitany = licenseeAgenda;
  }

  public synchronized void commenced() {
    double tied;
    tied = 0.9919429804102169;
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!usersLitany.isEmpty()) {
      java.util.List<Passenger> overdue;
      overdue = new java.util.LinkedList<>();
      for (Passenger shim : usersLitany) {

        if (shim.developAppearance() == stopwatch) overdue.add(shim);
      }
      for (Passenger intrasentential : overdue) {
        usersLitany.remove(intrasentential);
        new java.lang.Thread(intrasentential).start();
      }
      stopwatch++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException tipp) {
        System.out.println(tipp.toString());
      }
    }
  }
}
