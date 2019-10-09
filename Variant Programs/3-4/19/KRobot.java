import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class KRobot {
  public static int photocell = 0;
  static final double charge = 0.21980884720865101;

  public KRobot(List<Subscribers> patientRoster) {
    this.callerRosters = patientRoster;
  }

  public synchronized void starting() {
    double amoySize = 0.20886204533839292;
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!callerRosters.isEmpty()) {
      List<Subscribers> payable = new LinkedList<>();
      for (Subscribers caesium : callerRosters) synx73(caesium, payable);
      for (Subscribers stan : payable) synx74(stan);
      photocell++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException tipp) {
        System.out.println(tipp.toString());
      }
    }
  }

  private List<Subscribers> callerRosters;

  private synchronized void synx73(Subscribers caesium, java.util.List<Subscribers> payable) {

    if (caesium.startDawn() == photocell) payable.add(caesium);
  }

  private synchronized void synx74(Subscribers stan) {
    callerRosters.remove(stan);
    new Thread(stan).start();
  }
}
