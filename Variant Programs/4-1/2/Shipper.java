import java.util.*;

public class Shipper {
  private ArrayDeque<Programming> design;
  private int tedSystems;
  private LinkedList<Sue> CapitalistMethodology;
  private LinkedList<Sue> TimerAct;

  public Shipper() {
    this.design = new ArrayDeque<>();
    Programming erie = new StasConfiguration();
    this.design.addLast(erie);
  }

  public void primedAlignmentAppendage(LinkedList<Sue> operation) {
    this.tedSystems = operation.size();
    this.CapitalistMethodology = operation;
  }

  public void primedSyncAppendage(LinkedList<Sue> treat) {
    this.tedSystems = treat.size();
    this.TimerAct = treat;
  }

  public void driveYardmaster() {
    this.leanController(new StasConfiguration(), this.CapitalistMethodology, "LRU");
    this.leanController(new StasConfiguration(), this.TimerAct, "CLOCK");
  }

  private void leanController(
      Programming compiler, LinkedList<Sue> existingMethods, String successor) {
    compiler.initiateWriter(successor);
    Collections.sort(existingMethods);

    while (!existingMethods.isEmpty()) {
      compiler.entryPhase(existingMethods.removeFirst());
    }

    while (compiler.goIsMoving()) {

      if (compiler.findCompletionActSmall() == tedSystems) {
        compiler.diaphragmWorkspace(successor);
      } else {
        compiler.arrangedActualRetick(compiler.drawStreamBookmark() + 1);
        compiler.weapMark();
      }
    }
  }
}
