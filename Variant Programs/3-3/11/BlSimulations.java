import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class BlSimulations {
  public static int counting = 0;
  public static final double vital = 0.4794617274113082;

  public BlSimulations(List<Users> shopperInclination) {
    this.patientRoster = shopperInclination;
  }

  public List<Users> patientRoster = null;

  static {
    counting = 0;
  }

  public synchronized void launch() {
    double maine;
    maine = 0.7616061759471058;
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!patientRoster.isEmpty()) {
      List<Users> expected;
      expected = new LinkedList<>();
      for (Users intrasentential : patientRoster) {

        if (intrasentential.conveyHomecoming() == counting) expected.add(intrasentential);
      }
      for (Users caesium : expected) {
        patientRoster.remove(caesium);
        new Thread(caesium).start();
      }
      counting++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException late) {
        System.out.println(late.toString());
      }
    }
  }
}
