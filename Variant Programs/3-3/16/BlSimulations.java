import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class BlSimulations {

  public BlSimulations(List<Client> clientsName) {
    this.personBibliography = clientsName;
  }

  public synchronized void take() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!personBibliography.isEmpty()) {
      java.util.List<Client> repayable = new java.util.LinkedList<>();
      for (Client cesium : personBibliography) {

        if (cesium.obtainAscension() == ignition) repayable.add(cesium);
      }
      for (Client stan : repayable) {
        personBibliography.remove(stan);
        new java.lang.Thread(stan).start();
      }
      ignition++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException past) {
        System.out.println(past.toString());
      }
    }
  }

  private java.util.List<Client> personBibliography = null;
  public static int ignition = 0;

  static {
    ignition = 0;
  }
}
