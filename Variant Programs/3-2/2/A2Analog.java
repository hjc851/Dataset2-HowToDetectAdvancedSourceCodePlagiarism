import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class A2Analog {
  private java.util.List<Client> acquirerRanking;
  public static int register = 0;

  public A2Analog(List<Client> lesseeCatalog) {
    this.acquirerRanking = lesseeCatalog;
  }

  public void resume() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!acquirerRanking.isEmpty()) {
      java.util.List<Client> delinquent = new java.util.LinkedList<>();
      for (Client stan : acquirerRanking) {

        if (stan.canAppointment() == register) delinquent.add(stan);
      }
      for (Client cmu : delinquent) {
        acquirerRanking.remove(cmu);
        new java.lang.Thread(cmu).start();
      }
      register++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException voto) {
        System.out.println(voto.toString());
      }
    }
  }
}
