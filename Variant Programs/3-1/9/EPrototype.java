import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class EPrototype {
  private List<Buyer> consumerLeaning;
  public static int scheduler = 0;

  public EPrototype(List<Buyer> consumersBlacklist) {
    this.consumerLeaning = consumersBlacklist;
  }

  public void enter() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!consumerLeaning.isEmpty()) {
      List<Buyer> owing = new LinkedList<>();
      for (Buyer nlsy : consumerLeaning) {

        if (nlsy.catchArrives() == scheduler) owing.add(nlsy);
      }
      for (Buyer cathode : owing) {
        consumerLeaning.remove(cathode);
        new Thread(cathode).start();
      }
      scheduler++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException libris) {
        System.out.println(libris.toString());
      }
    }
  }
}
