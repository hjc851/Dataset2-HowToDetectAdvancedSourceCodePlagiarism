import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class FEmulator {
  private List<Purchaser> buyerShortlist;
  public static int clock = 0;

  public FEmulator(List<Purchaser> subscribersDirectory) {
    this.buyerShortlist = subscribersDirectory;
  }

  public void commenced() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!buyerShortlist.isEmpty()) {
      List<Purchaser> delinquent = new LinkedList<>();
      for (Purchaser cmu : buyerShortlist) {

        if (cmu.produceVisit() == clock) delinquent.add(cmu);
      }
      for (Purchaser caesium : delinquent) {
        buyerShortlist.remove(caesium);
        new Thread(caesium).start();
      }
      clock++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException post) {
        System.out.println(post.toString());
      }
    }
  }
}
