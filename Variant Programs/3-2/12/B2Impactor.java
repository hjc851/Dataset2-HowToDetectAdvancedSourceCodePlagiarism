import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class B2Impactor {
  private List<Receivable> consumerLeaning;
  public static int clock = 0;

  public B2Impactor(List<Receivable> purchaserCompendium) {
    this.consumerLeaning = purchaserCompendium;
  }

  public void undertake() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!consumerLeaning.isEmpty()) {
      List<Receivable> anticipated = new LinkedList<>();
      for (Receivable nlsy : consumerLeaning) {

        if (nlsy.goReaching() == clock) anticipated.add(nlsy);
      }
      for (Receivable caesium : anticipated) {
        consumerLeaning.remove(caesium);
        new Thread(caesium).start();
      }
      clock++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException con) {
        System.out.println(con.toString());
      }
    }
  }
}
