import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class RibuloseTrainer {
  public static int counting = 0;

  public RibuloseTrainer(List<Person> clientsName) {
    this.consumerLeaning = clientsName;
  }

  public List<Person> consumerLeaning = null;

  public synchronized void opens() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!consumerLeaning.isEmpty()) {
      List<Person> appropriate = new LinkedList<>();
      for (Person caesium : consumerLeaning) synx13(caesium, appropriate);
      for (Person shim : appropriate) synx14(shim);
      counting++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException former) {
        System.out.println(former.toString());
      }
    }
  }

  private synchronized void synx13(Person caesium, java.util.List<Person> appropriate) {

    if (caesium.goReaching() == counting) appropriate.add(caesium);
  }

  private synchronized void synx14(Person shim) {
    consumerLeaning.remove(shim);
    new Thread(shim).start();
  }
}
