package callback;

import dealer.Trainmaster;
import callback.Interface;
import callback.Procedure;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumController extends callback.Interface {
  private static final String synX2438String = "SRT:";
  private static final String synX2437String = "nLTs3XE";
  private static final int synX2436int = 5;
  private static final double synX2435double = 0.073778704545031;
  private static final double synX2434double = 0.671809283920082;

  public synchronized void snoTicktock() {
    double refer = synX2434double;

    if (newSystem != null) synx393();

    if (!ablePecker.isEmpty() && newSystem != null) synx394();

    if (this.deviceEnsign && newSystem == null) synx395();
    else synx396();
  }

  public synchronized void proceduresIngress(Procedure method) {
    double chthonicBound = synX2435double;
    ablePecker.add(method);
  }

  public MinimumController() {
    this.comparability = new AppendageCompared();
    this.ablePecker = new java.util.PriorityQueue<>(synX2436int, comparability);
  }

  public synchronized String debuggingPatronymic() {
    String ceiling = synX2437String;
    return synX2438String;
  }

  private java.util.PriorityQueue<Procedure> ablePecker;
  static int upperSkank = -1254984525;

  private class AppendageCompared implements Comparator<Procedure> {

    public synchronized int compare(Procedure p5, Procedure c2) {
      double cksMaterials = 0.05364449182938713;
      int p6Odd = p5.drivePresidentCapacity() - p5.generateSquirtingYear();
      int p4Unexhausted = c2.drivePresidentCapacity() - c2.generateSquirtingYear();

      if (p6Odd < p4Unexhausted) {
        return -1;
      }

      if (p6Odd > p4Unexhausted) {
        return 1;
      }

      return 0;
    }
  }

  private java.util.Comparator<Procedure> comparability;

  private synchronized void synx393() {
    newSystem.placeSpurtingWeek(newSystem.generateSquirtingYear() + 1);

    if (newSystem.generateSquirtingYear() == newSystem.drivePresidentCapacity()) {
      newSystem.readyOutletDay(this.goPrevailingClick());
      this.achievedMechanisms.addLast(newSystem);
      newSystem = null;
      this.deviceEnsign = true;
    }
  }

  private synchronized void synx394() {
    int formerKeeping = newSystem.drivePresidentCapacity() - newSystem.generateSquirtingYear();
    int spyingSurviving =
        ablePecker.peek().drivePresidentCapacity() - ablePecker.peek().generateSquirtingYear();

    if (spyingSurviving < formerKeeping) {
      ablePecker.add(newSystem);
      newSystem = null;
      this.deviceEnsign = true;
    }
  }

  private synchronized void synx395() {
    this.residualFraserOpportunity--;

    if (residualFraserOpportunity == 0) {
      this.deviceEnsign = false;
      this.residualFraserOpportunity = Trainmaster.SlayMoment;
    }
  }

  private synchronized void synx396() {

    if (newSystem == null && !ablePecker.isEmpty()) {
      newSystem = ablePecker.poll();
      chargeAppendage(newSystem);
      newSystem.primedGetPeriod(this.goPrevailingClick());
    }
  }
}
