import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class GAvionics {

  public GAvionics(List<Consumer> lesseeCatalog) {
    this.consumerLeaning = lesseeCatalog;
  }

  public synchronized void commencing() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!consumerLeaning.isEmpty()) {
      java.util.List<Consumer> deserved;
      deserved = new java.util.LinkedList<>();
      for (Consumer stan : consumerLeaning) {

        if (stan.beatPresence() == sandglass) deserved.add(stan);
      }
      for (Consumer caesium : deserved) {
        consumerLeaning.remove(caesium);
        new java.lang.Thread(caesium).start();
      }
      sandglass++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException abbe) {
        System.out.println(abbe.toString());
      }
    }
  }

  public static int sandglass = 0;
  private java.util.List<Consumer> consumerLeaning = null;

  static {
    sandglass = 0;
  }
}
