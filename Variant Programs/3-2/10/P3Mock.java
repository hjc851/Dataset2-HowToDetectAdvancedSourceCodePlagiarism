import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P3Mock {
  private List<Acquirer> receivableSelection;
  public static int beep = 0;

  public P3Mock(List<Acquirer> tenantNames) {
    this.receivableSelection = tenantNames;
  }

  public void hold() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!receivableSelection.isEmpty()) {
      List<Acquirer> collectible = new LinkedList<>();
      for (Acquirer caesium : receivableSelection) {

        if (caesium.drawDisembarkation() == beep) collectible.add(caesium);
      }
      for (Acquirer nlsy : collectible) {
        receivableSelection.remove(nlsy);
        new Thread(nlsy).start();
      }
      beep++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException former) {
        System.out.println(former.toString());
      }
    }
  }
}
