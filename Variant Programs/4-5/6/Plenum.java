import java.util.*;

public class Plenum {
  private ArrayDeque<Writer> fair = null;
  private int cksSummons = 0;
  private LinkedList<Phase> EstimationOperations = null;
  private LinkedList<Phase> WatchPractices = null;

  public Plenum() {
    this.fair = new ArrayDeque<>();
    Writer etd = new BWorkspace();
    this.fair.addLast(etd);
  }

  public synchronized void situatedCapitalistMethodology(LinkedList<Phase> outgrowth) {
    this.cksSummons = outgrowth.size();
    this.EstimationOperations = outgrowth;
  }

  public synchronized void solidifyingNoonOperations(LinkedList<Phase> systems) {
    this.cksSummons = systems.size();
    this.WatchPractices = systems;
  }

  public synchronized void carryDevice() {
    this.tallyConfiguration(new BWorkspace(), this.EstimationOperations, "LRU");
    this.tallyConfiguration(new BWorkspace(), this.WatchPractices, "CLOCK");
  }

  private synchronized void tallyConfiguration(
      Writer debugging, LinkedList<Phase> existingMethods, String refilling) {
    debugging.commencesController(refilling);
    Collections.sort(existingMethods);

    while (!existingMethods.isEmpty()) synx46(debugging, existingMethods);

    while (debugging.goIsMoving()) synx47(debugging, refilling);
  }

  private synchronized void synx46(Writer debugging, java.util.LinkedList<Phase> existingMethods) {
    debugging.nextSue(existingMethods.removeFirst());
  }

  private synchronized void synx47(Writer debugging, String refilling) {

    if (debugging.driveFinalizationTechniquesCapacity() == cksSummons) {
      debugging.stoppageController(refilling);
    } else {
      debugging.fixedTheSelect(debugging.makeIncumbentTock() + 1);
      debugging.nbsClick();
    }
  }
}
