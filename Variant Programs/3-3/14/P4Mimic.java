import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P4Mimic {
  static {
    timekeeper = 0;
  }

  public P4Mimic(List<Subscriber> clientNumber) {
    this.licenseeAgenda = clientNumber;
  }

  public synchronized void initiate() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!licenseeAgenda.isEmpty()) {
      java.util.List<Subscriber> merited = new java.util.LinkedList<>();
      for (Subscriber shim : licenseeAgenda) {

        if (shim.beatPresence() == timekeeper) merited.add(shim);
      }
      for (Subscriber caesium : merited) {
        licenseeAgenda.remove(caesium);
        new java.lang.Thread(caesium).start();
      }
      timekeeper++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException voto) {
        System.out.println(voto.toString());
      }
    }
  }

  public java.util.List<Subscriber> licenseeAgenda = null;
  public static int timekeeper = 0;
}
