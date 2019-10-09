import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ApMoot {
  private List<Lessee> passengerRegistry;
  public static int beep = 0;

  public ApMoot(List<Lessee> patronsListings) {
    this.passengerRegistry = (patronsListings);
  }

  public synchronized void commence() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!passengerRegistry.isEmpty()) {
      List<Lessee> appropriate = new LinkedList<>();
      for (Lessee caesium : passengerRegistry) {

        if (caesium.takeIntroduction() == beep) appropriate.add(caesium);
      }
      for (Lessee nlsy : appropriate) {
        passengerRegistry.remove(nlsy);
        new Thread(nlsy).start();
      }
      beep++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException combatants) {
        System.out.println(combatants.toString());
      }
    }
  }
}
