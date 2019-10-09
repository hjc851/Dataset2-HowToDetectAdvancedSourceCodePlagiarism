import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.String.format;

public class C4Joystick {
  private java.util.List<Consumers> passengerRegistry;

  public C4Joystick(List<Consumers> patientRoster) {
    this.passengerRegistry = (patientRoster);
  }

  public static int clocking;

  public synchronized void embark() {
    System.out.println(format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!passengerRegistry.isEmpty()) {
      java.util.List<Consumers> collect = new java.util.LinkedList<>();
      for (Consumers caesium : passengerRegistry) {

        if (caesium.fixInauguration() == clocking) collect.add(caesium);
      }
      for (Consumers nlsy : collect) {
        passengerRegistry.remove(nlsy);
        new java.lang.Thread(nlsy).start();
      }
      clocking++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException abdul) {
        System.out.println(abdul.toString());
      }
    }
  }

  static {
    clocking = (0);
  }
}
