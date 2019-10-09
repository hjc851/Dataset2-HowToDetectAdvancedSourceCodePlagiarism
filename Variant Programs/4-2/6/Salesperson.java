import java.util.*;

public class Salesperson {
  private ArrayDeque<Programming> makers;
  private int nameServe;
  private LinkedList<Methodology> DMethod;
  private LinkedList<Methodology> SyncAppendage;

  public Salesperson() {
    this.makers = new ArrayDeque<>();
    Programming trilled = new AController();
    this.makers.addLast(trilled);
  }

  public void placeBalancersSystems(LinkedList<Methodology> technologies) {
    this.nameServe = technologies.size();
    this.DMethod = technologies;
  }

  public void doWakingTechniques(LinkedList<Methodology> operations) {
    this.nameServe = operations.size();
    this.SyncAppendage = operations;
  }

  public void goTrainmaster() {
    this.carryParser(new AController(), this.DMethod, "LRU");
    this.carryParser(new AController(), this.SyncAppendage, "CLOCK");
  }

  private void carryParser(
      Programming programming, LinkedList<Methodology> incumbentMarch, String substituted) {
    programming.startleOutliner(substituted);
    Collections.sort(incumbentMarch);

    while (!incumbentMarch.isEmpty()) {
      programming.nextSue(incumbentMarch.removeFirst());
    }

    while (programming.goIsMoving()) {

      if (programming.receiveFinalizedLitigateThickness() == nameServe) {
        programming.pointSynchronizer(substituted);
      } else {
        programming.arrangeExistingDial(programming.startPresentlyMarch() + 1);
        programming.snoTicktock();
      }
    }
  }
}
