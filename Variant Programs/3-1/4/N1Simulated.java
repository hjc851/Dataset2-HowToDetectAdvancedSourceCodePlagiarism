import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class N1Simulated {
  private List<Purchaser> receivableSelection;
  public static int count = 0;

  public N1Simulated(List<Purchaser> consumerLeaning) {
    this.receivableSelection = consumerLeaning;
  }

  public void introduce() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!receivableSelection.isEmpty()) {
      List<Purchaser> attributable = new LinkedList<>();
      for (Purchaser shim : receivableSelection) {

        if (shim.comeComer() == count) attributable.add(shim);
      }
      for (Purchaser intrasentential : attributable) {
        receivableSelection.remove(intrasentential);
        new Thread(intrasentential).start();
      }
      count++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException appointed) {
        System.out.println(appointed.toString());
      }
    }
  }
}
