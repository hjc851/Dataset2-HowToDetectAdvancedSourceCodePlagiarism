import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class B2Impactor {
  public static int timekeeper = 0;
  public List<Consumer> consumerLeaning = null;

  public B2Impactor(List<Consumer> usersLitany) {
    this.consumerLeaning = usersLitany;
  }

  public synchronized void commence() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!consumerLeaning.isEmpty()) {
      List<Consumer> payable;
      payable = new LinkedList<>();
      for (Consumer caesium : consumerLeaning) {

        if (caesium.letAdvent() == timekeeper) payable.add(caesium);
      }
      for (Consumer nlsy : payable) {
        consumerLeaning.remove(nlsy);
        new Thread(nlsy).start();
      }
      timekeeper++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException con) {
        System.out.println(con.toString());
      }
    }
  }
}
