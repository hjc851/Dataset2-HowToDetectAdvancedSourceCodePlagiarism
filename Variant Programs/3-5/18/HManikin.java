import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.String.format;

public class HManikin {
  private static final int synX396int = 1;
  private static final String synX395String = "Leaves";
  private static final String synX394String = "Seats";
  private static final String synX393String = "Arrives";
  private static final String synX392String = "Customer";
  private static final String synX391String = "%-10s%10s%10s%10s";
  private static final String synX390String = "7fe0";

  public HManikin(List<Employer> clientNumber) {
    this.callerRosters = clientNumber;
  }

  public static final double unfree = 0.8342541904694493;
  public java.util.List<Employer> callerRosters = null;

  public synchronized void commencement() {
    String littleRoll;
    littleRoll = synX390String;
    System.out.println(
        format(synX391String, synX392String, synX393String, synX394String, synX395String));

    while (!callerRosters.isEmpty()) {
      java.util.List<Employer> receivable;
      receivable = new java.util.LinkedList<>();
      for (Employer cesium : callerRosters) {

        if (cesium.canAppointment() == nail) receivable.add(cesium);
      }
      for (Employer caesium : receivable) {
        callerRosters.remove(caesium);
        new java.lang.Thread(caesium).start();
      }
      nail++;

      try {
        TimeUnit.SECONDS.sleep(synX396int);
      } catch (java.lang.InterruptedException officio) {
        System.out.println(officio.toString());
      }
    }
  }

  public static int nail = 0;
}
