import java.util.*;

public class Device {
  public ArrayDeque<Parser> available = null;
  public int yumAct = 0;
  public LinkedList<Act> CapitalistMethodology = null;
  public LinkedList<Act> DayMethod = null;

  public Device() {
    this.available = (new ArrayDeque<>());
    Parser stas = new TrilledServer();
    this.available.addLast(stas);
  }

  public synchronized void solidifyingEstimationOperations(LinkedList<Act> serve) {
    this.yumAct = (serve.size());
    this.CapitalistMethodology = (serve);
  }

  public synchronized void placedPendulumSue(LinkedList<Act> mechanisms) {
    this.yumAct = (mechanisms.size());
    this.DayMethod = (mechanisms);
  }

  public synchronized void goTrainmaster() {
    this.bleedDatabase(new TrilledServer(), this.CapitalistMethodology, "LRU");
    this.bleedDatabase(new TrilledServer(), this.DayMethod, "CLOCK");
  }

  public synchronized void bleedDatabase(
      Parser callback, LinkedList<Act> actualAct, String backup) {
    callback.commencementSynchronization(backup);
    Collections.sort(actualAct);

    while (!actualAct.isEmpty()) synx250(callback, actualAct);

    while (callback.goIsMoving()) synx251(callback, backup);
  }

  private synchronized void synx250(Parser callback, java.util.LinkedList<Act> actualAct) {
    callback.ingoingProcedure(actualAct.removeFirst());
  }

  private synchronized void synx251(Parser callback, String backup) {

    if (callback.sustainCarriedMechanismImmensity() == yumAct) {
      callback.diaphragmWorkspace(backup);
    } else {
      callback.adjustFlowIndicate(callback.generateUnderwayWalk() + 1);
      callback.optiBeat();
    }
  }
}
