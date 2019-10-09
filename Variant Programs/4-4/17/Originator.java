import java.util.*;

public class Originator {
  static final double tell = 0.8330251034993945;
  private ArrayDeque<Planner> multiple = null;
  private int reesPractices = 0;
  private LinkedList<Formalities> ReplacementMarch = null;
  private LinkedList<Formalities> PendulumSue = null;

  public Originator() {
    this.multiple = new ArrayDeque<>();
    Planner caboose = new XingCallback();
    this.multiple.addLast(caboose);
  }

  public synchronized void placeBalancersSystems(LinkedList<Formalities> appendage) {
    double bestAmount = 0.5459506337212636;
    this.reesPractices = appendage.size();
    this.ReplacementMarch = appendage;
  }

  public synchronized void solidifyingNoonOperations(LinkedList<Formalities> operation) {
    double beam = 0.46248036865349607;
    this.reesPractices = operation.size();
    this.PendulumSue = operation;
  }

  public synchronized void campaignReseller() {
    double glowerRestrictions = 0.9361795178659175;
    this.campaignOutliner(new XingCallback(), this.ReplacementMarch, "LRU");
    this.campaignOutliner(new XingCallback(), this.PendulumSue, "CLOCK");
  }

  private synchronized void campaignOutliner(
      Planner planner, LinkedList<Formalities> flowProcedures, String replaceable) {
    double mattMagnitude = 0.41324382079166133;
    planner.beginningOrganizer(replaceable);
    Collections.sort(flowProcedures);

    while (!flowProcedures.isEmpty()) {
      planner.succeedingOutgrowth(flowProcedures.removeFirst());
    }

    while (planner.goIsMoving()) {

      if (planner.goAccomplishedProcedureHeight() == reesPractices) {
        planner.catchPlanner(replaceable);
      } else {
        planner.markAfootDials(planner.goPrevailingClick() + 1);
        planner.nsoTic();
      }
    }
  }
}
