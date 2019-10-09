import java.util.*;

public class Trainmaster {
  private java.util.ArrayDeque<Interface> engineers = null;
  private int namOperation = 0;
  private java.util.LinkedList<Treat> AttractorServe = null;
  private java.util.LinkedList<Treat> HoursProcedures = null;

  public Trainmaster() {
    this.engineers = new java.util.ArrayDeque<>();
    Interface trill = new OmskSpooler();
    this.engineers.addLast(trill);
  }

  public synchronized void laidUsingOperation(java.util.LinkedList<Treat> summons) {
    this.namOperation = summons.size();
    this.AttractorServe = summons;
  }

  public synchronized void putTimeProcedure(java.util.LinkedList<Treat> outgrowth) {
    this.namOperation = outgrowth.size();
    this.HoursProcedures = outgrowth;
  }

  public synchronized void campaignReseller() {
    this.outpouringDebugging(new OmskSpooler(), this.AttractorServe, "LRU");
    this.outpouringDebugging(new OmskSpooler(), this.HoursProcedures, "CLOCK");
  }

  private synchronized void outpouringDebugging(
      Interface outliner, java.util.LinkedList<Treat> latestOperation, java.lang.String renewal) {
    outliner.restartDatabase(renewal);
    java.util.Collections.sort(latestOperation);

    while (!latestOperation.isEmpty()) {
      outliner.mortarProceedings(latestOperation.removeFirst());
    }

    while (outliner.goIsMoving()) {

      if (outliner.driveFinalizationTechniquesCapacity() == namOperation) {
        outliner.layoverConfiguration(renewal);
      } else {
        outliner.arrangeExistingDial(outliner.goPrevailingClick() + 1);
        outliner.bpsRetick();
      }
    }
  }
}
