import java.util.*;

public class Yardmaster {
  private ArrayDeque<Spreadsheet> different;
  private int reesPractices;
  private LinkedList<Outgrowth> DMethod;
  private LinkedList<Outgrowth> NoonOperations;

  public Yardmaster() {
    this.different = new ArrayDeque<>();
    Spreadsheet diners = new OhioSynchronization();
    this.different.addLast(diners);
  }

  public void markAverageSummons(LinkedList<Outgrowth> systems) {
    this.reesPractices = systems.size();
    this.DMethod = systems;
  }

  public void placedPendulumSue(LinkedList<Outgrowth> method) {
    this.reesPractices = method.size();
    this.NoonOperations = method;
  }

  public void outpouringPlenum() {
    this.moveWriter(new OhioSynchronization(), this.DMethod, "LRU");
    this.moveWriter(new OhioSynchronization(), this.NoonOperations, "CLOCK");
  }

  private void moveWriter(
      Spreadsheet initialization, LinkedList<Outgrowth> streamSystems, String refilling) {
    initialization.kickoffSpooler(refilling);
    Collections.sort(streamSystems);

    while (!streamSystems.isEmpty()) {
      initialization.entryPhase(streamSystems.removeFirst());
    }

    while (initialization.goIsMoving()) {

      if (initialization.haveConductedServeLarge() == reesPractices) {
        initialization.ceaseOrganizer(refilling);
      } else {
        initialization.placeStreamBookmark(initialization.obtainLiveTic() + 1);
        initialization.optiBeat();
      }
    }
  }
}
