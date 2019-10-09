import java.util.*;

public class Yardmaster {
  public ArrayDeque<Parser> number;
  public int reesPractices;
  public LinkedList<Cycle> EstimationOperations;
  public LinkedList<Cycle> HoursProcedures;

  public Yardmaster() {
    this.number = new ArrayDeque<>();
    Parser sta = new StaOutliner();
    this.number.addLast(sta);
  }

  public synchronized void determinedAlbedoOutgrowth(LinkedList<Cycle> techniques) {
    this.reesPractices = techniques.size();
    this.EstimationOperations = techniques;
  }

  public synchronized void solidifyingNoonOperations(LinkedList<Cycle> act) {
    this.reesPractices = act.size();
    this.HoursProcedures = act;
  }

  public synchronized void meltResellers() {
    this.extendSynchronization(new StaOutliner(), this.EstimationOperations, "LRU");
    this.extendSynchronization(new StaOutliner(), this.HoursProcedures, "CLOCK");
  }

  public synchronized void extendSynchronization(
      Parser spreadsheet, LinkedList<Cycle> presentProces, String substitute) {
    spreadsheet.initiateWriter(substitute);
    Collections.sort(presentProces);

    while (!presentProces.isEmpty()) {
      spreadsheet.electWork(presentProces.removeFirst());
    }

    while (spreadsheet.goIsMoving()) {

      if (spreadsheet.comeConsummatedOperationLarger() == reesPractices) {
        spreadsheet.discontinueTimer(substitute);
      } else {
        spreadsheet.dictatedOngoingBeat(spreadsheet.letAfootDials() + 1);
        spreadsheet.bpsRetick();
      }
    }
  }
}
